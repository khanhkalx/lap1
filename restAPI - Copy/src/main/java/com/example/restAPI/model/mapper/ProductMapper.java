package com.example.restAPI.model.mapper;

import Entity.Product;
import com.example.restAPI.model.dto.ProductDto;
import com.example.restAPI.model.dto.UserDto;

public class ProductMapper {

    public static ProductDto productDto(Product product){
        ProductDto pDt = new ProductDto();
        pDt.setId(product.getId());
        pDt.setName(product.getName());
        pDt.setPrice(product.getPrice());
        pDt.setDiachi(product.getDiachi());
        pDt.setPeople(product.getPeople());
        return pDt;
    }
}
