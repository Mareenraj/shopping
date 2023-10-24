package com.mareen.springbootmongodb;

import com.mareen.springbootmongodb.product.Product;
import com.mareen.springbootmongodb.product.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootMongodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMongodbApplication.class, args);
    }
//    @Bean
//    public CommandLineRunner commandLineRunner (
//          ProductRepository repository
//    ) {
//        return args -> {
//          var product =Product.builder()
//                    .name("iPhone")
//                    .description("Best smart phone")
//                    .build();
//          repository.insert(product);
//        };
//    }
 }
