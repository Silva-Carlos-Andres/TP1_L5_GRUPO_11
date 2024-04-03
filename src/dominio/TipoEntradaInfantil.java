package dominio;

import java.math.BigDecimal;
import interfaces.ITipoEntrada;

public class TipoEntradaInfantil implements ITipoEntrada {
	private final static BigDecimal costoMenores = BigDecimal.valueOf(250);
	private final static BigDecimal costoMayores = new BigDecimal(500);
	private final static boolean souvenur = true;

	
	// gets y sets
	public static BigDecimal getCostoMenores8() {
		return costoMenores;
	}

	public static BigDecimal getCostoMayores8() {
		return costoMayores;
	}
	
	public static boolean getSouvenir() {
		return souvenur;
	}
	
	@Override
	public String devuelveInformacion() {
		return "Entrada Infantil";
	}
}
