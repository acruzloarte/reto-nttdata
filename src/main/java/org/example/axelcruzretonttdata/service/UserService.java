package org.example.axelcruzretonttdata.service;

import org.example.axelcruzretonttdata.dto.UserDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class UserService {

    private final WebClient webClient = WebClient.create("https://randomuser.me");

    public List<UserDTO> getRandomUsers() {
        RandomUserResponse response = webClient.get()
                .uri("/api/?results=10")
                .retrieve()
                .bodyToMono(RandomUserResponse.class)
                .block();

        return response.results().stream().map(user -> new UserDTO(
                user.name().first() + " " + user.name().last(),
                user.gender(),
                user.location().country(),
                user.email(),
                user.dob().date(),
                user.picture().medium()
        )).toList();
    }
}
