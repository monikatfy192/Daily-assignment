package com.example.hello.mvc.RestController;
import com.example.hello.mvc.entities.CustomerMVC;
import com.example.hello.mvc.services.CustomerServiceMVC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerRestcontrollerWithMVC {

    @Autowired
    private CustomerServiceMVC customerService;

    // get by id
    @GetMapping("/{id}")
    public CustomerMVC getCustomerById(@PathVariable int id ){
        return customerService.getCustomerById(id);
    }
    // get all
    @GetMapping
    public List <CustomerMVC> getAllCustomers(){
        return customerService.getAllCustomers();
    }
    // insert
    @PostMapping
    public CustomerMVC insertCustomer(@RequestBody CustomerMVC c){
        customerService.insertCustomer(c);
        return c;
    }
    //update
    @PutMapping
    public CustomerMVC updatCustomer(@RequestBody CustomerMVC c){
        customerService.updateCustomer(c);
        return c;
    }
    //delete
    @DeleteMapping("/delete")
    public CustomerMVC deleteCustomer(@RequestBody CustomerMVC c){
        customerService.deleteCustomer(c);
        return c;
    }
   }
