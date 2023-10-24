package com.mareen.springbootmongodb;

import com.mareen.springbootmongodb.offers.Offers;
import com.mareen.springbootmongodb.offers.OffersRepository;
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
          OffersRepository offersRepository
    ) {
        return args -> {
            var offers = Offers.builder()
                    .id("fknwjevj")
                    .productId("vnjrv")
                    .userId("mareen")
                    .offerAmount(4.89)
                    .build();
            offersRepository.insert(offers);

        };
    }
}
