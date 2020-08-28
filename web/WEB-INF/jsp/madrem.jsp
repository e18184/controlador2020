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
        * Datos de la Madre
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
                Introdusca el ci del hijo
                <br>
                 <form:label path="hijou.cih"> Cih </form:label>
                <form:input path="hijou.cih"  ></form:input>
                <br>
                  <form:label path="hijou.nombre"> Nombre </form:label>
                <form:input path="hijou.nombre"  ></form:input>
                <br>
                  <form:label path="hijou.ap"> Ap </form:label>
                <form:input path="hijou.ap"  ></form:input>
                <br>
                  <form:label path="hijou.am"> Am </form:label>
                <form:input path="hijou.am"  ></form:input>
                <br>
                <form:button> Aceptar</form:button>
            </form:form>
    </body>
</html>