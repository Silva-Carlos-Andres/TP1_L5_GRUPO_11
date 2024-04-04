package dominio;

import java.math.BigDecimal;

import enums.DescripcionTipoDeporte;
import interfaces.ITipoEntrada;

public class EntradaDeporte extends Entrada {

	double costoFutbol = 300;
	double costoRugby = 450;
	double costoHockey = 380;
	double recargoInternacional = 1.3;
	
	
	public EntradaDeporte() {
		super();
		
	}

	public EntradaDeporte(double recargoInternacional, String tipoDeporte, boolean internacional,
			DescripcionTipoDeporte tipoDep) {
		super();
		this.recargoInternacional = recargoInternacional;
		this.tipoDeporte = tipoDeporte;
		this.internacional = internacional;
		this.tipoDep = tipoDep;
	}

	String tipoDeporte;
	boolean internacional;
	private DescripcionTipoDeporte tipoDep;

	public String getTipoDeporte() {
		return tipoDeporte;
	}

	public void setTipoDeporte(String tipoDeporte) {
		this.tipoDeporte = tipoDeporte;
	}

	public boolean isInternacional() {
		return internacional;
	}

	public void setInternacional(boolean internacional) {
		this.internacional = internacional;
	}

	public double getCostoFutbol() {
		return costoFutbol;
	}

	public double getCostoRugby() {
		return costoRugby;
	}

	public double getCostoHockey() {
		return costoHockey;
	}

	public double getRecargoInternacional() {
		return recargoInternacional;
	}

	public DescripcionTipoDeporte getTipoDep() {
		return tipoDep;
	}

	public void setTipoDep(DescripcionTipoDeporte tipoDep) {
		this.tipoDep = tipoDep;
	}

	public void setTipoDeporte(ITipoEntrada tipoEntrada) {
		super.setTipoEntrada(tipoEntrada);
		this.setCosto(this.calcularCostoTotal());
	}

	@Override
	public String toString() {
		return "EntradaDeporte [Costo Futbol: " + costoFutbol + ", Costo Rugby: " + costoRugby + ", Costo Hockey: "
				+ costoHockey + ", Recargo Internacional: " + recargoInternacional + ", Tipo Deporte: " + tipoDeporte
				+ ", Internacional: " + internacional + "]";
	}

	public String EntradaFutbolInternacional() {
		setTipoDep(DescripcionTipoDeporte.Futbol);
		return "Entrada Futbol internacional: " + calcularInternacional(true) + " , Entrada Futbol Local: "
				+ calcularInternacional(false);
	}

	public String EntradaRugbyInternacional() {
		setTipoDep(DescripcionTipoDeporte.Rugby);
		return "Entrada Rugby Internacional: " + calcularInternacional(true) + " , Entrada Rugby Local: "
				+ calcularInternacional(false);
	}
	public String EntradaHockeyInternacional() {
		setTipoDep(DescripcionTipoDeporte.Hockey);
		return "Entrada Hockey Internacional: " + calcularInternacional(true) + " , Entrada Hockey Local: "
		+ calcularInternacional(false);
	}

	public Double calcularInternacional(boolean internacional) {
		Double recargo = TipoEntradaDeporte.getValorInternacional().doubleValue();
		if (internacional == true) {
			return calcularCostoTotal().doubleValue() * recargo;
		} else {
			return calcularCostoTotal().doubleValue();
		}
	}

	@Override
	public BigDecimal calcularCostoTotal() {
		// TODO Auto-generated method stub
		// String tipo = DescripcionTipoDeporte.Futbol.toString();
		String tipo = getTipoDep().toString();
		switch (tipo) {
		case "Futbol":
			return TipoEntradaDeporte.getValorFutbol();

		case "Rugby":
			return TipoEntradaDeporte.getValorRugby();

		case "Hockey":
			return TipoEntradaDeporte.getValorHockey();
		default:
			return new BigDecimal(0);
		}
	}

}
