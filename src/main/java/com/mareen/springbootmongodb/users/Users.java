package com.mareen.springbootmongodb.users;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@Builder
public class Users {
    @Id
    private String id;
    private String name;
    private int age;
}
