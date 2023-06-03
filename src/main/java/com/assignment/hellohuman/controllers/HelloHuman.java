package com.assignment.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloHuman {

    @RequestMapping("/")
    public String helloName(@RequestParam(value = "name",defaultValue = "human")String name,
                           @RequestParam(value = "lastName",required = false)String lastName,
                            @RequestParam(value = "times",defaultValue = "1")int times){


        if (name!=null && lastName!=null){
            return "Hello " +name+ " " +lastName;
        }  else if (name!=null && times>1) {
            String greeting = "";
            for (int i=0 ; i<times; i++){
                greeting += "Hello " +name+ " ";
        }
            return greeting;

        }else {
            return "Hello " +name;
        }

    }
}
