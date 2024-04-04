package dominio;

import java.math.BigDecimal;

import enums.DescripcionTipoRecital;
import interfaces.ITipoEntrada;

public class TipoEntradaRecital implements ITipoEntrada{
	
	private final static BigDecimal costoFijoVip = BigDecimal.valueOf(1500);
	private final static BigDecimal costoFijoGeneral = new BigDecimal(800);
	private DescripcionTipoRecital descripcion;

	// contructor
	public TipoEntradaRecital() {
		this.descripcion = DescripcionTipoRecital.GENERAL;
	}
	
	public TipoEntradaRecital(DescripcionTipoRecital descripcion) {
		this.descripcion = descripcion;
	}

	// gets y sets
	public static BigDecimal getCostoFijoVip() {
		return costoFijoVip;
	}

	public static BigDecimal getCostoFijoGeneral() {
		return costoFijoGeneral;
	}

	public DescripcionTipoRecital getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(DescripcionTipoRecital descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "TipoEntradaRecital [descripcion=" + descripcion + "]";
	}

	@Override
	public String devuelveInformacion() {
		return "Entrada recital";
	}

}
