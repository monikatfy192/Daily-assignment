package org.SpringBoot.Services;

import org.SpringBoot.DAO.CustomerDAO;
import org.SpringBoot.DAO.JPACustomerDAO;
import org.SpringBoot.Entities.Customer;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private JPACustomerDAO dao;

    public Customer getCustomerByID(int id){ return this.dao.findById(id).get();}

    public List<Customer> findByFirstName(String name){ return this.dao.findByFirstName(name);}

    public List<Customer> findByFirstNameOrLastName(String fname, String lname){
        return this.dao.findByFirstNameOrLastName(fname,lname);
    }

    public List<Customer> findCustomerLikeName(String name){return this.dao.findCustomerLikeName(name);}

    public List<Customer> getAllCustomers(){ return  this.dao.findAll();}

    public void insertCustomer(Customer customer){ this.dao.save(customer);}

    public void deleteCustomer(int id){ this.dao.deleteById(id);}

    public void updateCustomer(Customer customer){ this.dao.save(customer);}

    public List<Customer> sortCustomerByName(){return this.dao.sortByFirstName();}

    public List<Customer> sortCustomerByID(){return this.dao.sortByID();}


    //    @Autowired
//    private CustomerDAO customerDAO;

//    public Customer getCustomerByID(int id){ return this.customerDAO.getCustomerByID(id);}
//
//    public List<Customer> getAllCustomers(){ return  this.customerDAO.getAllCustomers();}
//
//    public void insertCustomer(Customer customer){ this.customerDAO.insertCustomer(customer);}
//
//    public void deleteCustomer(int id){ this.customerDAO.deleteCustomer(id);}
//
//    public void updateCustomer(Customer customer){ this.customerDAO.updateCustomer(customer);}

}
