package com.johanny.DSCommerce.services;

import com.johanny.DSCommerce.dto.OrderDTO;
import com.johanny.DSCommerce.dto.ProductDTO;
import com.johanny.DSCommerce.entities.Order;
import com.johanny.DSCommerce.entities.Product;
import com.johanny.DSCommerce.repositories.OrderRepository;
import com.johanny.DSCommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    private OrderRepository repository;
    @Transactional(readOnly = true)
    public OrderDTO findById(Long id) {
        Order order = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Recurso não encontrado"));
        return new OrderDTO(order);
    }

}
