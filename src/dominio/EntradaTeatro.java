package dominio;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

import enums.GeneroEntradaTeatro;
import interfaces.ITipoEntrada;

public class EntradaTeatro extends Entrada{
	// se declaran la variables 
	private GeneroEntradaTeatro genero;
    public static final int cantidadMaximaActores = 3;
	private String[] actores = new String[cantidadMaximaActores];
	
	//Constructores
	public EntradaTeatro() {
		super();
		// setea costo por tipo de entrada
		this.setCosto(this.calcularCostoTotal());
		this.tipoEntrada = new TipoEntradaTeatro();
		this.genero = GeneroEntradaTeatro.DRAMA;
		
	}
	
	public EntradaTeatro(String nombre, LocalDate diaFuncion, LocalTime horario, Duration duracion, BigDecimal costo,
			ITipoEntrada tipoEntrada, GeneroEntradaTeatro genero, String[] actores) {
		super(nombre, diaFuncion, horario, duracion, costo, tipoEntrada);
		// setea costo por tipo de entrada
		this.setCosto(this.calcularCostoTotal());
		this.genero = genero;
		this.actores = actores;
	}
	
	// sets y gets
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


	public GeneroEntradaTeatro getGenero() {
		return genero;
	}

	public void setGenero(GeneroEntradaTeatro genero) {
		this.genero = genero;
		
	}

	@Override
	public String toString() {		
		return "EntradaTeatro ---- Genero Teatral: " + genero.toString() + " Actores: "+ getActor(0)+", "+ getActor(1) + ", "+ getActor(2) + ", "+ super.toString();
	}

	@Override
	public BigDecimal calcularCostoTotal() {
		return TipoEntradaTeatro.getValorFijo();
	}
}
