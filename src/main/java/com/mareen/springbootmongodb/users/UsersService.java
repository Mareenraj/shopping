package com.mareen.springbootmongodb.users;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UsersService {
    private final UsersRepository usersRepository;

    public String save(Users users) {
        return usersRepository.save(users).getId();
    }

    public List<Users> findAll() {
        return usersRepository.findAll();
    }
}
