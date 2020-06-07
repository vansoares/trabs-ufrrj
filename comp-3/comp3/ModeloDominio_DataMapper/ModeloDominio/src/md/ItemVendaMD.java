package md;

import java.sql.SQLException;
import java.util.ArrayList;

import mapper.ItemVendaMAPPER;

public class ItemVendaMD {

	private int quantidade;
	private int idMobilia;

	public ItemVendaMD(){
		
	}
	public ItemVendaMD(int quantidade, int idMobilia){
		setId(idMobilia);
		setQuantidade(quantidade);
	}	
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getId() {
		return idMobilia;
	}
	public void setId(int id) {
		this.idMobilia = id;
	}
	
	public static void criar(ArrayList<ItemVendaMD>iv){
		try {
			ItemVendaMAPPER.insereItemVenda(iv);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
