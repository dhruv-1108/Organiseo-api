package com.organiscoapi.service.impl;

import com.organiscoapi.entity.Role;
import com.organiscoapi.entity.User;
import com.organiscoapi.exception.OrganiscoApiException;
import com.organiscoapi.payload.LoginDTO;
import com.organiscoapi.payload.RegisterDTO;
import com.organiscoapi.repository.RoleRepository;
import com.organiscoapi.repository.UserRepository;
import com.organiscoapi.security.JwtTokenProvider;
import com.organiscoapi.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AuthServiceImpl implements AuthService {

    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenProvider jwtTokenProvider;

    public AuthServiceImpl(AuthenticationManager authenticationManager,
                           UserRepository userRepository,
                           RoleRepository roleRepository,
                           PasswordEncoder passwordEncoder,
                           JwtTokenProvider jwtTokenProvider) {
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @Override
    public String login(LoginDTO loginDto) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginDto.getUsernameOrEmail(),
                        loginDto.getPassword()
                )
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = jwtTokenProvider.generateToken(authentication);

        if (token == null || token.isEmpty()) {
            throw new OrganiscoApiException(HttpStatus.INTERNAL_SERVER_ERROR, "Failed to generate JWT token");
        }

        return token;
    }


    @Override
    public String register(RegisterDTO registerDto) {
        if (userRepository.existsByUsername(registerDto.getUsername())) {
            throw new OrganiscoApiException(HttpStatus.BAD_REQUEST, "Username already exists!");
        }

        if (userRepository.existsByEmail(registerDto.getEmail())) {
            throw new OrganiscoApiException(HttpStatus.BAD_REQUEST, "Email already exists!");
        }

        User user = new User();
        user.setFullName(registerDto.getName());
        user.setUsername(registerDto.getUsername());
        user.setEmail(registerDto.getEmail());
        user.setPassword(passwordEncoder.encode(registerDto.getPassword()));

        Role role = roleRepository.findById(registerDto.getRole())
                .orElseThrow(() -> new OrganiscoApiException(HttpStatus.BAD_REQUEST, "Invalid role ID"));
        user.setRoles(Set.of(role));

        userRepository.save(user);

        return "User registered successfully!";
    }
}
