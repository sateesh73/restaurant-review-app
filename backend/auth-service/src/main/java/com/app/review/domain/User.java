package com.app.review.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, unique = true)
    private String userName;
    @Column
    private String password;
    @Column(nullable = false, unique = true)
    private String email;
    @Column
    @Enumerated(EnumType.STRING)
    private Role role;
    @Column
    private LocalDateTime createdAt;
}
