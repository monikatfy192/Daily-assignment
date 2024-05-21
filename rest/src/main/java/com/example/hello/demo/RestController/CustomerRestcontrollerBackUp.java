package com.example.hello.demo.RestController;

import com.example.hello.demo.dao.NewCustomerDOA;
import com.example.hello.demo.entities.CustomerBackUp;
import com.example.hello.demo.dao.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerRestcontrollerBackUp {
    @Autowired
    private CustomerDAO customerDAO;

    @Autowired
    private NewCustomerDOA newcustomerDAO;

    // get by id
    @GetMapping("/{id}")
    public CustomerBackUp getCustomerById(@PathVariable int id ){
        return customerDAO.getCustomerById(id);
    }
    // by name
    @GetMapping("/name/{fname}/{lname}")
    public CustomerBackUp getCustomerByName(@PathVariable String name , String lname){
        return newcustomerDAO.findCustomerByLastNameOrFirstName(name, lname);
    }

    // by name like
    @GetMapping("/name/{name}")
    public List <CustomerBackUp> getCustomerById(@PathVariable String name ){
        return newcustomerDAO.findCustomerByFirstNameLikeName(name);
    }
    // get all
    @GetMapping
    public List <CustomerBackUp> getAllCustomers(){
        return customerDAO.getAllCustomers();
    }
    // insert
    @PostMapping
    public CustomerBackUp insertCustomer(@RequestBody CustomerBackUp c){
        customerDAO.insertCustomer(c);
        return c;
    }
    //update
    @PutMapping
    public CustomerBackUp updatCustomer(@RequestBody CustomerBackUp c){
        customerDAO.updateCustomer(c);
        return c;
    }
    //delete
    @DeleteMapping("/delete")
    public CustomerBackUp deleteCustomer(@RequestBody CustomerBackUp c){
        customerDAO.deleteCustomer(c);
        return c;
    }
    //sort
    @GetMapping("/sort")
    public List <CustomerBackUp> sortCustomers(){
        return customerDAO.sortCustomers();
    }

}
