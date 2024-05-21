package org.SpringBoot.Rest;

import org.SpringBoot.DAO.CustomerDAO;
import org.SpringBoot.DAO.JPACustomerDAO;
import org.SpringBoot.Entities.Customer;
import org.SpringBoot.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {

    @Autowired
    private CustomerService cs;


//    @GetMapping("/{id}")
//    public Customer getCustomerByID(@PathVariable int id){
//        return dao.findById(id).get();
//        //return cs.getCustomerByID(id);
//    }

//    @GetMapping("/")
//    public Customer getCustomer(@RequestBody int id){
//        return cs.getCustomerByID(id);
//    }

    @GetMapping("/{id}")
    public Customer getCustomerByID(@PathVariable int id){
        return cs.getCustomerByID(id);
    }

    @GetMapping("/name/{name}")
    public List<Customer> getCustomerByName(@PathVariable String name){
        return cs.findByFirstName(name);
    }

    @GetMapping("/name/{fname}/{lname}")
    public List<Customer> getCustomersByID(@PathVariable String fname, @PathVariable String lname){
        return cs.findByFirstNameOrLastName(fname, lname);
    }

    @GetMapping("/name/like/{name}")
    public List<Customer> getCustomersByName(@PathVariable String name){
        return cs.findCustomerLikeName(name);
    }

    @GetMapping("/")
    public List<Customer> getAllCustomers(){
        return cs.getAllCustomers();
    }

    @PostMapping("/")
    public Customer insertCustomer(@RequestBody Customer customer){
        cs.insertCustomer(customer);
        return customer;
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable int id){
        cs.deleteCustomer(id);
        return "customer has been deleted";
    }

    @PutMapping("/")
    public Customer updateCustomer(@RequestBody Customer customer){
        cs.updateCustomer(customer);
        return customer;
    }


}
