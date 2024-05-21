package org.SpringBoot.DAO;

import jakarta.persistence.EntityManager;
import org.SpringBoot.Entities.Customer;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CustomerDAO {

    @Autowired
    private EntityManager em;

    public Customer getCustomerByID(int id){
        return em.find(Customer.class, id);
    }

    public List<Customer> getAllCustomers(){
        return em.createQuery("from Customer c", Customer.class).getResultList();
    }

    @Transactional
    public void insertCustomer(Customer customer){
        em.persist(customer);
    }

    @Transactional
    public void deleteCustomer(int id){
        Customer customer = getCustomerByID(id);
        em.remove(customer);
    }

    @Transactional
    public void updateCustomer(Customer customer){
        Customer c = getCustomerByID(customer.getId());
        c.setFirstName(customer.getFirstName());
        c.setLastName(customer.getLastName());
        c.setEmail(customer.getEmail());
        em.persist(c);
    }

}
