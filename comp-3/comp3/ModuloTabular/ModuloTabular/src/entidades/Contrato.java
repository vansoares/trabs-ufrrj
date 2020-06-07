package entidades;

import java.util.*;

public class Contrato {
	
	private float comissao;
	private float valor;
	private int prazo;
	
	public Contrato(float comissao, float valor, int prazo){
		setComissao(comissao);
		setValor(valor);
		setPrazo(prazo);
	}
	
	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	public static float valorContrato(List<Ambiente> ambiente, float comissao){
		float soma_ambientes = 0, total;
		for(Ambiente a: ambiente){
			soma_ambientes = soma_ambientes + a.getCusto();
		}
		total = soma_ambientes * (1+comissao);
		return total;
	}
	
	public static int prazo(List<Ambiente> ambiente){
		int total = 0;
		for(Ambiente a: ambiente){
			total = total + a.getTempo();
		}
		return total;
		
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}
}
