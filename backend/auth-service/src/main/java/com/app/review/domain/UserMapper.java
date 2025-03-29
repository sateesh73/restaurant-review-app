package com.app.review.domain;

import com.app.review.model.UserRequest;
import com.app.review.model.UserResponse;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;

@Service
class UserMapper {


    public static User toEntity(UserRequest userRequest) {
        return User.builder()
                .userName(userRequest.userName())
                .email(userRequest.email())
                .password(userRequest.password())
                .role(userRequest.role())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static UserResponse toUserResponse(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .email(user.getEmail())
                .role(user.getRole())
                .userName(user.getUserName())
                .createdAt(user.getCreatedAt())
                .build();
    }
}
