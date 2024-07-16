//package com.LeoIT.manageUser;
//
//import com.LeoIT.manageUser.Service.UserService;
//import com.LeoIT.manageUser.exception.UserException;
//import com.LeoIT.manageUser.model.User;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.assertj.core.api.Assertions.assertThatThrownBy;
//
//@SpringBootTest
//public class TestUserService {
//    @Autowired
//    private UserService userService;
//
//    @Test
//    public void addUser(){
//        User user = userService.addUser("Leo1", "khanhkalx@gmail.com","ab2s21");
//        assertThat(user).isNotNull();
//    }
//
//    @Test
//    public void Login(){
//        userService.addUser("Leo1", "khanhkalx@gmail.com","ab2s21");
//        assertThat(userService.Login("khanhkalx@gmail.com","abs21")).isNotNull();
//    }
//    @Test
//    public void login_when_account_is_pending(){
//        userService.addUser("Leo1", "khanhkalx@gmail.com","ab2s21" );
//    assertThatThrownBy(() ->{
//        userService.Login("khanhkalx@gmail.com","ab2s21");
//    }).isInstanceOf(UserException.class)
//            .hasMessageContaining("User is not activated");
//    }
//}
