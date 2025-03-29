package com.app.review.model;

import com.app.review.domain.Role;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record UserResponse(
        Long id,
        String userName,
        String email,
        Role role,
        LocalDateTime createdAt
) {
}
