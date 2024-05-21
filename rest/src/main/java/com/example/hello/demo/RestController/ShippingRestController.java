package com.example.hello.demo.RestController;

import com.example.hello.demo.HelloEntity.Adress;
import com.example.hello.demo.HelloEntity.ShippingObj;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shipping")
public class ShippingRestController {
    private ShippingObj shippingData;
    //add shipping data

    //get shipping data
    @GetMapping
    public ShippingObj shippingObj(){
        ShippingObj  shippingObj=new ShippingObj(1,new Adress("egypt", "cairo", "st25"),5 , true);
        return shippingObj;
    }
    @PostMapping
    public String insetShippingData(@RequestBody ShippingObj obj){
        System.out.println("shipping obj : "+obj);
        return  "updated" ;
    }
}
