package com.example.hello.mvc.services;

import com.example.hello.mvc.DAO.MVCCustomer;
import com.example.hello.mvc.entities.CustomerMVC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceMVC {

    @Autowired
    private MVCCustomer jpaCustomer;

    public List<CustomerMVC> getAllCustomers(){
        List<CustomerMVC> allCustomers = this.jpaCustomer.findAll();
        return allCustomers;
    }
    public void insertCustomer(CustomerMVC c){
        this.jpaCustomer.save(c);
    }

    public String deleteCustomer(CustomerMVC c){
        this.jpaCustomer.delete(c);
        return "deleted";
    }
    public CustomerMVC getCustomerById(int id){
        return this.jpaCustomer.findById(id).get();
    }
    public String updateCustomer(CustomerMVC customer) {
       this.jpaCustomer.save(customer);
        return "updated";
    }
}
