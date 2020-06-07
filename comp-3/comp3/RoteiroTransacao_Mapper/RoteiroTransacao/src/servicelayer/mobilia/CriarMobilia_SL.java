package servicelayer.mobilia;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Ambiente;
import entidades.Comodo;
import entidades.Mobilia;
import mapper.ComodoMAPPER;
import mapper.MobiliaMAPPER;
import ts.comodo.AssociarComodo_TS;
import ts.comodo.ListarComodo_TS;
import ts.mobilia.CriarMobilia_TS;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;

@WebServlet("/CriarMobilia")
public class CriarMobilia_SL extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    private ListarComodo_TS listarComodo;
    private CriarMobilia_TS criarMobilia;
    private AssociarComodo_TS associar;

    public CriarMobilia_SL() {
    	listarComodo = new ListarComodo_TS();
    	criarMobilia = new CriarMobilia_TS();
    	associar = new AssociarComodo_TS();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	
    	request.setAttribute("comodos", listarComodo.execute());
		getServletContext().getRequestDispatcher("/CriarMobilia.jsp").forward(request, response);
    	
	}


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<String> comodos = new ArrayList<String>(Arrays.asList(request.getParameter("idComodos").split(",")));
		String desc = request.getParameter("descricao");
		Float custo = Float.valueOf(request.getParameter("custo"));
		int tempoEntrega = Integer.parseInt(request.getParameter("tempoEntrega"));
		
		criarMobilia.execute(desc, custo, tempoEntrega);
		associar.execute(comodos);
		getServletContext().getRequestDispatcher("/ListarMobilia").forward(request, response);
	}

}

