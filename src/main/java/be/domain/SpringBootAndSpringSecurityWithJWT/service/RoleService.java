package be.domain.SpringBootAndSpringSecurityWithJWT.service;

import be.domain.SpringBootAndSpringSecurityWithJWT.entity.Role;
import be.domain.SpringBootAndSpringSecurityWithJWT.repository.RoleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@Slf4j
public class RoleService implements RoleServiceInterface{
    private final RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role save(Role role) {
        log.info("Saving new role {} to the database", role.getName());
        return roleRepository.save(role);
    }
}
