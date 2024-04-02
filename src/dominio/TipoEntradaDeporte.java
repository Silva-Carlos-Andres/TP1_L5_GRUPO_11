package dominio;

import interfaces.ITipoEntrada;
import java.math.*;

import enums.DescripcionTipoDeporte;

public class TipoEntradaDeporte implements ITipoEntrada {

	private static final BigDecimal entradaFutbol = new BigDecimal(300);
	private static final BigDecimal entradaRugby = new BigDecimal(450);
	private static final BigDecimal entradaHockey = new BigDecimal(380);
	private static final BigDecimal entradaInternacional = new BigDecimal(1.30);
	private DescripcionTipoDeporte descripcion;

	public TipoEntradaDeporte() {
		this.descripcion = DescripcionTipoDeporte.Futbol;
	}

	public TipoEntradaDeporte(DescripcionTipoDeporte descripcion) {
		this.descripcion = descripcion;
	}

	public static BigDecimal getValorFutbol() {
		return entradaFutbol;
	}

	public static BigDecimal getValorRugby() {
		return entradaRugby;
	}

	public static BigDecimal getValorHockey() {
		return entradaHockey;
	}

	public static BigDecimal getValorInternacional() {
		return entradaInternacional;
	}

	@Override
	public String toString() {
		return "TipoEntradaDeporte [devuelveInformacion()=" + devuelveInformacion() + "]";
	}

	@Override
	public String devuelveInformacion() {
		// TODO Auto-generated method stub
		return "Entrada Deporte";
	}

	public DescripcionTipoDeporte getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(DescripcionTipoDeporte descripcion) {
		this.descripcion = descripcion;
	}

}
