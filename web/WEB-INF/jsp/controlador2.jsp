<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="y" uri="http://java.sun.com/jsp/jstl/core"%>

<%-- 
    Document   : controlador2
    Created on : 03-ago-2020, 14:34:07
    Author     : HAUSE
--%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola Controlador</title>
    </head>
    <body>
        <h1></h1>
         
        <x:forEach  items="${miprimeravariable}" var="mivar">
            <y:forEach items="${mivar}" var="var2">
            <y:out value="${var2.getRu()}"/>&nbsp
            <y:out value="${var2.getNombre()}"/>&nbsp
            <y:out value="${var2.getApellido()}"/>&nbsp
            <y:out value="${var2.getFechanacimiento()}"/>&nbsp
            
            </y:forEach>
            <br>
        </x:forEach>
            
    </body>
</html>

