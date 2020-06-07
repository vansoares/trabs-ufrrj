package gateway;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import entidades.Ambiente;

public class AmbienteGTW extends ConnectionBD{

	
	public  static void insereAmbiente(int paredes, int portas, float metragem, float custo) throws SQLException{
		
		Connection conn = null;
		 try
	        {
	                conn = getConnection();
	            	PreparedStatement stmt = conn.prepareStatement("INSERT INTO ambiente (paredes, portas, metragem, id_contrato, custo) VALUES"+
	            								"( ?,?,?, (select id from contrato order by id desc limit 1), ?);");
	            	stmt.setInt(1, paredes);
	            	stmt.setInt(2, portas);
	            	stmt.setFloat(3, metragem);
	            	stmt.setFloat(4, custo);
                    stmt.execute();
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
	
	public static List<Ambiente> listaAmbiente() throws SQLException{
		Connection conn = null;
		Statement stmt = null;
		String sql = "select * from ambiente order by id;";
		List<Ambiente> l = new ArrayList<Ambiente>();
		 try
	        {
             conn = getConnection();

	            	stmt = conn.createStatement();
	            	ResultSet rs = stmt.executeQuery(sql);
	            	while(rs.next()){
	            		int id = rs.getInt("id");
	            		int paredes = rs.getInt("paredes");
	            		int portas = rs.getInt("portas");
	            		Float metragem = Float.valueOf(rs.getString("metragem"));
	            		Ambiente c = new Ambiente(id,paredes,portas,metragem); 
	            		l.add(c);
	            	}
	            }
	        
	        catch(Exception e) 
	        {
	            e.printStackTrace();
	        }
		 	finally
		 	{
		 		conn.close();
		 	}
		return l;
		
	}

	public static void insertTempoAmbiente(int tempo) throws SQLException{
		Connection conn = null;
		 try
	        {
             conn = getConnection();

	            	PreparedStatement stmt = conn.prepareStatement("UPDATE ambiente SET tempo_entrega=? "
											            		   + "WHERE id=(select id from ambiente order by id desc limit 1);");
	            	stmt.setInt(1, tempo);
	                stmt.execute();
	                stmt.close();
	                
	               // if(rst.next())
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
	
	public static List<Ambiente> selectAmbiente() throws SQLException{
		Connection conn = null;
		List<Ambiente> a = new ArrayList<>();
		Statement stmt = null;
		 try
	        {
             conn = getConnection();
	             	stmt = conn.createStatement();

	            	String sql = "select * from ambiente where id_contrato=(select id from contrato order by id desc limit 1);";
	                
	             	ResultSet rs = stmt.executeQuery(sql);
	             	while(rs.next()){
	             		int paredes = rs.getInt("paredes");
	             		int portas = rs.getInt("portas");
	             		float metragem = rs.getFloat("metragem");
	             		float custo = rs.getFloat("custo");
	             		int tempo = rs.getInt("tempo_entrega");
	             		a.add(new Ambiente(paredes, portas, metragem, custo, tempo));
	             	}
	             	stmt.close();
		               
	                
	               // if(rst.next())
	            }
	        
	        catch(Exception e) 
	        {
	            e.printStackTrace();
	        }
		 	finally
		 	{
		 		conn.close();
		 	}
		 return a;
		
	}
	
	
}
