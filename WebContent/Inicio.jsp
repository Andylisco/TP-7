<%@ page import="dominio.Seguro" %>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form>
<a href="Inicio.jsp">Inicio</a>
 <a href="serletSeguro?Param=1">Agregar seguro</a>
  <a href="serletSeguro?Param2=2">Listar Seguro</a>

</form>

<%
	//DECLARO UNA BANDERA PARA SABER SI ES LA PAGINA INICIAL
	boolean PaginaInicial = true; 
%>

	<%
	
	
	if (request.getAttribute("MostrarForm") != null) 
	{ 
		//SI ENTRA ACA NO ES PAGINA INICIAL VA AL FORMULARIO DE AGREGAR
		PaginaInicial = false;
		%>
	<form>
			Aca va el form	
	</form>
	
	<%} %>


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
			PaginaInicial = false;
		%>
			<b>Seguro agregado con exito.</b>
	<%} %>

	<%
	ArrayList<Seguro> ListSeg = null;
	if (request.getAttribute("ListaSeguros")!=null)
	{
			//ME tira error al castear el dato por eso lo comente			
			//ListSeg = (ArrayList<Seguro>)request.getAttribute("ListaSeguros");
			
				for (Seguro Seg : ListSeg)
				{
					
				
				//SI ENTRA ACA NO ES PAGINA INICIAL
				PaginaInicial = false;
			%>
			ACA VA LA TABLA
	
	<%			}		
			
	}	%>
	
	
	<%
	if (PaginaInicial)
	{%>
	<br><br>
		<h1>Soy la pagina Inicial</h1>
	<% }	
	%>

</body>
</html>