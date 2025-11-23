package com.br.projetofinal.login.entity;

import com.br.projetofinal.login.entity.enumerable.UserRole;

import java.util.List;

public record User(
    String id,
    String username,
    String password,
    String email,
    String cep,
    List<UserRole> roles
) {
}