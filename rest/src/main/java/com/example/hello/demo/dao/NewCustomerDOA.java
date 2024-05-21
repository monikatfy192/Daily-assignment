package com.example.hello.demo.dao;

import com.example.hello.demo.entities.CustomerBackUp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NewCustomerDOA extends JpaRepository<CustomerBackUp, Integer> {
    public CustomerBackUp findCustomerByFirstName(String fname);
    public CustomerBackUp findCustomerByLastNameOrFirstName(String lname, String fname);
    @Query("from  CustomerBackUp  c where c.firstName like ?1")
    public List <CustomerBackUp> findCustomerByFirstNameLikeName(String lname);
}
