package ts.mobilia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ComodoDAO;
import dao.MobiliaDAO;
import entidades.Comodo;
import entidades.Mobilia;

public class ListarMobiliaComodo_TS {

	public List<Mobilia>  execute(String id){
		List <Mobilia> l = new ArrayList<Mobilia>();
		try {
			l = MobiliaDAO.listMobiliaComodo(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
}
