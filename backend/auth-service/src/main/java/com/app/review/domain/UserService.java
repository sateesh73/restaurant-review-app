package com.app.review.domain;

import com.app.review.model.UserRequest;
import com.app.review.model.UserResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    public String save(UserRequest userRequest) {
        User user = UserMapper.toEntity(userRequest);
        if (user == null)
            throw new RuntimeException("error saving user with userName: " + userRequest.userName());

        log.info("saved user with user Id: {}", user.getId());
        return user.getUserName();
    }

    public UserResponse get(Long id) {
        return userRepository.findById(id)
                .map(UserMapper::toUserResponse)
                .orElseThrow();
    }
}
