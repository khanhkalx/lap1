package com.LeoIT.manageUser.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class User {
    private String id;
    private String fullname;
    private String email;
    private String hashed_password;
    private State state;
}
