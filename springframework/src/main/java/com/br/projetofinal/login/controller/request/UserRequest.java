package com.br.projetofinal.login.controller.request;

import com.br.projetofinal.login.entity.enumerable.UserRole;
import java.util.List;

public record UserRequest(
        String username,
        String password,
        String email,
        String cep,
        List<UserRole> roles
) {
}
