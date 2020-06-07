package ts.mobilia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidades.Comodo;
import entidades.Mobilia;
import mapper.ComodoMAPPER;
import mapper.MobiliaMAPPER;

public class ListarMobiliaComodo_TS {

	public List<Mobilia>  execute(String id){
		List <Mobilia> l = new ArrayList<Mobilia>();
		try {
			l = MobiliaMAPPER.listMobiliaComodo(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
}
