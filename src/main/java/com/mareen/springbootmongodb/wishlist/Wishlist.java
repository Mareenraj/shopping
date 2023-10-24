package com.mareen.springbootmongodb.wishlist;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@Builder
public class Wishlist {
    @Id
    private String id;
    private String userId;
    private String productId;
    private String productName;
    private String productDescription;
    private double productPrice;
    private String productImageURL;
}
