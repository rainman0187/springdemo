package com.rezwan.core.action; 
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
    
@Controller   
public class HelloSpringController { 
    
    @RequestMapping(value = "/hello", method = RequestMethod.GET) 
    public String printWelcome(ModelMap model) { 
        model.addAttribute("message", System.currentTimeMillis()); 
        return "output"; 
    } 
}