<%-- 
    Document   : objetos
    Created on : 19-ago-2020, 14:30:20
    Author     : HAUSE
--%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form:form action="objetos.htm" method="post" commandName="estudiante">
             <form:label path="ru">Ru </form:label>
                <form:input path="ru"></form:input>
                <br>
                <br>
            <form:label path="nombre">Nombre </form:label>
                <form:input path="nombre"></form:input>
                <br>
                 <form:label path="apellido">Apellido </form:label>
                <form:input path="apellido"></form:input>
                <br>
                
                 <form:label path="fechanacimiento">Lugar de nacimiento </form:label>
                <form:input path="fechanacimiento"></form:input>
                <br>
                <form:form action="objetos.htm" method="post" commandName="materias">
                     <form:label path="sigla">Sigla </form:label>
                    <form:input path="sigla"></form:input>
                    <br>
                    <form:label path="NombreMat">Materia </form:label>
                    <form:input path="NombreMat"></form:input>
                    <br>
                     <form:button>Aceptar</form:button>
                </form:form>
               
            </form:form>
    </body>
</html>
