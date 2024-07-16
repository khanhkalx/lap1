package com.example.restAPI.model.dto;

import Entity.User;
import com.example.restAPI.model.mapper.UserMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private int id;
    private String Name;
    private Double price;
    private String diachi;
    private UserDto people;
}
