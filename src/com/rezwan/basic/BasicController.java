package com.rezwan.basic;
 
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
    
@Controller   
public class BasicController { 
    
    @RequestMapping(value = "/basic", method = RequestMethod.GET) 
    public String printWelcome(ModelMap model, HttpSession session) { 
        model.addAttribute("message", "rezwan figured it out" ); 
        return "output"; 
    } 
}