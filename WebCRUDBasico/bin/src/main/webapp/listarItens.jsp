<%-- 
    Document   : listarItens
    Created on : Apr 4, 2017, 7:46:40 PM
    Author     : Juliano
--%>

<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css"
            href="css/ui-lightness/jquery-ui-1.8.18.custom.css" rel="stylesheet" />
        
        <c:import url="barraDeNavegacao.html" />
        
        <title>JSP Page</title>
    </head>
    <body>
        
    <div>        
        <form method="POST" action='Controller?action=BuscaItem' name="formBuscaItem">
        Nome : <input type="text" name="nome">
        <input type="submit" value="Buscar" />
    </form>        
    </div>
       
        
    <hr>
    
    <table>
        <thead>
            <tr>
                <th>Id</th>
                <th>Nome</th>
                <th>Barcode</th>
                
                <th colspan=2>Operação</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${itens}" var="item">
                <tr>
                    <td><c:out value="${item.id}" /></td>
                    <td><c:out value="${item.nome}" /></td>
                    <td><c:out value="${item.barcode}" /></td>                    
                    <td><a href="Controller?action=LoadItem&id=<c:out value="${item.id}"/>">Editar</a></td>
                    <td><a href="Controller?action=DeletaItem&id=<c:out value="${item.id}"/>">Deletar</a></td>

                </tr>
            </c:forEach>
        </tbody>
    </table>
        
        
        
    </body>
</html>
