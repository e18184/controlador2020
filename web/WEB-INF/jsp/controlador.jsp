<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
        
            <form:form action="controlador.htm" method="post" commandName="persona">
            <form:label path="nombre">Nombre </form:label>
                <form:input path="nombre"></form:input>
                <br>
                 <form:label path="apellido">Apellido </form:label>
                <form:input path="apellido"></form:input>
                <br>
                 <form:label path="edad">Edad </form:label>
                <form:input path="edad"></form:input>
                <br>
                <br>
                 <form:label path="lugarnacimiento">Lugar de nacimiento </form:label>
                <form:input path="lugarnacimiento"></form:input>
                <br>
                <form:button>Aceptar</form:button>
            </form:form>
    </body>
</html>
