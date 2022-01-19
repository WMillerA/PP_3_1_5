package ru.kata.spring.boot_security.demo.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    void add(User user);

    void update(User user);

    void delete(Long id);

    List<User> getAllUser();

    User show(Long id);

    User findByUserName(String name);

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
