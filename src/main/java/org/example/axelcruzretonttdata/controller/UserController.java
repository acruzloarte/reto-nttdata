package org.example.axelcruzretonttdata.controller;


import org.example.axelcruzretonttdata.dto.UserDTO;
import org.example.axelcruzretonttdata.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/api/users")
    public List<UserDTO> getUsers(){
        return userService.getRandomUsers();
    }
}
