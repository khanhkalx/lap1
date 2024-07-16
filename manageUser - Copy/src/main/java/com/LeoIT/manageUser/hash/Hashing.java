package com.LeoIT.manageUser.hash;

public interface Hashing {
    public String hashPassword(String password);
    public Boolean validatePassword(String originalPassword, String storedPassword);
}
