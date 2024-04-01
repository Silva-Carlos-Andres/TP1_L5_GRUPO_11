package dominio;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

import enums.GeneroEntradaRecital;
import interfaces.ITipoEntrada;

public class EntradaRecital extends Entrada {
	private GeneroEntradaRecital genero;

	// Constructores
	public EntradaRecital() {
		super();
		this.tipoEntrada = new TipoEntradaRecital();
		// setea costo por tipo de entrada
		this.setCosto(this.calcularCostoTotal());
		this.genero = GeneroEntradaRecital.LATINOS;
	}

	public EntradaRecital(String nombre, LocalDate diaFuncion, LocalTime horario, Duration duracion, BigDecimal costo,
			ITipoEntrada tipoEntrada, GeneroEntradaRecital genero) {
		super(nombre, diaFuncion, horario, duracion, costo, tipoEntrada);
		// setea costo por tipo de entrada
		this.setCosto(this.calcularCostoTotal());
		this.genero = genero;
	}

	// Metodos
	public GeneroEntradaRecital getGenero() {
		return genero;
	}

	public void setGenero(GeneroEntradaRecital genero) {
		this.genero = genero;
	}
	
	@Override
	public void setTipoEntrada(ITipoEntrada tipoEntrada) {
		super.setTipoEntrada(tipoEntrada);
		this.setCosto(this.calcularCostoTotal());
	}

	@Override
	public String toString() {
		String generoMusical = getGenero().toString();
		return "EntradaRecital ---- Genero Musical: " + generoMusical + " ," + super.toString();
	}
	
	@Override
	public BigDecimal calcularCostoTotal() {
		String tipo = ((TipoEntradaRecital)getTipoEntrada()).getDescripcion().toString();
		
		switch(tipo) {
			case "VIP":
				return TipoEntradaRecital.getCostoFijoVip();
		case "GENERAL":
				return TipoEntradaRecital.getCostoFijoGeneral();
			default:
				return new BigDecimal(0);
		}
	}
}
