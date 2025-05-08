package com.ecommerce.user.services;

import com.ecommerce.user.dtos.UserRequest;
import com.ecommerce.user.dtos.UserResponse;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserResponse> listUsers();
    Optional<UserResponse> listUserById(Long userId);
    void createNewUser(UserRequest userRequest);
    boolean updateExistingUser(Long userId, UserRequest userRequest);
    void deleteUserById(Long userId);
}
