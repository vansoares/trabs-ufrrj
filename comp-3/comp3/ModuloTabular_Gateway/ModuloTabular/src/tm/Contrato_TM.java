package tm;

import java.sql.SQLException;
import java.util.List;

import entidades.Ambiente;
import entidades.Contrato;
import gateway.AmbienteGTW;
import gateway.ContratoGTW;

public class Contrato_TM {

	public   void CancelarContrato(){
		try {
			ContratoGTW.cancelContrato();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public   void CriarContrato(){
		try {
			ContratoGTW.criaContrato();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public   List<Ambiente>  ListarContrato(){
		List<Ambiente> l = null ; 
		try {
			l =AmbienteGTW.listaAmbiente();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
	
	public   Contrato UpdateContrato(float comissao, List<Ambiente> ambientes){
		float valor = Contrato.valorContrato(ambientes, comissao);
		int prazo = Contrato.prazo(ambientes);
		Contrato c = new Contrato(comissao, valor, prazo);
		try {
			ContratoGTW.updateContrato(comissao, prazo, valor);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return c;
	}
}
