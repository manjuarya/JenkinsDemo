package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {

    @RequestMapping("/")
    public String hello(){
        return "Hello";
    }

    @RequestMapping("/hello-person/{name}")
    public String helloPerson(@PathVariable String name){
        return "Hello " + name;
    }

    @RequestMapping("/hello-person-name-age")
    public String helloPersonNameAge(@RequestParam String name, @RequestParam int age){
        return "Hello " + name + " your age is " + age;
    }

    @RequestMapping("/addition")
    public int addition(@RequestParam int a, @RequestParam int b){
        return a+b;
    }

    @RequestMapping("/subtraction")
    public int subtraction(@RequestParam int a, @RequestParam int b){
        return a-b;
    }

    @RequestMapping("/multiplication")
    public int multiplication(@RequestParam int a, @RequestParam int b){
        return a*b;
    }

    @RequestMapping("/division")
    public int division(@RequestParam int a, @RequestParam int b){
        return a/b;
    }
}
