//package com.LeoIT.manageUser.hash;
//
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component;
//
//import javax.crypto.SecretKeyFactory;
//import javax.crypto.spec.PBEKeySpec;
//import java.security.NoSuchAlgorithmException;
//
//@Primary
//@Component
//public class PBKDF2Hash implements Hashing{
//    @Override
//    public String hashPassword(String password) {
//        int iterations = 1000;
//        char[] chars = password.toCharArray();
//        byte[] salt;
//        try{
//            salt = getSalt();
//        }catch (NoSuchAlgorithmException e){
//                return null;
//        }
//        PBEKeySpec spec = new PBEKeySpec(chars, salt, iterations, 64);
//        SecretKeyFactory skf;
//        try {
//            skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
//        } catch (NoSuchAlgorithmException e) {
//            return null;
//        }
//
//    }
//
//    @Override
//    public Boolean validatePassword(String originalPassword, String storedPassword) {
//        return null;
//    }
//}
