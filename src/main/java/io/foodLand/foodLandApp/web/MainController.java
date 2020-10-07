package io.foodLand.foodLandApp.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", exposedHeaders = "Authorization")
@RequestMapping("/")
public class MainController {

    @GetMapping
    public String home() {
        return "WELCOME User..........";
    }
}
