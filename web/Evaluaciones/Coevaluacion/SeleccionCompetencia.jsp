<%-- 
    Document   : SeleccionarCompetencia
    Created on : Nov 1, 2010, 11:59:09 PM
    Author     : sands
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Favor de seleccionar la competencia a evaluar:</h1>
        <form action="crearAE.do" method="POST">
            <select name="ID">
                <c:forEach items="${Competencias}" var="competencia">
                    <option value="${competencia.competencia_ID}">${competencia.des_Competencia}</option>
                </c:forEach>
            </select>
            <input type="submit" value="Aceptar"/>
        </form>
    </body>
</html>
