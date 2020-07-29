<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : controlador
    Created on : 27-jul-2020, 14:53:06
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
            <x:if test="${mivar.getEdad()==31}">
            <x:out value="${mivar.getNombre()}"/>&nbsp
            <x:out value="${mivar.getApellido()}"/>&nbsp
            <x:out value="${mivar.getEdad()}"/>
            </x:if>
            
            <br>
        </x:forEach>
    </body>
</html>
