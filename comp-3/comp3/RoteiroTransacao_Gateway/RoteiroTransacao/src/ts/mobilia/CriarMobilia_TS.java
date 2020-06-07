package ts.mobilia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entidades.Comodo;
import gateway.MobiliaGTW;

public class CriarMobilia_TS {

	public void execute(String desc, float custo, int tempoEntrega){
		try {
			MobiliaGTW.insereMobilia(desc, custo, tempoEntrega);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
