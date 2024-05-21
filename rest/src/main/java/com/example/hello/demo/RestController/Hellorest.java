package com.example.hello.demo.RestController;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class Hellorest {
    @GetMapping("/hello")
    public String SayHello(){
        return "hello from rest";
    }
    @PostMapping("/hello")
    public String postHello(){
        return "post from rest";
    }
    @DeleteMapping("/hello")
    public String deleteHello(){
        return "delete from rest";
    }
    @PutMapping("/hello")
    public String putHello(){
        return "put from rest";
    }

}
