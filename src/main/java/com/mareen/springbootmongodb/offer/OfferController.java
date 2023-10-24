package com.mareen.springbootmongodb.offer;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/offers")
@RequiredArgsConstructor
public class OfferController {
    private final OfferService offerService;

    @PostMapping("/products/{productId}")
    public ResponseEntity<Offer> makeOffer(@PathVariable String productId, @RequestBody Offer offer) {
        offer.setProductId(productId);
        Offer newOffer = offerService.makeOffer(offer);
        return ResponseEntity.ok(newOffer);
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Offer>> getOffersByUser(@PathVariable String userId) {
        List<Offer> offers = offerService.getOffersByUserId(userId);
        return ResponseEntity.ok(offers);
    }
}
