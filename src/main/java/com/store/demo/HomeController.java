package com.store.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//to make the below class a controller add the @controller anotation to it
@Controller
public class HomeController {


    //using the value annotaion for getting values form application controller
    @Value("${spring.application.name}")
    private String appName;


    //this method gets called when the root of the website is called
    @RequestMapping("/")
    public String index(){

        System.out.println("appName" + appName);
        //name of the view that should be returned to the browser
        return  "index.html";
    }
}
