package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serletSeguro")
public class serletSeguro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serletSeguro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Llegue aca 0");
		if (request.getParameter("Param")!=null)
		{
			System.out.println("LLEgue aca 1");
			if (Integer.parseInt(request.getParameter("Param")) == 1)
			{	
				//AGIRNO PARA QUE SE MUEST EL FORMULARIO
				request.setAttribute("MostrarForm", true);
						
				System.out.println("LLEgue aca 2");
				//VUELVO AL FORMULARIO
				RequestDispatcher rd = request.getRequestDispatcher("/Inicio.jsp");
				rd.forward(request, response);
			}		
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
