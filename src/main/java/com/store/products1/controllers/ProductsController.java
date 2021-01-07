package com.store.products1.controllers;

import com.store.products1.domain.UseCaseProducts;
import com.store.products1.domain.dto.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/private/store/products", produces = "application/json")
public class ProductsController {

    private final UseCaseProducts useCaseProducts;

     public ProductsController(final UseCaseProducts useCaseProducts){
        this.useCaseProducts = useCaseProducts;
    }

    @GetMapping("")
    public ResponseEntity<List<Product>> products(@RequestParam final String filter) {

        List<Product> products = useCaseProducts.products(filter);
        return new ResponseEntity<>(products, HttpStatus.OK);

    }

    @GetMapping("/")
    public ResponseEntity<List<Product>> products() {

        List<Product> products = useCaseProducts.products();
        return new ResponseEntity<>(products, HttpStatus.OK);

    }

}
