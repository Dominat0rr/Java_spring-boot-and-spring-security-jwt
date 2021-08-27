package be.domain.SpringBootAndSpringSecurityWithJWT.repository;

import be.domain.SpringBootAndSpringSecurityWithJWT.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
