package DomainModel_ActiveRecord;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class SalaMD extends ComodoMD {

	private String id;
	
	public SalaMD (String id, String d){
		setDescricao(d);
		setId(id);
	}

	@Override
	public List<MobiliaMD> listaMobiliaDisponivel(List <String> set) {
		List<MobiliaMD> array = new ArrayList<>();
			try {
				for(MobiliaMD m: MobiliaMD.listMobiliaComodo(getId())){
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
}
