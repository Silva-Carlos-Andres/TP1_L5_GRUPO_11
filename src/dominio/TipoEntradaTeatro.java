package dominio;

import java.math.BigDecimal;

import interfaces.ITipoEntrada;

public class TipoEntradaTeatro implements ITipoEntrada{
	private static final BigDecimal valorFijo = new BigDecimal(1350.50);
	
	// gets y sets
	public static BigDecimal getValorFijo() {
		return valorFijo;
	}

	@Override
	public String toString() {
		return "TipoEntradaTeatro [devuelveInformacion()=" + devuelveInformacion() + "]";
	}

	@Override
	public String devuelveInformacion() {
		return "Entrada teatro";
	}

}
