package com.mareen.springbootmongodb.wishlist;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface WishlistRepository extends MongoRepository<Wishlist,String> {
}
