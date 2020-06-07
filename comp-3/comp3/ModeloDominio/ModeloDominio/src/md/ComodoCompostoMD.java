package md;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ComodoCompostoDAO;
import dao.MobiliaDAO;

public class ComodoCompostoMD extends ComodoMD{
	private String id;

	public ComodoCompostoMD(String id, String d) {
		setDescricao(d);
		setId(id);
	}

	@Override
	public List<MobiliaMD> listaMobiliaDisponivel(List <String> set) {
		List<MobiliaMD> array = new ArrayList<>();
			try {
				for(MobiliaMD m: MobiliaDAO.listMobiliaComodo(getId())){
					if(!set.contains(m.getId())){
						array.add(m);
					}
				}	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return array;
		
		}
	
	public static void criar(String desc, ArrayList<String> comodos){
		try {
			ComodoCompostoDAO.insertComodoComposto(desc, comodos);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
