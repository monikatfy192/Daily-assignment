package com.example.hello.demo.services;

import com.example.hello.jpa.DAO.JPACustomer;
import com.example.hello.jpa.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceBackUp {

    @Autowired
    private JPACustomer jpaCustomer;

    public List<Customer> getAllCustomers(){
        List<Customer> allCustomers = this.jpaCustomer.findAll();
        return allCustomers;
    }
    public void insertCustomer(Customer c){
        this.jpaCustomer.save(c);
    }

    public String deleteCustomer(Customer c){
        this.jpaCustomer.delete(c);
        return "deleted";
    }
    public Customer getCustomerById(int id){
        return this.jpaCustomer.findById(id).get();
    }
    public String updateCustomer(Customer customer) {
       this.jpaCustomer.save(customer);
        return "updated";
    }
}
