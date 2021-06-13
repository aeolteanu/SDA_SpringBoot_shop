package com.SDA.alexolteanu.webshop.controller;

import com.SDA.alexolteanu.webshop.error.ResourceNotFoundException;
import com.SDA.alexolteanu.webshop.model.Product;
import com.SDA.alexolteanu.webshop.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.findAll();
    }
    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable(value = "id") Long productId) throws ResourceNotFoundException {
        Optional<Product> product = productService.findById(productId);
        if(product.isPresent()){
            return ResponseEntity.ok(product.get());
        }
        throw new ResourceNotFoundException("product with id:" + productId + " was not found!");
    }

    @PostMapping
    public String createProduct(@RequestBody Product product){
        productService.save(product);
        return "Product save";
    }



}
