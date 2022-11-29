package com.johanny.DSCommerce.services;

import com.johanny.DSCommerce.dto.ProductDTO;
import com.johanny.DSCommerce.entities.Product;
import com.johanny.DSCommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){
        Product product = repository.findById(id).get();
        return new ProductDTO(product);

    }
}
