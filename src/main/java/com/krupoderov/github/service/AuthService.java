package com.krupoderov.github.service;

import com.krupoderov.github.dto.RegisterRequest;
import com.krupoderov.github.model.User;
import com.krupoderov.github.repository.UserRepository;
import org.springframework.stereotype.Service;

/**
 * Created by Krupoderov Mikhail on Nov, 2019
 */
@Service
public class AuthService {

    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void signup(RegisterRequest registerRequest) {
        User user = new User();
        user.setUserName(registerRequest.getUsername());
        user.setPassword(registerRequest.getPassword());
        user.setEmail(registerRequest.getEmail());
        userRepository.save(user);
    }
}
