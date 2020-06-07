package servicelayer.comodo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Comodo;
import mapper.*;
import tm.Comodo_TM;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

@WebServlet("/AlterarComodo")
public class AlterarComodoSL extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    private Comodo_TM comodo;

    
    public AlterarComodoSL() {
    	comodo = new Comodo_TM();

        // TODO Auto-generated constructor stub
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	String id = request.getParameter("id"); //id
    	String path = ""; 
		RequestDispatcher rd = null;
		String m = request.getParameter("method"); 
		String desc = request.getParameter("desc");
		String tipo = request.getParameter("tipo");

		if(m.equals("delete")){
			try {
				comodo.DeletarComodo(id);
				path = "/ListarComodo";
			} catch (Exception e) {
				e.printStackTrace();
				path = "/ListarComodo";
			}
		}else{
			try {
				comodo.alterarComodo(id, desc, tipo);
				path = "/ListarComodo";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				path = "/ListarComodo";
				
			}
		}
		rd = getServletContext().getRequestDispatcher(path);
	    rd.forward(request, response);
	}
}
	



