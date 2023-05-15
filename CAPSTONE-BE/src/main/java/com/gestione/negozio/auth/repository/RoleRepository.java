package com.gestione.negozio.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestione.negozio.auth.entity.ERole;
import com.gestione.negozio.auth.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
	Optional<Role> findByRoleName(ERole roleName);

}
