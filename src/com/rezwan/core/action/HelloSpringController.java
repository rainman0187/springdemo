package com.rezwan.core.action; 
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rezwan.model.User;
import com.rezwan.service.UserService;
    
@Controller   
public class HelloSpringController { 
    
	@Autowired
	private UserService userService;
	
    @RequestMapping(value = "/hello", method = RequestMethod.GET) 
    public String printWelcome(ModelMap model) { 
    	 
     
    	User user=new User(); 
    	user.setId( System.currentTimeMillis() +""  ); 
    	user.setName("rezwan"); 
    	user.setStandard("s"); 
    	user.setAge("23"); 
    	user.setSex("f"); 
    	
    	userService.saveUser( user ); 
    	
    	
        model.addAttribute("message", System.currentTimeMillis()); 
        return "output"; 
    } 
}