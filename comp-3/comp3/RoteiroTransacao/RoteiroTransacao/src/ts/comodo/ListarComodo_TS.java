package ts.comodo;

import java.sql.SQLException;
import java.util.List;

import dao.ComodoDAO;
import entidades.Comodo;

public class ListarComodo_TS {

	public List<Comodo>  execute(){
		List<Comodo> l = null ; 
		try {
			l = ComodoDAO.listaComodo();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
}
