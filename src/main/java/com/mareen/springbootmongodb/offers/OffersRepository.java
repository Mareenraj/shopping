package com.mareen.springbootmongodb.offers;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OffersRepository extends MongoRepository<Offers,String> {
    List<Offers> findByUserId(String userId);
    List<Offers> findByProductId(String productId);
}
