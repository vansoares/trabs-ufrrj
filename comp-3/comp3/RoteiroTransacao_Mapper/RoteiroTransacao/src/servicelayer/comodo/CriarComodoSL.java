package servicelayer.comodo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Ambiente;
import entidades.Comodo;
import mapper.ComodoCompostoMAPPER;
import mapper.ComodoMAPPER;
import ts.comodo.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;

@WebServlet("/CriarComodo")
public class CriarComodoSL extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	private CriarComodo_TS criar;
	private ListarComodo_TS listar;
	private CriarComodoComposto_TS criarCC;

	public CriarComodoSL() {
    	criar = new CriarComodo_TS();
    	criarCC = new CriarComodoComposto_TS();
    	listar = new ListarComodo_TS();


        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			List <Comodo> c = listar.execute();
			request.setAttribute("comodos", c);
		getServletContext().getRequestDispatcher("/CriarComodo.jsp").forward(request, response); 
	}

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String desc = request.getParameter("descricao");
		String tipo = request.getParameter("tipoComodo");
		criar.execute(desc, tipo);
		if(tipo.equals("ComodoComposto")){
			ArrayList<String> comodos = new ArrayList<String>(Arrays.asList(request.getParameter("idComodos").split(",")));
			criarCC.execute(comodos);
		}
		request.setAttribute("comodo", desc);
		getServletContext().getRequestDispatcher("/ListarComodo").forward(request, response);
	}
	
	

}

