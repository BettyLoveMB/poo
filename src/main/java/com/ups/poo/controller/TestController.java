package com.ups.poo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {
    @GetMapping("test")
    public String test(){
        return "hello word, this is my first Project!.....";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam String name,
                       @RequestParam String lastName){
        return " this is my first SpringBootProject!,  and my name is:" + name + " " + lastName;
        //http://localhost:8080/hello?name=Betty&lastName=Maldonado
    }

    @GetMapping("/concat/{name}/{lastname}")
    public String concat (@PathVariable String name,
                               @PathVariable String lastname) {//que pones / {} y el nombre
        return " this is my second rest service ,  and my name is:" + name + " " + lastname;
    }
    //http://localhost:8080/concat/Betty/Maldonado
}
