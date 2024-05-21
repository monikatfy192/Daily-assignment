package org.SpringBoot.Rest;

import org.SpringBoot.Entities.Address;
import org.SpringBoot.Entities.ShippingObj;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shipping")
public class ShippingRestController {

    private ShippingObj shippingData;

    // add shipping data
    @PostMapping("/")
    public String insertData(@RequestBody ShippingObj obj){
        System.out.println("shipping data: "+obj);
        return "your obj has been added";
    }

    // get shipping data
    @GetMapping("/")
    public ShippingObj getShopping(){
        ShippingObj obj=new ShippingObj("dhgcfh", new Address("Egypt", "Cairo", "Salah Salem St."),1000, true);
        return obj;
    }







}
