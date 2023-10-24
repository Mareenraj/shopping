package com.mareen.springbootmongodb.offer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@Builder
public class Offer {
    @Id
    private String id;
    private String productId;
    private String userId;
    private double offerAmount;

}

