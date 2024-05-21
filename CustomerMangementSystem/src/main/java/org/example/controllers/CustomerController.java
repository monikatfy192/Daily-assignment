package org.example.controllers;

import org.example.entities.Customer;
import org.example.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.constraints.Email;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/list-customer")
    public String listCustomer(Model model){
        model.addAttribute("theCustomer",customerService.getAllCustomers());
        return "listCustomer";
    }

    @RequestMapping("/add-customer")
    public String showCustomerForm(Model model){
        model.addAttribute("theCustomer",new Customer());
        return "addCustomer";
    }

    @RequestMapping("/processAdd")
    public String processAddCustomer(Customer customer ,BindingResult bindingResult ,Model model ){
        customerService.insertCustomer(customer);
        model.addAttribute("theCustomer",customerService.getAllCustomers());
        if(bindingResult.hasErrors())
            return "addCustomer";
        else
            return "listCustomer";
    }

    //@RequestMapping("/delete")
    //public String deleteCustomer(){}

    @RequestMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable int id, Model model){
        Customer customer = customerService.getCustomerById(id);
        customerService.deleteCustomer(customer);
        model.addAttribute("theCustomer",customerService.getAllCustomers());
        return "listCustomer";
    }

    @RequestMapping("/{id}")
    public String updateCustomer(@PathVariable int id, Model model){
        Customer customer = customerService.getCustomerById(id);
        model.addAttribute("theCustomer",customer);
        return "updateCustomer";
    }
    @RequestMapping("/updateProcess")
    public String processUpdate(Customer customer,Model model){
        customerService.updateCustomer(customer);
        model.addAttribute("theCustomer",customerService.getAllCustomers());
        return "listCustomer";
    }
}
