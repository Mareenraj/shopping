package com.mareen.springbootmongodb.wishlist;

import com.mareen.springbootmongodb.users.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WishlistService {
    private final WishlistRepository wishlistRepository;

    public String save(Wishlist wishlist) {
        return wishlistRepository.save(wishlist).getId();
    }

    public List<Wishlist> findAll() {
        return wishlistRepository.findAll();
    }
}
