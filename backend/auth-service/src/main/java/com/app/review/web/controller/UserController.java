package com.app.review.web.controller;

import com.app.review.domain.UserService;
import com.app.review.model.UserRequest;
import com.app.review.model.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
class UserController {

    private final UserService userService;

    @PostMapping
    ResponseEntity<String> save(@RequestBody UserRequest userRequest) {
        return new ResponseEntity<>(userService.save(userRequest), HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    ResponseEntity<UserResponse> get(@PathVariable Long id) {
        return new ResponseEntity<>(userService.get(id), HttpStatus.OK);
    }
}
