package org.SpringBoot.DAO;

import org.SpringBoot.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JPACustomerDAO extends JpaRepository<Customer, Integer> {

    public List<Customer> findByFirstName(String name);
    public List<Customer> findByFirstNameOrLastName(String fname, String lname);

    @Query("from Customer c where  c.firstName like ?1")
    public List<Customer> findCustomerLikeName(String name);

    @Query("from Customer c ORDER BY c.firstName")
    public List<Customer> sortByFirstName();

    @Query("from Customer c ORDER BY c.id")
    public List<Customer> sortByID();

}
