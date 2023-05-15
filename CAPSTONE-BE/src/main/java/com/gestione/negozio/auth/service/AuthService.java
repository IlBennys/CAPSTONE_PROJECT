package com.gestione.negozio.auth.service;

import com.gestione.negozio.auth.payload.LoginDto;
import com.gestione.negozio.auth.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
