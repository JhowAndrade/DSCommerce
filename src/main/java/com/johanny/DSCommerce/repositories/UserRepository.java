package com.johanny.DSCommerce.repositories;

import com.johanny.DSCommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

        User findByEmail (String email);
}
