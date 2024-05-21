package org.example;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @RequestMapping("/login" )
    public String showlogin(){
        return "login";
    }
    //without spring
//    @RequestMapping("/confirm")
//    public String submitLoginForm(HttpServletRequest request, Model model){
//        Integer age = Integer.valueOf(request.getParameter("age"));
//        String userName= request.getParameter("username");
//        model.addAttribute("msg", "next year, you will be "+ (age+1) );
//        model.addAttribute("message","user name is "+ userName);
//        return "confirmation";
//    }
    //with spring
    @RequestMapping("/confirm")
    public String submitLoginForm(@RequestParam("username") String userName,@RequestParam("age") int age, Model model){
        model.addAttribute("msg", "next year, you will be "+ (age+1) );
        model.addAttribute("message","user name is "+ userName);
        return "confirmation";
    }

}
