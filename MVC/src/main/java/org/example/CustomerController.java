package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.naming.Binding;
import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @RequestMapping("/add")
    public String addCustomerForm(Model model){
        model.addAttribute("newcustomer",new Customer());
        return "add-customer";
    }
    @RequestMapping("/addconfirm")
    public  String processAddCustomer(@Valid @ModelAttribute("newcustomer") Customer c,
                                      BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return"add-customer";
        }else {
            System.out.println("customer data "+ c);
            return "add-customer-confirmation";
        }
    }
}
