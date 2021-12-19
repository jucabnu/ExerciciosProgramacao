<%-- 
    Document   : funcionario
    Created on : 21/02/2017, 20:35:13
    Author     : juliano.vieira
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css"
            href="css/ui-lightness/jquery-ui-1.8.18.custom.css" rel="stylesheet" />
        <script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
        <script type="text/javascript" src="js/jquery-ui-1.8.18.custom.min.js"></script>
        
        <c:import url="barraDeNavegacao.html" />
        
            <title>Alterar Item</title>
    </head>
    
    <body>
        
        <p><a href="index.jsp">Voltar</a></p>
    
    <form method="POST" action='Controller?action=AlteraItem' name="formAlteraItem">
        <table>
            <tr>
                <td>
                    ID : 
                </td>
                <td>
                    <input type="text" readonly="readonly" name="id"
                        value="<c:out value="${item.id}" />" /> 
                </td>
            </tr>
            <tr>
                <td>
                    Nome : 
                </td>
                <td>
                    <input type="text" name="nome"
                        value="<c:out value="${item.nome}" />" />
                </td>
            </tr>
            <tr>
                <td>
                    Bar Code : 
                </td>
                <td>
                    <input type="text" name="barcode"
                        value="<c:out value="${item.barcode}" />" />
                </td>
            </tr>
            
        </table>
        <input type="submit" value="Salvar" />
    </form>
        
        
    </body>
</html>
