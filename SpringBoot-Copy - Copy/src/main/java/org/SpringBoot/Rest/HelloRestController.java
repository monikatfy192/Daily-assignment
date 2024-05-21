package org.SpringBoot.Rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class HelloRestController {

    @GetMapping("/hello")
    public String sayHelloGet(){
        return "hello rest get";
    }

    @PostMapping("/hello")
    public String sayHelloPost(){
        return "hello rest post";
    }

    @DeleteMapping("/hello")
    public String sayHelloDel(){
        return "hello rest delete";
    }

    @PutMapping("/hello")
    public String sayHelloPut(){
        return "hello rest put";
    }

}
