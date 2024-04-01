package dominio;

import java.math.BigDecimal;

import interfaces.ICosto;

public class EntradaRecital extends Entrada implements ICosto{
	
	final BigDecimal  costoFijoVip = BigDecimal.valueOf(1500);
	final BigDecimal  costoFijoGeneral = new BigDecimal(800);
	
	private int genero;
	
	
	
	//Constructores
	
	public EntradaRecital(int genero) {
		super();
		this.genero = genero;
		
	}
	
	public EntradaRecital() {
		super();

		this.genero = 1;
	}

	
	//Metodos 
	
	public BigDecimal getCostoFijoVip() {
		return costoFijoVip;
	}


	public BigDecimal getCostoFijoGeneral() {
		return costoFijoGeneral;
	}

	
	public int getGenero() {
		return genero;
	}
	
	
	public void setGenero(int genero) {
		this.genero = genero;
	}




	@Override
	public String toString() {
		
		String generoMusical; 
		
		if(genero == 1) generoMusical= "Rock";
		else if(genero == 2 )generoMusical = "Heavy Metal";
		else if(genero == 3) generoMusical = "Reggaetón";
		else if(genero == 4) generoMusical = "Trap";
		else if(genero == 5) generoMusical = "Latinos";
		else if(genero == 6) generoMusical = "Pop";
		else generoMusical = "";
		
		
		return "EntradaRecital ---- Genero Musical: " + generoMusical + " ," + super.toString();
	}


	public void calcularCosto(String tipo) {
		tipo = tipo.toUpperCase();
		
		if(tipo.equals("VIP")) { this.setCostoTotal(costoFijoVip);}
		else {this.setCostoTotal(costoFijoGeneral);
				this.setTipoEntrada("General");
			
		
		}	
	
	}

	
	
	
	
	

}
