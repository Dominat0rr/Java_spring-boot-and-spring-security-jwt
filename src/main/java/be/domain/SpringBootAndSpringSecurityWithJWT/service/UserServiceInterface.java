package be.domain.SpringBootAndSpringSecurityWithJWT.service;

import be.domain.SpringBootAndSpringSecurityWithJWT.entity.User;

import java.util.List;

public interface UserServiceInterface {
    User save(User user);
    void addRole(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
