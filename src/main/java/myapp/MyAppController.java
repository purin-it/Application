package myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyAppController {
    
    @RequestMapping("/")
    public String index(Model model) {
    	model.addAttribute("message", "Hello Azure Spring. Updated. Updated Again.");
        return "index";
    }
    
}
