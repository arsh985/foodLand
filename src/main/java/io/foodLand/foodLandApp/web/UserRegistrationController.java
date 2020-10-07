package io.foodLand.foodLandApp.web;

import io.foodLand.foodLandApp.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/register")
@CrossOrigin(origins = "*", allowedHeaders = "*", exposedHeaders = "Authorization")
public class UserRegistrationController {

    private UserService userService;

    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public String addUser(@RequestBody UserRegistrationDao userRegistrationDao){
            userService.save(userRegistrationDao);

        return userRegistrationDao.getEmail()+" added Successfully.";
    }

}
