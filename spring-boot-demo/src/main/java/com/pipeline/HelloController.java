package com.pipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hi")
    public String hi(){
        return "Hi Pipeline";
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello Pipeline";
    }

    @GetMapping("/fortune")
    public String fortune(){
        return "Fortune Pipeline";
    }

    @GetMapping("/greet")
    public String greet(){
        return "Greet Pipeline";
    }
}
