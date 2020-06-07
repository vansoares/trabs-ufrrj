package tm;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidades.Mobilia;
import gateway.MobiliaGTW;

public class Mobilia_TM {

	public  static List<Mobilia>  ListarMobiliaComodo(String id){
		List <Mobilia> l = new ArrayList<Mobilia>();
		try {
			l = MobiliaGTW.listMobiliaComodo(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
	
	public   void DeletarMobilia(String id){
		try {
			MobiliaGTW.deleteMobilia(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public   List<Mobilia>  ListarMobilia(){
		List<Mobilia> l = null ; 
		try {
			l = MobiliaGTW.listaMobilia();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
	
	
	public   void CriarMobilia(String desc, float custo, int tempoEntrega){
		try {
			MobiliaGTW.insereMobilia(desc, custo, tempoEntrega);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void AlterarMobilia(String id, String desc, float custo, int tempoEntrega, ArrayList<String>comodos){
		try {
			MobiliaGTW.alterMobilia(desc, custo, tempoEntrega, id, comodos);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
}
