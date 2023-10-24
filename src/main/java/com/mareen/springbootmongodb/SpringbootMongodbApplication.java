package com.mareen.springbootmongodb;

import com.mareen.springbootmongodb.users.Users;
import com.mareen.springbootmongodb.users.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootMongodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMongodbApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
           UsersRepository usersRepository
    ) {
        return args -> {
            var users = Users.builder()
                    .name("mareen")
                    .age(24)
                    .build();
            usersRepository.insert(users);

        };
    }
}
