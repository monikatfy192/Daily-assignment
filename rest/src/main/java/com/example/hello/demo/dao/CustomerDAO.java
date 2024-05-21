package com.example.hello.demo.dao;

import com.example.hello.demo.entities.CustomerBackUp;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CustomerDAO {


    @Autowired
    private EntityManager em;
    // get customer by id
    @Transactional
    public CustomerBackUp getCustomerById(int id ){
        return em.find(CustomerBackUp.class,id);
    }
    // get all customer
    @Transactional
    public List<CustomerBackUp> getAllCustomers() {
    List<CustomerBackUp> customersList = em.createQuery("from CustomerBackUp c", CustomerBackUp.class).getResultList();
        return customersList;
    }
    //INSERT CUSTOMER
    @Transactional
    public void insertCustomer(CustomerBackUp c) {
        em.persist(c);
    }
    //UPDATE CUSTOMER
    @Transactional
    public CustomerBackUp updateCustomer(CustomerBackUp customer) {
        CustomerBackUp c = getCustomerById(customer.getId());
        c.setFirstName(customer.getFirstName());
        c.setLastName(customer.getLastName());
        c.setEmail(customer.getEmail());
        em.persist(c);
        return c;
    }
    //DELETE CUSTOMER
    @Transactional
    public void deleteCustomer(CustomerBackUp c) {
        em.remove(c);
    }
    //sort ALL CUSTOMERS
    @Transactional
    public List<CustomerBackUp> sortCustomers() {
        List<CustomerBackUp> sortCustomer = em.createQuery("from CustomerBackUp c order by firstName asc", CustomerBackUp.class).getResultList();
        return sortCustomer;
    }

}