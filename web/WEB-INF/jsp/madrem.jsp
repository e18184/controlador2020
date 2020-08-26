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
        
            <form:form action="madrem.htm" method="post" modelAttribute="persona">
            <form:label path="cim">Cim </form:label>
                <form:input path="cim"></form:input>
                <br>
                 <form:label path="nombre">Nombre </form:label>
                <form:input path="nombre"></form:input>
                <br>
                 <form:label path="ap">Ap </form:label>
                <form:input path="ap"></form:input>
                <br>
                <br>
                 <form:label path="am">Am </form:label>
                <form:input path="am"></form:input>
                <br>
                *Hijos
                  <form:label path="hijo">Am </form:label>
                <form:input path="hijo"></form:input>
            </form:form>
    </body>
</html>