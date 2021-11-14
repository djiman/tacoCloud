package com.djiman.tacoCloud.data;

import org.springframework.data.repository.CrudRepository;
import com.djiman.tacoCloud.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}