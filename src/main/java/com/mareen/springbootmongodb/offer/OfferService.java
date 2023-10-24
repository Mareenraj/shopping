package com.mareen.springbootmongodb.offer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OfferService {
    private final OfferRepository offerRepository;

    public Offer makeOffer(Offer offer) {
        return offerRepository.save(offer);
    }

    public List<Offer> getOffersByUserId(String userId) {
        return offerRepository.findByUserId(userId);
    }

    public List<Offer> getOffersByProductId(String productId) {
        return offerRepository.findByProductId(productId);
    }
}
