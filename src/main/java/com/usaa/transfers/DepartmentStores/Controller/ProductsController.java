package com.usaa.transfers.DepartmentStores.Controller;

import com.usaa.transfers.DepartmentStores.Entity.Product;
import com.usaa.transfers.DepartmentStores.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/",produces = "application/json")
public class ProductsController {
    @Autowired
    ProductService productService;
    @GetMapping("products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }
    @PostMapping("addproduct")
    public String addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }


}
