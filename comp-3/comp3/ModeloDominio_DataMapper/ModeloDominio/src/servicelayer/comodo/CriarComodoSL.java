package servicelayer.comodo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mapper.ComodoCompostoMAPPER;
import mapper.ComodoMAPPER;
import md.ComodoCompostoMD;
import md.ComodoMD;

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
    
	public CriarComodoSL() {
		super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			List <ComodoMD> c = ComodoMD.listar();
			request.setAttribute("comodos", c);
		getServletContext().getRequestDispatcher("/CriarComodo.jsp").forward(request, response); 
	}

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String desc = request.getParameter("descricao");
		String tipo = request.getParameter("tipoComodo");
		ComodoMD.criar(desc, tipo);
		if(tipo.equals("ComodoComposto")){
			ArrayList<String> comodos = new ArrayList<String>(Arrays.asList(request.getParameter("idComodos").split(",")));
			ComodoCompostoMD.criar(desc, comodos);
		}
		request.setAttribute("comodo", desc);
		getServletContext().getRequestDispatcher("/ListarComodo").forward(request, response);
	}
	
	

}
