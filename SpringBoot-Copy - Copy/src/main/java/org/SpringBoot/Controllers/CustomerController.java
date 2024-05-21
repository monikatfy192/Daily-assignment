package org.SpringBoot.Controllers;

import org.SpringBoot.Entities.Customer;
import org.SpringBoot.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService cs;

    @RequestMapping("/add")
    public String addCustomer(Model model){
        model.addAttribute("customer", new Customer());
        return "add-customer";
    }

    @RequestMapping("/process")
    public String processAddCustomer(Customer customer, Model model, BindingResult bindingResult){
        cs.insertCustomer(customer);
        model.addAttribute("customer", cs.getAllCustomers());
        if(bindingResult.hasErrors())
            return "add-customer";
        else return "customer-list";
    }

    @RequestMapping("/showAll")
    public String showCustomers(Model model){
        model.addAttribute("customer", cs.getAllCustomers());
        return "customer-list";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable int id, Model model){
        cs.deleteCustomer(id);
        model.addAttribute("customer", cs.getAllCustomers());
        return "customer-list";
    }

    @RequestMapping("/updateCustomer/{id}")
    public String updateCustomer(@PathVariable int id, Model model){
        model.addAttribute("customer", cs.getCustomerByID(id));
        return "update-customer";
    }

    @RequestMapping("/updateCustomer/update")
    public String processUpdateCustomer(Customer customer, Model model, BindingResult bindingResult){
        cs.updateCustomer(customer);
        model.addAttribute("customer", cs.getAllCustomers());
        if(bindingResult.hasErrors())
            return "update-customer";
        else return "customer-list";
    }

    @RequestMapping("/name-sort")
    public String sort(Model model){
        model.addAttribute("customer", cs.sortCustomerByName());
        return "customer-list";
    }

    @RequestMapping("/id-sort")
    public String sortByID(Model model){
        model.addAttribute("customer", cs.sortCustomerByID());
        return "customer-list";
    }

    @RequestMapping("/back")
    public String cancel(Model model){
        model.addAttribute("customer", cs.sortCustomerByName());
        return "customer-list";
    }


}
