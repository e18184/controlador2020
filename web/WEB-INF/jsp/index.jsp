<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
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
