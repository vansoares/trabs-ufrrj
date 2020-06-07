package entidades;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import gateway.AmbienteGTW;
import gateway.MobiliaGTW;

public class Ambiente {

	private int id;
	private int numParedes;
	private int numPortas;
	private float metragem;
	private float custo;
	private int tempo;
	
	public Ambiente(int i, int paredes, int portas, float m){
		setId(i);
		setNumParedes(paredes);
		setNumPortas(portas);
		setMetragem(m);
	}
	
	public Ambiente(int paredes, int portas, float m){
		setNumParedes(paredes);
		setNumPortas(portas);
		setMetragem(m);
	}
	
	public Ambiente(int paredes, int portas, float m, float c, int t){
		setNumParedes(paredes);
		setNumPortas(portas);
		setMetragem(m);
		setCusto(c);
		setTempo(t);
	}
	
	public int getNumParedes() {
		return numParedes;
	}

	public void setNumParedes(int numParedes) {
		this.numParedes = numParedes;
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	public float getMetragem() {
		return metragem;
	}

	public void setMetragem(float metragem) {
		this.metragem = metragem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public float custo(ArrayList<ItemVenda> iv){
		float total = 0;

		for(ItemVenda i: iv){
			try {
				Mobilia m = MobiliaGTW.getMobiliaById(i.getId());
				total = total + (m.getCusto()*i.getQuantidade());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		total = (float) (total + (10*getNumParedes()) + (5*getNumPortas()) + (2.5*getMetragem()));
		return total;
	}
	
	public void tempoEntrega(){
		int total = 0;
		int t =0; 
			try {
				t = MobiliaGTW.getMobiliaByTempo();
				total = t + (2*getNumParedes())+(getNumPortas()/2);
				AmbienteGTW.insertTempoAmbiente(total);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public float getCusto() {
		return custo;
	}

	public void setCusto(float custo) {
		this.custo = custo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

}
