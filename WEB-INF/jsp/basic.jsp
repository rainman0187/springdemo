<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
    <h2>Here is the message from HelloSpringController.</h2>
    <p>
        ${message}
        
        <img src='<c:url value='/resources/images/hello_world.png' />' />
    </p> 
</body>
</html>