<%-- 
    Document   : login
    Created on : Dec 24, 2016, 2:37:00 PM
    Author     : DN9
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1> ${errorMessage}</h1>
        <form:form id="frmLogin" action="/OnlineTest/login" modelAttribute="login">
            
            User name :  <form:input path="userid"></form:input><br/> 
            Password : <form:password path="password"></form:password> <br/>
             <input type="submit" value="Submit"/>
        </form:form>
        
    </body>
</html>
