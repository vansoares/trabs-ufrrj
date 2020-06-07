package DomainModel_ActiveRecord;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


public class ItemVendaMD extends ConnectionBD{

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
			insereItemVenda(iv);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//----------------------------------------------------------------------------------------------------------
	//										SQL						
	//----------------------------------------------------------------------------------------------------------
	
	
public static void insereItemVenda(ArrayList<ItemVendaMD> iv) throws SQLException{
		
		Connection conn = null;
		 try
	        {
             conn = getConnection();

	            	PreparedStatement stmt = conn.prepareStatement("INSERT INTO item_venda (id_ambiente, id_mobilia, quantidade) VALUES"+
	            								"( (select id from ambiente order by id desc limit 1),?,?);");
	            	 for(ItemVendaMD i: iv){
	            		  stmt.setInt(1, i.getId());
	            	      stmt.setInt(2, i.getQuantidade());
		                  stmt.execute();
	            	 }
	            	   stmt.close();
	            }
	        
	        catch(Exception e) 
	        {
	            e.printStackTrace();
	        }
		 	finally
		 	{
		 		conn.close();
		 	}
		
	}
	
}