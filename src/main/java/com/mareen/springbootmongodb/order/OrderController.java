package com.mareen.springbootmongodb.order;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/products/{productId}")
    public ResponseEntity<Order> placeOrder(@PathVariable String productId, @RequestBody Order order) {
        order.setProductId(productId);
        Order newOrder = orderService.placeOrder(order);
        return ResponseEntity.ok(newOrder);
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Order>> getOrdersByUser(@PathVariable String userId) {
        List<Order> orders = orderService.getOrdersByUserId(userId);
        return ResponseEntity.ok(orders);
    }
}
