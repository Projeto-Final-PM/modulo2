package com.br.projetofinal.login.security;

import com.br.projetofinal.login.entity.User;
import com.br.projetofinal.login.repository.UserRepository;
import com.br.projetofinal.login.security.dto.AuthUserDetails;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsSecurity implements UserDetailsService {

    private final UserRepository repository;

    public UserDetailsSecurity(UserRepository repository) {
        this.repository = repository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repository.findByUsername(username);
        return new AuthUserDetails(user);
    }

}
