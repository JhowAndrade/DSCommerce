package com.johanny.DSCommerce.services;

import com.johanny.DSCommerce.dto.CategoryDTO;
import com.johanny.DSCommerce.dto.ProductMinDTO;
import com.johanny.DSCommerce.entities.Category;
import com.johanny.DSCommerce.entities.Product;
import com.johanny.DSCommerce.repositories.CategoryRepository;
import com.johanny.DSCommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> result = repository.findAll();
        return result.stream().map(x -> new CategoryDTO(x)).toList();

    }

}
