package io.foodLand.foodLandApp.service;

import io.foodLand.foodLandApp.model.User;
import io.foodLand.foodLandApp.web.UserRegistrationDao;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDao userRegistrationDao);
}
