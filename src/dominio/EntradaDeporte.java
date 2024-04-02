package dominio;

import java.math.BigDecimal;

import enums.DescripcionTipoDeporte;
import interfaces.ITipoEntrada;

public class EntradaDeporte extends Entrada {

	double costoFutbol = 300;
	double costoRugby = 450;
	double costoHockey = 380;
	double recargoInternacional = 1.3;

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
		return "Entrada Futbol internacional: " + calcularInternacional(true);
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
		String tipo = DescripcionTipoDeporte.Futbol.toString();

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
