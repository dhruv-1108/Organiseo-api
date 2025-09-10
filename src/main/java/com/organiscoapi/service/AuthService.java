package com.organiscoapi.service;

import com.organiscoapi.payload.LoginDTO;
import com.organiscoapi.payload.RegisterDTO;

public interface AuthService {
    String login(LoginDTO loginDto);
    String register(RegisterDTO registerDto);
}
