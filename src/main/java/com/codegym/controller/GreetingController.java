package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// các @ được gọi là annoutation.
@Controller
public class GreetingController {
    @GetMapping("/index")// Tương ứng với doget./index là đường dẫn sau link 8080/index?name=Binh.
    public String greeting(@RequestParam(name ="name", required = false) String name , Model model) { // required la mac dinh nos chay
        model.addAttribute("name", name);
        return "index"; // tên file view muốn hiển thị
    }

    @GetMapping("/hello")
    public String hello (){
        return "hello";
    }
}
