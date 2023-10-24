package com.mareen.springbootmongodb.users;

import com.mareen.springbootmongodb.product.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UsersController {
    private final UsersService usersService;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Users users) {
        return ResponseEntity.ok(usersService.save(users));
    }

    @GetMapping
    public ResponseEntity<List<Users>> findAll() {
        return ResponseEntity.ok(usersService.findAll());

    }
}
