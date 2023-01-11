package com.johanny.DSCommerce.services;

import com.johanny.DSCommerce.entities.User;
import com.johanny.DSCommerce.services.exceptions.ForbiddenException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserService userService;

    public void validaSelfOrAdmin(long userId){
        User me = userService.authenticated();
        if( !me.hasRole("ROLE_ADMIN") && me.getId().equals(userId)){
            throw new ForbiddenException("Access denied");
        }

    }
}
