package com.johanny.DSCommerce.controllers;

import com.johanny.DSCommerce.dto.ProductDTO;
import com.johanny.DSCommerce.dto.UserDTO;
import com.johanny.DSCommerce.services.ProductService;
import com.johanny.DSCommerce.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService service;

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_CLIENT')")
    @GetMapping(value = "/me")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
        UserDTO dto = service.getMe();
        return ResponseEntity.ok(dto);
    }

}
