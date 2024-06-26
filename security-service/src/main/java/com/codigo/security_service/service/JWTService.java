package com.codigo.security_service.service;

import org.springframework.security.core.userdetails.UserDetails;

import java.util.Map;

public interface JWTService {
    String extractUsername(String token);
    String generateToken(UserDetails userDetails);
    boolean validateToken(String token, UserDetails userDetails);
    boolean validate(String token);
    String generateRefreshToken(Map<String, Object> extraClaims, UserDetails userDetails);
}
