package com.LeoIT.manageUser;

import com.LeoIT.manageUser.model.State;
import com.LeoIT.manageUser.model.User;
import com.LeoIT.manageUser.repository.UserRespo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;

//@SpringBootTest
public class TestUserRepo {

    @Test
    public void addUser(){
        UserRespo userRespo = new UserRespo();
        User user = userRespo.addUser("KhanhKa","khanhkalx@gmail.com","012323", State.PENDING);
        assertThat(user).isNotNull();
        System.out.println(user.getId());
        assertThat(user.getId()).isNotBlank();
    }
    @Test
    public void addUserwithPending(){
        UserRespo userRespo = new UserRespo();
        User user = userRespo.addUser("KhanhKa","khanhkalx@gmail.com","012323");
        assertThat(user).isNotNull();
        System.out.println(user.getId());
        assertThat(user.getId()).isNotBlank();
        assertThat(user.getState()).isEqualTo(State.PENDING);
    }
    @Test
    public void isEmailExist(){
        UserRespo userRespo = new UserRespo();
        userRespo.addUser("KhanhKa1","khanhdkalx@gmail.com","012323");
        userRespo.addUser("KhanhKa2","khanhakalx@gmail.com","012323");
        userRespo.addUser("KhanhKa3","khanhtkalx@gmail.com","012323");
        assertThat(userRespo.isEmailExist("khanhdkalx@gmail.com")).isTrue();
        assertThat(userRespo.isEmailExist("khanhakalx@gmail.com")).isTrue();
        assertThat(userRespo.isEmailExist("khanhtkalx@gmail.com")).isTrue();
        assertThat(userRespo.isEmailExist("Khanhdkalx@gmail.com")).isTrue();
    }
    @Test
    public void findByEmail(){
        UserRespo userRespo = new UserRespo();
        userRespo.addUser("KhanhKa1","khanhdkalx@gmail.com","012323");
        userRespo.addUser("KhanhKa2","khanhakalx@gmail.com","012323");
        userRespo.addUser("KhanhKa3","khanhtkalx@gmail.com","012323");
        assertThat(userRespo.findByEmail("khanhdkalx@gmail.com")).isPresent();
        assertThat(userRespo.findByEmail("khanhdka1lx@gmail.com")).isNotPresent();
    }
}
