package ru.netology.springsecurity.Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String wellDone() {
        return "Пользователь авторизировался";
    }

    @GetMapping("/hi")
    public String helloFromWeb() {
        return "Польователь вошел в сеть";
    }
}