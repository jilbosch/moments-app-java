package com.proves1.imatges.auth.configuration;


import com.proves1.imatges.models.Role;
import com.proves1.imatges.models.User;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import com.proves1.imatges.repositories.AuthRepository;
import com.proves1.imatges.repositories.RoleRepository;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;

;

@Component
public class RoleRepositoryInitializer {

    private RoleRepository roleRepository;
    private AuthRepository authRepository;
    private PasswordEncoder encoder;

    public RoleRepositoryInitializer(RoleRepository roleRepository, AuthRepository authRepository, PasswordEncoder encoder) {
        this.roleRepository = roleRepository;
        this.authRepository = authRepository;
        this.encoder = encoder;
    }

    @PostConstruct
    public void addAvailableRoles(){
        if (!roleRepository.findAll().isEmpty()) {
            return;
        }

        List<Role> roles = List.of(
                new Role(1, Role.RoleName.ROLE_ADMIN),

                new Role(3, Role.RoleName.ROLE_USER)
        );

        roleRepository.saveAll(roles);

        if (!authRepository.findAll().isEmpty()) {
            return;
        }

        var user = new User();
        user.setRoles(roleRepository.findAll().stream().collect(Collectors.toSet()));
        user.setEmail("admin@admin.com");
        user.setUsername("Admin");
        user.setPassword(encoder.encode("12345678"));

        authRepository.save(user);
    }
}
