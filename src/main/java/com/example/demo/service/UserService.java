package com.example.demo.service;

import com.example.demo.domain.Role;
import com.example.demo.domain.appUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    appUser saveUser(appUser user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    appUser getUser(String username);
    List<appUser> getUser();

}
