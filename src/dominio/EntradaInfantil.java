package dominio;

import java.math.BigDecimal;

public class EntradaInfantil extends Entrada {

	double costoMenores = 250;
	double costoMayores = 500;
	
	boolean souvenir;
	int edad;
	
	
	
	public EntradaInfantil(double costoMenores, double costoMayores, boolean souvenir, int edad) {
		super();
		this.costoMenores = costoMenores;
		this.costoMayores = costoMayores;
		this.souvenir = souvenir;
		this.edad = edad;
	}

	public EntradaInfantil() {
		
		super();
		this.costoMenores = 0;
		this.costoMayores = 0;
		this.souvenir = false;
		this.edad = 0;
		
	}

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

/*

	@Override
	public BigDecimal calcularCostoTotal(String tipoEntrada) {
		// TODO Auto-generated method stub
		return null;
	}

*/

	@Override
	public String toString() {
		return "EntradaInfantil [Costo Menores: " + costoMenores + ", Costo Mayores: " + costoMayores + ", Souvenir: "
				+ souvenir + ", Edad: " + edad + "]";
	}
	
	

}
