package ts.comodo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dao.ComodoCompostoDAO;
import dao.ComodoDAO;
import entidades.Comodo;

public class CriarComodo_TS {

	public void execute(String desc, String tipo){
		try {
			ComodoDAO.insereComodo(desc, tipo);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
