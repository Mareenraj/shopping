package com.mareen.springbootmongodb.users;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users,String> {
}
