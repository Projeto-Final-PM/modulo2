package com.br.projetofinal.login.repository.client;

import com.br.projetofinal.login.repository.orm.UserOrm;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepositoryWithMongodb extends MongoRepository<UserOrm, String> {
    Optional<UserOrm> findByUsername(String username);
}
