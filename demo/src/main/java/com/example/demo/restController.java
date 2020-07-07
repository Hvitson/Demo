package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

@RestController
public class restController {

    @RequestMapping("/welcome")
    public String welkom (@RequestParam(name="name") String name) {
        return "Welkom " + name +"!";
    }

    @RequestMapping("/current-date")
        public String currentDate(){
            DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
            Date dateobj = new Date();
            return df.format(dateobj);
        }
}

