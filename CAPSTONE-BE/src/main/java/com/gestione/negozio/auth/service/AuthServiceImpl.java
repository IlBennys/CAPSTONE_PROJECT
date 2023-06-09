package com.gestione.negozio.auth.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.gestione.negozio.auth.entity.ERole;
import com.gestione.negozio.auth.entity.Role;
import com.gestione.negozio.auth.entity.User;
import com.gestione.negozio.auth.exception.MyAPIException;
import com.gestione.negozio.auth.payload.LoginDto;
import com.gestione.negozio.auth.payload.RegisterDto;
import com.gestione.negozio.auth.repository.RoleRepository;
import com.gestione.negozio.auth.repository.UserRepository;
import com.gestione.negozio.auth.security.JwtTokenProvider;
import com.gestione.negozio.commerce.model.Carrello;
import com.gestione.negozio.commerce.repository.CarrelloDao;

@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    private CarrelloDao carrelloDao;

    @Autowired
    @Qualifier("FakeCarrello")
    private ObjectProvider<Carrello> objCarrello;

    private AuthenticationManager authenticationManager;
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;
    private JwtTokenProvider jwtTokenProvider;

    public AuthServiceImpl(AuthenticationManager authenticationManager, UserRepository userRepository,
	    RoleRepository roleRepository, PasswordEncoder passwordEncoder, JwtTokenProvider jwtTokenProvider) {
	this.authenticationManager = authenticationManager;
	this.userRepository = userRepository;
	this.roleRepository = roleRepository;
	this.passwordEncoder = passwordEncoder;
	this.jwtTokenProvider = jwtTokenProvider;
    }

    @Override
    public String login(LoginDto loginDto) {

	Authentication authentication = authenticationManager
		.authenticate(new UsernamePasswordAuthenticationToken(loginDto.getUsername(), loginDto.getPassword()));

	SecurityContextHolder.getContext().setAuthentication(authentication);

	String token = jwtTokenProvider.generateToken(authentication);

	return token;
    }

    @Override
    public String register(RegisterDto registerDto) {

	// add check for username exists in database
	if (userRepository.existsByUsername(registerDto.getUsername())) {
	    throw new MyAPIException(HttpStatus.BAD_REQUEST, "Username is already exists!.");
	}

	// add check for email exists in database
	if (userRepository.existsByEmail(registerDto.getEmail())) {
	    throw new MyAPIException(HttpStatus.BAD_REQUEST, "Email is already exists!.");
	}

	User user = new User();
	user.setFirstname(registerDto.getFirstname());
	user.setLastname(registerDto.getLastname());
	user.setUsername(registerDto.getUsername());
	user.setEmail(registerDto.getEmail());
	user.setPassword(passwordEncoder.encode(registerDto.getPassword()));
	user.setDataNascita(registerDto.getDataNascita());
	user.setIndirizzo(registerDto.getIndirizzo());
	user.setNumeroTelefono(registerDto.getNumeroTelefono());

	Set<Role> roles = new HashSet<>();

	// Per registrare tutti come USER di Default commentare IF
	if (registerDto.getRoles() != null) {
	    registerDto.getRoles().forEach(role -> {
		Role userRole = roleRepository.findByRoleName(getRole(role)).get();
		roles.add(userRole);
	    });
	} else {
	    Role userRole = roleRepository.findByRoleName(ERole.ROLE_USER).get();
	    roles.add(userRole);
	}

	user.setRoles(roles);
	Carrello c = objCarrello.getObject();
	carrelloDao.save(c);
	user.setCarrello(c);
	System.out.println(user);
	userRepository.save(user);

	return "User registered successfully!";
    }

    public ERole getRole(String role) {
	if (role.equals("ROLE_ADMIN"))
	    return ERole.ROLE_ADMIN;
	else
	    return ERole.ROLE_USER;
    }
}