package com.johanny.DSCommerce.repositories;

import com.johanny.DSCommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
