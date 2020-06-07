package DomainModel_ActiveRecord;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.sql.Connection;


public class AmbienteMD extends ConnectionBD{

	private int id;
	private int numParedes;
	private int numPortas;
	private float metragem;
	private float custo;
	private int tempo;
	
	public AmbienteMD(int i, int paredes, int portas, float m){
		setId(i);
		setNumParedes(paredes);
		setNumPortas(portas);
		setMetragem(m);
	}
	
	public AmbienteMD(int paredes, int portas, float m){
		setNumParedes(paredes);
		setNumPortas(portas);
		setMetragem(m);
	}
	
	public AmbienteMD(int paredes, int portas, float m, float c, int t){
		setNumParedes(paredes);
		setNumPortas(portas);
		setMetragem(m);
		setCusto(c);
		setTempo(t);
	}
	
	public AmbienteMD(){}
	
	public int getNumParedes() {
		return numParedes;
	}

	public void setNumParedes(int numParedes) {
		this.numParedes = numParedes;
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	public float getMetragem() {
		return metragem;
	}

	public void setMetragem(float metragem) {
		this.metragem = metragem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public float custo(ArrayList<ItemVendaMD> iv){
		float total = 0;
		MobiliaMD m = new MobiliaMD();

		for(ItemVendaMD i: iv){
			try {
				m= m.getMobiliaById(i.getId());
				total = total + (m.getCusto()*i.getQuantidade());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		total = (float) (total + (10*getNumParedes()) + (5*getNumPortas()) + (2.5*getMetragem()));
		return total;
	}
	
	public void tempoEntrega(){
		int total = 0;
		int t =0; 
		MobiliaMD m = new MobiliaMD();
			try {
				t = m.getMobiliaByTempo();
				total = t + (2*getNumParedes())+(getNumPortas()/2);
				this.insertTempoAmbiente(total);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public float getCusto() {
		return custo;
	}

	public void setCusto(float custo) {
		this.custo = custo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	public  void criar(int paredes, int portas, float metragem, ArrayList<ItemVendaMD> iv){
		AmbienteMD a = null; 
		try {
			a = new AmbienteMD(paredes, portas, metragem);
			float custo = a.custo(iv);
			this.insereAmbiente(custo);
			a.tempoEntrega();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<AmbienteMD>  get(){
		List<AmbienteMD> l = null ; 
		try {
			l =this.selectAmbiente();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
	
	public List<AmbienteMD>  listar(){
		List<AmbienteMD> l = null ; 
		try {
			l =this.listaAmbiente();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
	

	//----------------------------------------------------------------------------------------------------------
	//										SQL						
	//----------------------------------------------------------------------------------------------------------
	
	
public void insereAmbiente(float custo) throws SQLException{
		
		Connection conn = null;
		 try
	        {
			 		conn = getConnection();
	                conn = getConnection();
	            	PreparedStatement stmt = conn.prepareStatement("INSERT INTO ambiente (paredes, portas, metragem, id_contrato, custo) VALUES"+
	            								"( ?,?,?, (select id from contrato order by id desc limit 1), ?);");
	            	stmt.setInt(1, this.getNumParedes());
	            	stmt.setInt(2, this.getNumPortas());
	            	stmt.setFloat(3, this.getMetragem());
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
	
	public List<AmbienteMD> listaAmbiente() throws SQLException{
		Connection conn = null;
		Statement stmt = null;
		String sql = "select * from ambiente order by id;";
		List<AmbienteMD> l = new ArrayList<AmbienteMD>();
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
	            		AmbienteMD c = new AmbienteMD(id,paredes,portas,metragem); 
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

	public void insertTempoAmbiente(int tempo) throws SQLException{
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
	
	public List<AmbienteMD> selectAmbiente() throws SQLException{
		Connection conn = null;
		List<AmbienteMD> a = new ArrayList<>();
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
	             		a.add(new AmbienteMD(paredes, portas, metragem, custo, tempo));
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

