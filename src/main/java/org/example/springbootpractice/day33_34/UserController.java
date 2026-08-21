package org.example.springbootpractice.day33_34;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @Autowired
    UserRespository userRespository;

    @GetMapping("/hello")
    public String hello(){
       return userRespository.sayHello();
    }
}
