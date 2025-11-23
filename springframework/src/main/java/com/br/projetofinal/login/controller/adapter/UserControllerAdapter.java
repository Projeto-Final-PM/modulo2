package com.br.projetofinal.login.controller.adapter;

import com.br.projetofinal.login.controller.request.UserRequest;
import com.br.projetofinal.login.entity.User;
import java.util.UUID;

public class UserControllerAdapter {
    private UserControllerAdapter() {
    }


    public static User cast(UserRequest request) {
        return new User(
                UUID.randomUUID().toString(),
                request.username(),
                request.password(),
                request.email(),
                request.cep(),
                request.roles()
        );
    }
}