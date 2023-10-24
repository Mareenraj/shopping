package com.mareen.springbootmongodb.wishlist;

import com.mareen.springbootmongodb.users.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/wishlist")
@RequiredArgsConstructor
public class WishlistController {
    private final WishlistService wishlistService;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Wishlist wishlist) {
        return ResponseEntity.ok(wishlistService.save(wishlist));
    }

    @GetMapping
    public ResponseEntity<List<Wishlist>> findAll() {
        return ResponseEntity.ok(wishlistService.findAll());

    }
}
