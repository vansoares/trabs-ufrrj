package servicelayer.contrato;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Contrato;
import entidades.Comodo;
import entidades.Mobilia;
import mapper.AmbienteMAPPER;
import mapper.ComodoMAPPER;
import mapper.ContratoMAPPER;
import mapper.ItemVendaMAPPER;
import mapper.MobiliaMAPPER;
import ts.contrato.CriarContrato_TS;
import ts.mobilia.ListarMobiliaComodo_TS;
import entidades.Contrato;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;

@WebServlet("/CriarContrato")
public class CriarContrato_SL extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private ListarMobiliaComodo_TS listar;
	private CriarContrato_TS criarContrato;

    public CriarContrato_SL() {
    	criarContrato = new CriarContrato_TS();
    	listar = new ListarMobiliaComodo_TS();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		criarContrato.execute();
    	getServletContext().getRequestDispatcher("/CriarAmbiente").forward(request, response);
	}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/CrListarContrato").forward(request, response);
	}
	
	public List<Mobilia> listaMobiliaComodo(String id){
		List<Mobilia> l = listar.execute(id);
		return l;
	}
	
}

