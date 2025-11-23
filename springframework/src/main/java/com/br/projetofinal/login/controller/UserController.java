package com.br.projetofinal.login.controller;

import com.br.projetofinal.login.controller.adapter.UserControllerAdapter;
import com.br.projetofinal.login.controller.request.UserRequest;
import com.br.projetofinal.login.controller.response.UserResponse;
import com.br.projetofinal.login.entity.User;
import com.br.projetofinal.login.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/module2/v1")
public class UserController {

    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/'user/save'")
    public UserResponse save(@RequestBody UserRequest request) {
        User save = repository.save(UserControllerAdapter.cast(request));

        return new UserResponse(
                save.id(),
                save.username(),
                save.email(),
                save.cep(),
                save.roles()
        );
    }
}