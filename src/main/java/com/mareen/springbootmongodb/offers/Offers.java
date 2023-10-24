package com.mareen.springbootmongodb.offers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@Builder
public class Offers {
    @Id
    private String id;
    private String productId;
    private String userId;
    private double offerAmount;

}
