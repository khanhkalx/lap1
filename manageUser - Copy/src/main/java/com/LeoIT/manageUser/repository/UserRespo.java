package com.LeoIT.manageUser.repository;

import com.LeoIT.manageUser.model.State;
import com.LeoIT.manageUser.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRespo {
    private ConcurrentHashMap<String, User> users = new ConcurrentHashMap<>();

    public User addUser(String fullname, String email, String password){
        return addUser( fullname, email, password , State.PENDING);
    }

    public User addUser(String fullname, String email, String password, State state){
         String id = UUID.randomUUID().toString();
         User user = User.builder().id(id).
                 fullname(fullname).
                 email(email).
                 hashed_password(password).
                 state(state).build();
        users.put(id,user);
         return user;
    }
    public boolean isEmailExist(String email){
        return users.values().stream().filter(user -> user.getEmail().equalsIgnoreCase(email)).count()>0;
    }
    public Optional<User> findByEmail(String email){
        return users.values().stream().filter(user -> user.getEmail().equalsIgnoreCase(email)).findFirst();
    }
}
