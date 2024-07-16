package com.LeoIT.manageUser.Service;

import com.LeoIT.manageUser.exception.UserException;
import com.LeoIT.manageUser.hash.Hashing;
import com.LeoIT.manageUser.model.State;
import com.LeoIT.manageUser.model.User;
import com.LeoIT.manageUser.repository.UserRespo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceInMemory implements UserService{
    private UserRespo userRespo;
    @Autowired
    private Hashing hashing;

    @Override
    public User Login(String email, String password) {
        Optional<User> o_user = userRespo.findByEmail(email);
        if(!o_user.isPresent()){
            throw new UserException("User is not found");
        }
        User user = o_user.get();
        // User muon login phai co trang thai active
        if(user.getState() != State.ACTIVE){
            throw new UserException("User is not actiavted");
        }
        if(hashing.validatePassword(password, o_user.get().getHashed_password())){
            return user;
        }else{
            throw new UserException("Password is incorrect");
        }
    }

    @Override
    public boolean logout(String email) {
        return false;
    }

    @Override
    public User addUser(String fullname, String email, String password) {
        return userRespo.addUser(fullname, email, hashing.hashPassword(password));
    }

    @Override
    public User addUserThenAutoActivate(String fullname, String email, String password) {
        return userRespo.addUser(fullname, email, hashing.hashPassword(password), State.ACTIVE);
    }

    @Override
    public Boolean activateUser(String activation_code) {
        return null;
    }

    @Override
    public Boolean updatePassword(String email, String password) {
        return null;
    }

    @Override
    public Boolean updateEmail(String email, String newEmail) {
        return null;
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public User finById(String id) {
        return null;
    }
}
