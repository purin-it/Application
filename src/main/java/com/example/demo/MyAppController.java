package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyAppController {
    
    @GetMapping("/")
    public String index(Model model) {
    	model.addAttribute("message", "Hello Azure Spring. Updated Folder!!");
        return "index";
    }
    
}
