package be.domain.SpringBootAndSpringSecurityWithJWT.util;

import org.springframework.context.annotation.Bean;

public class PasswordEncoder {

    @Bean
    PasswordEncoder passwordEncoder() {
        return new PasswordEncoder();
    }
}
