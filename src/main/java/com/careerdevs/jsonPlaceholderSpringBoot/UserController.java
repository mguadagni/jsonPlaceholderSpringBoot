package com.careerdevs.jsonPlaceholderSpringBoot;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @PostMapping ("/ping")
    public String pong () {
        return "pong";
    }

    @GetMapping ("/jsonplaceholder/{id}")
    public Object jphUsers (RestTemplate restTemplate, @PathVariable("id") String userId) {

        Object requestData = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users/" + userId, Object.class);

        return requestData;

    }
}
