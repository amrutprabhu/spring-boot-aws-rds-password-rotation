package com.amrut.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DatabasePasswordRotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatabasePasswordRotationApplication.class, args);
    }

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/get")
    public String get() {
        Product product = new Product();
        product.setId(String.valueOf(Math.random()));
        product.setName("Product Name");
        productRepository.save(product);
        List<Product> all = productRepository.findAll();
        return all.toString();
    }
}
