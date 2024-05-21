package com.example.hello.mvc.controllers;

import com.example.hello.mvc.entities.CustomerMVC;
import com.example.hello.mvc.services.CustomerServiceMVC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
public class CustomerControllerMVC {

    @Autowired
    private CustomerServiceMVC customerService;

    @RequestMapping("/list-customer")
    public String listCustomer(Model model){
        model.addAttribute("theCustomer",customerService.getAllCustomers());
        return "listCustomer";
    }

    @RequestMapping("/add-customer")
    public String showCustomerForm(Model model){
        model.addAttribute("theCustomer",new CustomerMVC());
        return "addCustomer";
    }

    @RequestMapping("/processAdd")
    public String processAddCustomer(CustomerMVC customer , BindingResult bindingResult , Model model ){
        customerService.insertCustomer(customer);
        model.addAttribute("theCustomer",customerService.getAllCustomers());
        if(bindingResult.hasErrors())
            return "addCustomer";
        else
            return "listCustomer";
    }

    @RequestMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable int id, Model model){
        CustomerMVC customer = customerService.getCustomerById(id);
        customerService.deleteCustomer(customer);
        model.addAttribute("theCustomer",customerService.getAllCustomers());
        return "listCustomer";
    }

    @RequestMapping("/{id}")
    public String updateCustomer(@PathVariable int id, Model model){
        CustomerMVC customer = customerService.getCustomerById(id);
        model.addAttribute("theCustomer",customer);
        return "updateCustomer";
    }
    @RequestMapping("/updateProcess")
    public String processUpdate(CustomerMVC customer, Model model){
        customerService.updateCustomer(customer);
        model.addAttribute("theCustomer",customerService.getAllCustomers());
        return "listCustomer";
    }

}
