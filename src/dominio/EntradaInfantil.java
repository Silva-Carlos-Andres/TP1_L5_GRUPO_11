package dominio;

import java.math.BigDecimal;

import enums.EdadesEntradaInfantil;
import interfaces.ITipoEntrada;

public class EntradaInfantil extends Entrada {

	
	
	private boolean souvenir;
	private int edad;
	
	
	
	public EntradaInfantil(boolean souvenir, int edad) {
		super();
		this.souvenir = souvenir;
		this.edad = edad;
		this.setTipoEntrada(new TipoEntradaInfantil());
	}

	public EntradaInfantil() {
		
		super();

		this.souvenir = false;
		this.edad = 0;
		this.setTipoEntrada(new TipoEntradaInfantil());
		
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
	
	@Override
	public void setTipoEntrada(ITipoEntrada tipoEntrada) {
		super.setTipoEntrada(tipoEntrada);
		this.setCosto(this.calcularCostoTotal());
	}



	@Override
	public String toString() {
		return "EntradaInfantil [souvenir=" + souvenir + ", edad=" + edad + "]" + super.toString();
	}

	@Override
	public BigDecimal calcularCostoTotal() {
		if(this.getEdad()<= 8) {
			
			return TipoEntradaInfantil.getCostoMenores8();
			
		}
		else {
			
			return TipoEntradaInfantil.getCostoMayores8();
		}
		
		
		
		
		}
	
	
	

}
