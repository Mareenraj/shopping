package com.mareen.springbootmongodb.offers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/offers")
@RequiredArgsConstructor
public class OffersController {
    private final OffersService offersService;

    @PostMapping("/products/{productId}")
    public ResponseEntity<Offers> makeOffer(@PathVariable String productId, @RequestBody Offers offers) {
        offers.setProductId(productId);
        Offers newOffer = offersService.makeOffer(offers);
        return ResponseEntity.ok(newOffer);
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Offers>> getOffersByUser(@PathVariable String userId) {
        List<Offers> offers = offersService.getOffersByUserId(userId);
        return ResponseEntity.ok(offers);
    }
}
