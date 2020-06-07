package tm;

import java.sql.SQLException;
import java.util.List;

import entidades.Ambiente;
import entidades.Contrato;

public class Contrato_TM {

	public   void CancelarContrato(){
		try {
			Contrato.cancelContrato();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public   void CriarContrato(){
		try {
			Contrato.criaContrato();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public   List<Ambiente>  ListarContrato(){
		List<Ambiente> l = null ; 
		try {
			l =Ambiente.listaAmbiente();

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
			Contrato.updateContrato(c);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return c;
	}
}
