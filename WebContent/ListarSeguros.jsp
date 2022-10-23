<%@ page import="dominio.Seguro" %>
<%@ page import="dominio.TipoSeguros" %>
<%@ page import ="java.io.*"%>
<%@ page import ="java.util.*"%>
<%@ page import ="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b>"Tipo de seguros de la base de datos"</b>

</br>Busqueda por tipos de seguros:

<!-- setea arraylist TipoSeguros -->
  <%
	ArrayList<TipoSeguros> ListTipoSeg = null;
	if (request.getAttribute("ListaTipoSeguros")!=null)
	{
			//ME tira error al castear el dato por eso lo comente			
			ListTipoSeg = (ArrayList<TipoSeguros>)request.getAttribute("ListaTipoSeguros");
	}%>


 <select name="TipoSeguro">
 <%for(TipoSeguros TipoSeg : ListTipoSeg)
			{
			 %>
			 <option><%=TipoSeg.getDescripcion() %> </option> 	
	<%} %>
</select>
 <input type="submit" name="btnFiltrar" value="Filtrar">
 
 
 <!-- setea arraylistSeguros -->
<%
	ArrayList<Seguro> ListSeg = null;
	if (request.getAttribute("ListaSeguros")!=null)
	{
			//ME tira error al castear el dato por eso lo comente			
			ListSeg = (ArrayList<Seguro>)request.getAttribute("ListaSeguros");
	}%>		
				
					
	<% 			
				//SI ENTRA ACA NO ES PAGINA INICIAL
				//PaginaInicial = false;
			%>
			<table border="1">
			<tr> <th>ID Seguro</th>  <th>Descripcion Seguro</th> <th>Descripcion Tipo Seguro</th> <th>Costo contratacion</th> <th>Costo maximo asegurado</th> </tr>
			<%for(Seguro Seg : ListSeg)
			{
			 %>
			 <tr> 
			 <td><%=Seg.getId() %></td> 
			 <td><%=Seg.getDescripcion() %></td> 
			 <td><%=Seg.getIdTipo() %></td> 
			 <td><%=Seg.getCostoContratacion() %></td> 
			 <td><%=Seg.getCostoAsegurado() %></td> 
			 </tr>
			
	<%} %>
	</table>
</body>
</html>