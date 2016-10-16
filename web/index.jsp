<%-- 
    Document   : index
    Created on : 04/09/2016, 22:29:10
    Author     : dunkelheit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Converter Temperatura</title>
    </head>
    <body>
        <form action="converter">
		<h1>Selecione o tipo de conversão:</h1>
		<select id="temp" name="temp_select">
			<option value="celsius">Celsius para Fahrenheit</option>
			<option value="fahrenheit">Fahrenheit para Celsius</option>
		</select> <input type="text" name="valor" /> 
		<input type="submit" value="converter"/>
	</form>
    </body>
</html>
