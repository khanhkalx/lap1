package com.LeoIT.manageUser;

import com.LeoIT.manageUser.hash.Hashing;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

public class TestHash {
    @Autowired private Hashing hash;

    @Test
    public void hashPassword(){
        var password = List.of("abc", "213-c", "as-x","sa-3>?");
        for(String passwordz : password){
            String hash_pass = hash.hashPassword(passwordz);
            assertThat(hash_pass).isNotNull();
        }
    }
    @Test
    public void validatePassword(){
        var password = List.of("abc", "213-c", "as-x","sa-3>?");
        for(String passwordz : password){
            String hash_pass = hash.hashPassword(passwordz);
            assertThat(hash.validatePassword(passwordz,hash_pass)).isTrue();
        }
        var result = hash.validatePassword("abc","def");
        assertThat(result).isFalse();
    }
}
