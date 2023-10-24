package com.mareen.springbootmongodb.offer;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OfferRepository extends MongoRepository<Offer, String> {
    List<Offer> findByUserId(String userId);

    List<Offer> findByProductId(String productId);
}
