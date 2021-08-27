package be.domain.SpringBootAndSpringSecurityWithJWT;

import be.domain.SpringBootAndSpringSecurityWithJWT.entity.Role;
import be.domain.SpringBootAndSpringSecurityWithJWT.entity.User;
import be.domain.SpringBootAndSpringSecurityWithJWT.service.RoleService;
import be.domain.SpringBootAndSpringSecurityWithJWT.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class AppConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserService userService, RoleService roleService) {
        return args -> {
            roleService.save(new Role(null, "ROLE_USER"));
            roleService.save(new Role(null, "ROLE_MANAGER"));
            roleService.save(new Role(null, "ROLE_ADMIN"));
            roleService.save(new Role(null, "ROLE_SUPER_ADMIN"));

            userService.save(new User(null, "John Doe", "john", "1234", new ArrayList<>()));
            userService.save(new User(null, "Will Smith", "will", "1234", new ArrayList<>()));
            userService.save(new User(null, "Jim Carry", "jim", "1234", new ArrayList<>()));
            userService.save(new User(null, "Arnold Schwarzenegger", "arnold", "1234", new ArrayList<>()));

            userService.addRole("john", "ROLE_USER");
            userService.addRole("john", "ROLE_MANAGER");
            userService.addRole("will", "ROLE_MANAGER");
            userService.addRole("jim", "ROLE_ADMIN");
            userService.addRole("arnold", "ROLE_SUPER_ADMIN");
            userService.addRole("arnold", "ROLE_ADMIN");
            userService.addRole("arnold", "ROLE_USER");
        };
    }
}
