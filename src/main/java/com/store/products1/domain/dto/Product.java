package com.store.products1.domain.dto;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Product {

    private Long id;
    private String brand;
    private String description;
    private String image;
    private Long price;
    private boolean discount;
}
