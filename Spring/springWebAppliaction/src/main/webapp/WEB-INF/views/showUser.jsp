<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>

</head>
<body>
    <div align="center">
        <h2>Spring MVC CRUD Demo </h2>
        <form:form modelAttribute="user" action="addedUser" method="POST" >
        
        <table border="1" width="90%">
        
               
    <tr>
        <td>Email</td>
        <td><form:input path="name"/></td>
    </tr>
    <tr>
        <td>Password</td>
        <td><form:input path="id" /></td>
    </tr>
    <tr>
        
        <td colspan="2">
            <input type="submit" value="Add User"/>
        </td>
    </tr>
</table>
</form:form> 

 <div style="color: red">${error}</div> 
    </div>

</body>
</html>