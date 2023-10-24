package com.mareen.springbootmongodb.wishlist;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/wishlist")
@RequiredArgsConstructor
public class WishlistController {
    private final WishlistService wishlistService;

    @PostMapping("/products/{productId}")
    public ResponseEntity<Wishlist> addToWishlist(@PathVariable String productId, @RequestBody Wishlist wishlist) {
        wishlist.setProductId(productId);
        Wishlist newWishlistItem = wishlistService.addToWishlist(wishlist);
        return ResponseEntity.ok(newWishlistItem);
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Wishlist>> getWishlistByUser(@PathVariable String userId) {
        List<Wishlist> wishlist = wishlistService.getWishlistByUserId(userId);
        return ResponseEntity.ok(wishlist);
    }
}
