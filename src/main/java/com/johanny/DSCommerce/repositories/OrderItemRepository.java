package com.johanny.DSCommerce.repositories;

import com.johanny.DSCommerce.entities.Order;
import com.johanny.DSCommerce.entities.OrderItem;
import com.johanny.DSCommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
