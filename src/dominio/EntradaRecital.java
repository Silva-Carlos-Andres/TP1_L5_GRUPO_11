package dominio;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

import enums.GeneroEntradaRecital;
import interfaces.ITipoEntrada;

public class EntradaRecital extends Entrada {
	private GeneroEntradaRecital genero;
	private Banda bandaPrincipal;
	private Banda[] bandaSoporte = {new Banda()};
	// Constructores
	public EntradaRecital() {
		super();
		this.tipoEntrada = new TipoEntradaRecital();
		// setea costo por tipo de entrada
		this.setCosto(this.calcularCostoTotal());
		this.bandaPrincipal = new Banda();
		this.genero = this.bandaPrincipal.getGenero();
	}

	public EntradaRecital(String nombre, LocalDate diaFuncion, LocalTime horario, Duration duracion, BigDecimal costo,
			ITipoEntrada tipoEntrada, Banda bandaPrincipal, Banda[] bandaSoporte) {
		super(nombre, diaFuncion, horario, duracion, costo, tipoEntrada);
		// setea costo por tipo de entrada
		this.setCosto(this.calcularCostoTotal());
		this.bandaPrincipal = bandaPrincipal;
		this.bandaSoporte = bandaSoporte;
		this.genero = bandaPrincipal.getGenero();
	}

	// Metodos
	public GeneroEntradaRecital getGenero() {
		return genero;
	}

	public void setGenero(GeneroEntradaRecital genero) {
		this.genero = genero;
	}
	
	public Banda getBandaPrincipal() {
		return bandaPrincipal;
	}

	public void setBandaPrincipal(Banda bandaPrincipal) {
		this.bandaPrincipal = bandaPrincipal;
	}

	public Banda[] getBandaSoporte() {
		return bandaSoporte;
	}

	public void setBandaSoporte(Banda[] bandaSoporte) {
		this.bandaSoporte = bandaSoporte;
	}

	@Override
	public void setTipoEntrada(ITipoEntrada tipoEntrada) {
		super.setTipoEntrada(tipoEntrada);
		this.setCosto(this.calcularCostoTotal());
	}
	
	@Override
	public String toString() {
		return "EntradaRecital ---- Genero Musical: " + genero + ", bandaPrincipal=" + bandaPrincipal + ", bandaSoporte="
				+ Arrays.toString(bandaSoporte) + "]" + ", " + super.toString();
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
