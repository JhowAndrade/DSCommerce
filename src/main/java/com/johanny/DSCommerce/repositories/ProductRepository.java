package com.johanny.DSCommerce.repositories;

import com.johanny.DSCommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
