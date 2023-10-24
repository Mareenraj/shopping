package com.mareen.springbootmongodb;

import com.mareen.springbootmongodb.users.Users;
import com.mareen.springbootmongodb.users.UsersRepository;
import com.mareen.springbootmongodb.wishlist.Wishlist;
import com.mareen.springbootmongodb.wishlist.WishlistRepository;
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
           WishlistRepository wishlistRepository
    ) {
        return args -> {
            var wishlist = Wishlist.builder()
                    .userId("mareen")
                    .productName("fknveqfj")
                    .productId("fjcnqeij")
                    .build();
            wishlistRepository.insert(wishlist);

        };
    }
}
