<%@ page import="dominio.Seguro" %>
<%@ page import="dominio.TipoSeguros" %>
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
<%
	ArrayList<TipoSeguros> ListTipoSeg = null;
	int autonumerico = 0;
	Seguro seg = new Seguro();
	if (request.getAttribute("ListaTipoSeguros")!=null)
	{
			//ME tira error al castear el dato por eso lo comente			
			ListTipoSeg = (ArrayList<TipoSeguros>)request.getAttribute("ListaTipoSeguros");
	}%>
	
	
<h1>Agregar Seguros</h1>
<form action="serveletSeguro" method="get">
	Id Seguro   <%=seg.getContador() %>
	<br/>
	Descripcion <input type="text" name= "txtDescripcion"/>
	<br/>
	
	Tipo de seguro <select name="TipoSeguro">
     <%for(TipoSeguros TipoSeg : ListTipoSeg)
			{
			 %>
			 <option><%=TipoSeg.getDescripcion() %> </option> 	
	<%} %>
</select>
	
	<br/>
	Costo contratacion <input type="text" name = "txtCosto"/>
	<br/>
	Costo máximo asegurado <input type="text" name = "txtCostoAsegurado"/>
	<br/>
	<input type="submit" value="aceptar" name ="btnAceptar"/>
	
	


	<%	
	//DELCARO 
		int filas = 0;
		//SI RECIBo CantGraba LO ASIGNO A filas
		if (request.getAttribute("CantGraba")!=null)
		{
			filas = Integer.parseInt(request.getAttribute("CantGraba").toString()) ;	
		}		
		if (filas == 1){
			//SI ENTRA ACA NO ES PAGINA INICIAL
			//PaginaInicial = false;
		%>
			<b>Seguro agregado con exito.</b>
	<%} %>

	
</form>
</body>
</html>