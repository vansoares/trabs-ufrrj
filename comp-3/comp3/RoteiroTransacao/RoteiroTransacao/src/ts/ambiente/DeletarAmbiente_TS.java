package ts.ambiente;

import java.sql.SQLException;

import dao.ComodoDAO;

public class DeletarAmbiente_TS {

	public void execute(String id){
			try {
				ComodoDAO.deleteComodo(id);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
