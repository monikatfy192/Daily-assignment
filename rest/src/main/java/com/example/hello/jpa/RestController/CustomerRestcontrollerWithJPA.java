package com.example.hello.jpa.RestController;
import com.example.hello.jpa.entities.Customer;
import com.example.hello.jpa.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerRestcontrollerWithJPA {

    @Autowired
    private CustomerService customerService;

    // get by id
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id ){
        return customerService.getCustomerById(id);
    }
    // get all
    @GetMapping
    public List <Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }
    // insert
    @PostMapping
    public Customer insertCustomer(@RequestBody Customer c){
        customerService.insertCustomer(c);
        return c;
    }
    //update
    @PutMapping
    public Customer updatCustomer(@RequestBody Customer c){
        customerService.updateCustomer(c);
        return c;
    }
    //delete
    @DeleteMapping("/delete")
    public Customer deleteCustomer(@RequestBody Customer c){
        customerService.deleteCustomer(c);
        return c;
    }
   }
