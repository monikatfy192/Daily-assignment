package org.example.dao;

import org.example.entities.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CustomerDAO {

    @Autowired
    SessionFactory sessionFactory;

    //GET ALL CUSTOMERS
    @Transactional
    public List<Customer> getAllCustomers() {
        Session session = sessionFactory.getCurrentSession();
        List<Customer> customersList = session.createQuery("from Customer c", Customer.class).getResultList();
        return customersList;
    }

    //GET CUSTOMER BY ID
    @Transactional
    public Customer getCustomerById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Customer customer = session.get(Customer.class, id);
        return customer;
    }

    //INSERT CUSTOMER
    @Transactional
    public void insertCustomer(Customer c) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(c);
    }

    //DELETE CUSTOMER
    @Transactional
    public void deleteCustomer(Customer c) {
        Session session = sessionFactory.getCurrentSession();
        session.remove(c);
    }

    //UPDATE CUSTOMER
    @Transactional
    public Customer updateCustomer(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        Customer c = getCustomerById(customer.getId());
        c.setFirstName(customer.getFirstName());
        c.setLastName(customer.getLastName());
        c.setEmail(customer.getEmail());
        //set el7aga elgdeda
        session.persist(c);
        return c;
    }
}