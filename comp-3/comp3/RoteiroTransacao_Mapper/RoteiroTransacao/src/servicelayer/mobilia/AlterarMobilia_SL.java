package servicelayer.mobilia;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.postgresql.util.PSQLException;

import entidades.Comodo;
import entidades.Mobilia;
import mapper.ComodoMAPPER;
import mapper.MobiliaMAPPER;
import ts.comodo.ListarComodo_TS;
import ts.mobilia.AlterarMobilia_TS;
import ts.mobilia.DeletarMobilia_TS;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;

@WebServlet("/AlterarMobilia")
public class AlterarMobilia_SL extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private ListarComodo_TS listarComodos;
	private AlterarMobilia_TS alterarMobilia;
	private DeletarMobilia_TS deletarMobilia;

    
    public AlterarMobilia_SL() {
    	listarComodos = new ListarComodo_TS();
    	alterarMobilia = new AlterarMobilia_TS();
    	deletarMobilia = new DeletarMobilia_TS();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("desc", request.getParameter("desc"));
		request.setAttribute("custo", request.getParameter("custo"));
		request.setAttribute("tempo", request.getParameter("tempo"));
		request.setAttribute("comodos", listarComodos.execute());
		String id = request.getParameter("id");
		request.setAttribute("id", id);
		getServletContext().getRequestDispatcher("/AlterarMobilia.jsp").forward(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<String> comodos = new ArrayList<String>(Arrays.asList(request.getParameter("idComodos").split(",")));
    	String id = request.getParameter("idHidden");
		String m = request.getParameter("method"); 
		String desc = request.getParameter("desc");
		Float custo = Float.valueOf(request.getParameter("custo"));
		int tempoEntrega = Integer.parseInt(request.getParameter("tempoEntrega"));
		if(m.equals("delete")){
				deletarMobilia.execute(id);
		}else{
				alterarMobilia.execute(id, desc, custo, tempoEntrega, comodos);
		}
		getServletContext().getRequestDispatcher("/ListarMobilia").forward(request, response);
	}
	

}

