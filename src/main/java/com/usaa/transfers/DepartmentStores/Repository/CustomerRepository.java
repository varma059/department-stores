package com.usaa.transfers.DepartmentStores.Repository;

import com.usaa.transfers.DepartmentStores.Entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
