package com.johanny.DSCommerce.services;
import com.johanny.DSCommerce.dto.UserDTO;
import com.johanny.DSCommerce.entities.User;
import com.johanny.DSCommerce.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService implements UserDetailsService {

    @Transactional(readOnly = true)
    public UserDTO getMe(){
        User entity = authenticated();
        return new UserDTO(entity);
    }

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = repository.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("Email not found");
        }
        return user;
    }

    protected User authenticated() {
        try {
            String username = SecurityContextHolder.getContext().getAuthentication().getName();
            return repository.findByEmail(username);
        }
        catch (Exception e) {
            throw new UsernameNotFoundException("Invalid user");
        }

    }

}