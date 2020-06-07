package md;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import dao.ComodoDAO;

public abstract class ComodoMD {

	private String id;
	private String descricao;
	
	/*public Comodo(String id, String d){
		setDescricao(d);
		setId(id);
	}
	*/
	
	abstract public List<MobiliaMD> listaMobiliaDisponivel(List <String> set);
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public static void criar(String desc, String tipo){
		try {
			ComodoDAO.insereComodo(desc, tipo);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void associar(ArrayList<String> comodos){
		
		try {
			ComodoDAO.associarComodo(comodos);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void delete(String id){
		try {
			ComodoDAO.deleteComodo(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static List<ComodoMD>  listar(){
		List<ComodoMD> l = null ; 
		try {
			l = ComodoDAO.listaComodo();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
	
	public static void alterar(String id, String method, String desc){
		try {
			ComodoDAO.alterComodo(id, desc);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
}