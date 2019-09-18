package com.usaa.transfers.DepartmentStores.service;

import com.usaa.transfers.DepartmentStores.Entity.Product;
import com.usaa.transfers.DepartmentStores.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductService {
//    private LocalDate manfacDate=LocalDate.now();
//    private LocalDate expiryDate=manfacDate.plusDays(5);
    @Autowired
    ProductRepository productRepository;
    List<Product> ProductsList=new ArrayList<>();
    public List<Product> getProducts(){
        ProductsList=(ArrayList)productRepository.findAll();
        return ProductsList;
    }
    public String addProduct(Product newproduct){
        productRepository.save(newproduct);
        return "Product added successfully";
    }
}
