package com.br.projetofinal.login.repository;

import com.br.projetofinal.login.entity.User;

public interface UserRepository {
    User findByUsername(String username);

    User save(User user);

}
