package com.usaa.transfers.DepartmentStores.Repository;
import com.usaa.transfers.DepartmentStores.Entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {
}
