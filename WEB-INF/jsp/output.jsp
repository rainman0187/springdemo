<%@page import="com.rezwan.model.User"%>
<%@page import="com.rezwan.service.UserService"%>
<%@page import="org.springframework.beans.factory.annotation.Autowired"%>
<%@page import="org.springframework.web.context.support.SpringBeanAutowiringSupport"%>

<%!
	public void jspInit() 
	{
	    SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
	    getServletContext());
	}

	@Autowired
	UserService userService; 
%> 


<%
	User user=new User(); 
	user.setId( System.currentTimeMillis() +""  ); 
	user.setName("rezwan222222"); 
	user.setStandard("s"); 
	user.setAge("3323"); 
	user.setSex("m"); 
	
	userService.saveUser( user ); 

%>




<html>
<body>
    <h2>Here is the message from HelloSpringController.</h2>
    <p>
       aa ${message}
    </p> 
</body>
</html>