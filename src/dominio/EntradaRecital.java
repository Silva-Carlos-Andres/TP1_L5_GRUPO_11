package dominio;

import java.math.BigDecimal;

import interfaces.ICosto;

public class EntradaRecital extends Entrada implements ICosto{
	
	final BigDecimal  costoFijoVip = BigDecimal.valueOf(1500);
	final BigDecimal  costoFijoGeneral = new BigDecimal(800);
	
	private int genero;
	

	public EntradaRecital(int genero) {
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

	@Override
	public BigDecimal calcularCostoTotal(String tipoEntrada) {
		if(tipoEntrada.equals("vip")) {
			return costoFijoVip;
		}
		else {
			return costoFijoGeneral;
		}	
	}

	@Override
	public String toString() {
		return "EntradaRecital [Costo Fijo VIP: " + costoFijoVip + ", Costo Fijo General: " + costoFijoGeneral + ", Genero: "
				+ genero + "]";
	}

	

	
	
	

		
		
		
		
		
	

}
