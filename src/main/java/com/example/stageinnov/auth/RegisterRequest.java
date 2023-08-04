package com.example.stageinnov.auth;


import com.example.stageinnov.entity.Role;
import jakarta.persistence.Column;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Role role;
    private String username;
    private String tel;
}