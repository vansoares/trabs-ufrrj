package ts.ambiente;

import java.sql.SQLException;
import java.util.List;

import entidades.Ambiente;
import entidades.Comodo;

public class GetAmbiente_TS {

	public List<Ambiente>  execute(){
		List<Ambiente> l = null ; 
		try {
			l =Ambiente.selectAmbiente();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
}
