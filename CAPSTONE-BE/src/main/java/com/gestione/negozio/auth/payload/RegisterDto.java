package com.gestione.negozio.auth.payload;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDto {
    private String firstname;
    private String lastname;
    private String username;
    private String email;
    private String password;
    private String dataNascita;
    private String indirizzo;
    private String numeroTelefono;
    // Per registrare tutti come USER di Default commentare roles
    private Set<String> roles;
}
