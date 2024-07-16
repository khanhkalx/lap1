package com.example.restAPI.model.mapper;

import Entity.User;
import com.example.restAPI.model.dto.UserDto;

public class UserMapper {

    public static UserDto userDto(User user){
        UserDto tmp = new UserDto();
        tmp.setId(user.getId());
        tmp.setName(user.getName());
        tmp.setEmail(user.getEmail());
        tmp.setAvatar(user.getAvatar());
        tmp.setPhone(user.getPhone());
        return tmp;
    }
}
