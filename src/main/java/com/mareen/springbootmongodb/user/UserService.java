package com.mareen.springbootmongodb.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public String save(User user) {
        return userRepository.save(user).getId();
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
