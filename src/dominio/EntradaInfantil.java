package dominio;

import java.math.BigDecimal;

public class EntradaInfantil extends Entrada {

	double costoMenores = 250;
	double costoMayores = 500;
	
	boolean souvenir;
	int edad;
	
	
	
	public boolean isSouvenir() {
		return souvenir;
	}



	public void setSouvenir(boolean souvenir) {
		this.souvenir = souvenir;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public double getCostoMenores() {
		return costoMenores;
	}



	public double getCostoMayores() {
		return costoMayores;
	}



	@Override
	public BigDecimal calcularCostoTotal(String tipoEntrada) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
