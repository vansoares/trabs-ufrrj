package md;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.MobiliaDAO;

public class MobiliaMD {
	
	private String id;
	private String descricao;
	private float custo;
	private int tempoEntrega;
	
	public MobiliaMD(String id, String d, float c, int t){
		this.setId(id);
		setDescricao(d);
		setCusto(c);
		setTempoEntrega(t);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getCusto() {
		return custo;
	}

	public void setCusto(float custo) {
		this.custo = custo;
	}

	public int getTempoEntrega() {
		return tempoEntrega;
	}

	public void setTempoEntrega(int tempoEntrega) {
		this.tempoEntrega = tempoEntrega;
	}
	
	public static void alterar(String id, String desc, float custo, int tempoEntrega, ArrayList<String>comodos){
		MobiliaMD m = new MobiliaMD(id, desc, custo, tempoEntrega);
		try {
			MobiliaDAO.alterMobilia(m, comodos);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void criar(String desc, float custo, int tempoEntrega){
		try {
			MobiliaDAO.insereMobilia(desc, custo, tempoEntrega);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static List<MobiliaMD>  listar(){
		List<MobiliaMD> l = null ; 
		try {
			l = MobiliaDAO.listaMobilia();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
	
	public static List<MobiliaMD>  listarMobiliaComodo(String id){
		List <MobiliaMD> l = new ArrayList<MobiliaMD>();
		try {
			l = MobiliaDAO.listMobiliaComodo(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
	
	public static void deletar(String id){
		try {
			MobiliaDAO.deleteMobilia(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
