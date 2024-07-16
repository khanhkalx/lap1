package com.LeoIT.manageUser.Service;

import com.LeoIT.manageUser.model.User;

import java.util.Optional;

public interface UserService {
    public User Login(String email, String password);
    public boolean logout(String email);

    public User addUser(String fullname, String email, String password);
    public User addUserThenAutoActivate(String fullname, String email, String password);
    public Boolean activateUser(String activation_code);

    public Boolean updatePassword(String email, String password);
    public Boolean updateEmail(String email, String newEmail);

    public Optional<User> findByEmail(String email);
    public User finById(String id);
}
