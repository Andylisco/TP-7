<%@ page import="dominio.Seguro" %>
<%@ page import ="java.io.*"%>
<%@ page import ="java.util.*"%>
<%@ page import ="java.util.List.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="">
	<a href="Inicio.jsp">Inicio</a>
	<a href="serletSeguro?Param=1">Agregar seguro</a>
	<a href="serletSeguro?Param2=2">Listar Seguro</a>
</form>
<h1>Agregar Seguros</h1>
<form action="serveletSeguro" method="get">
	Id Seguro   <input value= "1"/>
	<br/>
	Descripcion <input type="text" name= "txtDescripcion"/>
	<br/>
	Tipo de seguro <select name="tipo de seguro">
	<option value="1"/>
	</select> 
	
	<br/>
	Costo contratacion <input type="text" name = "txtCosto"/>
	<br/>
	Costo máximo asegurado <input type="text" name = "txtCostoAsegurado"/>
	<br/>
	<input type="submit" value="aceptar" name ="btnAceptar"/>
</form>
</body>
</html>