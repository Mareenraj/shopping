package com.mareen.springbootmongodb;

import com.mareen.springbootmongodb.offer.Offer;
import com.mareen.springbootmongodb.offer.OfferRepository;
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
            OfferRepository offerRepository
    ) {
        return args -> {
            var offers = Offer.builder()
                    .id("fknwjevj")
                    .productId("vnjrv")
                    .userId("mareen")
                    .offerAmount(4.89)
                    .build();
            offerRepository.insert(offers);

        };
    }
}
