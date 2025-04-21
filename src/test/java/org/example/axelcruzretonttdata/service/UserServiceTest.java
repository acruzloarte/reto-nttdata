package org.example.axelcruzretonttdata.service;

import org.example.axelcruzretonttdata.dto.UserDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void shouldReturnUsers(){
        List<UserDTO> users = userService.getRandomUsers();

        assertNotNull(users);
        assertEquals(10, users.size());

        UserDTO user = users.get(0);
        assertNotNull(user.nombre());
        assertNotNull(user.genero());
        assertNotNull(user.correo());
        assertNotNull(user.ubicacion());
        assertNotNull(user.fechaNacimiento());
        assertNotNull(user.foto());
    }
}
