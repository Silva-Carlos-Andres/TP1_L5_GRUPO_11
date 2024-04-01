package dominio;

import java.math.BigDecimal;

import interfaces.ICosto;

public class EntradaTeatro extends Entrada implements ICosto{
// se declaran la variables 
	private int genero;
	final BigDecimal valorFijo = new BigDecimal(1350.50);
	
	private String[] actores = new String[3];

	

	public void setActor(String actor, int posicion) {
		actores[posicion] = actor;
	}
	
	
	public String getActor(int posicion) {
		
		return actores[posicion];
	}
	
	public String[] getActores() {
		return actores;
	}

	public void setActores(String[] actores) {
		this.actores = actores;
	}

	//Constructores
	public EntradaTeatro() {
		
		super();
		this.genero = 1;
		
	}
	
	
	public EntradaTeatro(int genero) {
		super();
		this.genero = genero;
	}

	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
		
	}

	public BigDecimal getValorFijo() {
		return valorFijo;
	}
	
	public String obtenerGenero(int genero) {
		String tipoGenero = null;
		if(genero == 1) {
			tipoGenero ="Drama";
			return tipoGenero;
			
		}else if (genero == 2) {
			tipoGenero = "Teatro";
			return tipoGenero;
			
		}else if (genero == 3) {
			tipoGenero = "Comedia";
			return tipoGenero;
		}
		return tipoGenero;
	}
	
	



	@Override
	public String toString() {
		
		return "EntradaTeatro ---- Genero Teatral: " + obtenerGenero(genero) + " Actores: "+ getActor(0)+", "+ getActor(1) + ", "+ getActor(2) + ", "+ super.toString();
	}


	@Override
	public void calcularCosto(String tipo) {
		tipo = tipo.toUpperCase();
		if(tipo.equals("UNICO")) {
			
			this.setCostoTotal(valorFijo);
			
		}
	}
	
}
