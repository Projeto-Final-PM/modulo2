package com.br.projetofinal.login.controller.response;

import com.br.projetofinal.login.entity.enumerable.UserRole;
import java.util.List;

public record UserResponse(
    String id,
    String username,
    String email,
    String cep,
    List<UserRole> roles
) {
}