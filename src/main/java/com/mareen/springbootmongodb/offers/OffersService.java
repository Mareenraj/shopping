package com.mareen.springbootmongodb.offers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OffersService {
    private final OffersRepository offersRepository;

    public Offers makeOffer(Offers offers) {
        return offersRepository.save(offers);
    }

    public List<Offers> getOffersByUserId(String userId) {
        return offersRepository.findByUserId(userId);
    }

    public List<Offers> getOffersByProductId(String productId) {
        return offersRepository.findByProductId(productId);
    }
}
