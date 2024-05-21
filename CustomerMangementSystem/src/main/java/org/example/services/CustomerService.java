package org.example.services;

import org.example.dao.CustomerDAO;
import org.example.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerDAO customerDAO;

    public List<Customer> getAllCustomers(){
        List<Customer> allCustomers = this.customerDAO.getAllCustomers();
        return allCustomers;
    }
    public void insertCustomer(Customer c){
        this.customerDAO.insertCustomer(c);
    }

    public void deleteCustomer(Customer c){
        this.customerDAO.deleteCustomer(c);
    }
    public Customer getCustomerById(int id){
        return this.customerDAO.getCustomerById(id);
    }
    public void updateCustomer(Customer customer) {
       this.customerDAO.updateCustomer(customer);
    }
}
