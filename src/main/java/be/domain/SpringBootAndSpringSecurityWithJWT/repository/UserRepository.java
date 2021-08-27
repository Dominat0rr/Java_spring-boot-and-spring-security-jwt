package be.domain.SpringBootAndSpringSecurityWithJWT.repository;

import be.domain.SpringBootAndSpringSecurityWithJWT.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
