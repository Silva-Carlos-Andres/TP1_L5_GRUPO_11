package dominio;

import interfaces.Costo;

public class entradaRecital extends Entrada implements Costo{
	
	final float  costoFijoVip = 1500;
	final float  costoFijoGeneral = 800;
	
	private int genero;
	

	public entradaRecital(int genero) {
		super();
		this.genero = genero;
	}

	public int getGenero() {
		return genero;
	}
	
	
	public void setGenero(int genero) {
		this.genero = genero;
	}


	public void calcularCosto(String tipo) {
		
		if(tipo.equals("vip")) this.setCostoTotal(costoFijoVip);
		else this.setCostoTotal(costoFijoGeneral);	
	
	}



	
	
	

		
		
		
		
		
	

}
