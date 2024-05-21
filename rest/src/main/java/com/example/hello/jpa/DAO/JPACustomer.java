package com.example.hello.jpa.DAO;

import com.example.hello.jpa.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface JPACustomer extends JpaRepository<Customer, Integer> {

}
