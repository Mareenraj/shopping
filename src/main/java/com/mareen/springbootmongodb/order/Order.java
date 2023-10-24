package com.mareen.springbootmongodb.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@Builder
public class Order {
    @Id
    private String id;
    private String productId;
    private String userId;
    private int quantity;
    private double totalAmount;
}
