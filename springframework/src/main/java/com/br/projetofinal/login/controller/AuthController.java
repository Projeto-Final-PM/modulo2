package com.br.projetofinal.login.controller;

import com.br.projetofinal.login.controller.adapter.UserControllerAdapter;
import com.br.projetofinal.login.controller.request.UserRequest;
import com.br.projetofinal.login.controller.response.AuthResponse;
import com.br.projetofinal.login.entity.Token;
import com.br.projetofinal.login.security.TokenSecurity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/module2/v1")
public class AuthController {

    private final TokenSecurity tokenSecurity;

    public AuthController(TokenSecurity tokenSecurity) {
        this.tokenSecurity = tokenSecurity;
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/auth/login")
    public AuthResponse login(@RequestBody UserRequest request) {
        Token token = tokenSecurity.generate(UserControllerAdapter.cast(request));
        return new AuthResponse(token.value());
    }

}