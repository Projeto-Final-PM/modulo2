package com.br.projetofinal.login.repository.adapter;

import com.br.projetofinal.login.entity.User;
import com.br.projetofinal.login.repository.orm.UserOrm;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserRepositoryImplAdapter {

    private UserRepositoryImplAdapter() {
    }


    public static UserOrm cast(User user) {
        return new UserOrm(
                user.id(),
                user.username(),
                user.password(),
                user.email(),
                user.cep(),
                user.roles());
    }

    public static User cast(UserOrm orm, PasswordEncoder passwordEncoder) {
        return new User(
                orm.id(),
                orm.username(),
                passwordEncoder.encode(orm.password()),
                orm.email(),
                orm.cep(),
                orm.roles()
        );
    }
}
