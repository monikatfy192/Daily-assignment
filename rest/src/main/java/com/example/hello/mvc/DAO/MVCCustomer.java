package com.example.hello.mvc.DAO;

import com.example.hello.mvc.entities.CustomerMVC;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MVCCustomer extends JpaRepository<CustomerMVC, Integer> {

}
