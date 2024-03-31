package dominio;

import java.math.BigDecimal;

public class EntradaDeporte extends Entrada{
	
	double costoFutbol = 300;
	double costoRugby = 450;
	double costoHockey = 380;
	double recargoInternacional = 1.3;
	
	String tipoDeporte;
	boolean internacional;
	
	
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


	@Override
	public BigDecimal calcularCostoTotal(String tipoEntrada) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String toString() {
		return "EntradaDeporte [Costo Futbol: " + costoFutbol + ", Costo Rugby: " + costoRugby + ", Costo Hockey: "
				+ costoHockey + ", Recargo Internacional: " + recargoInternacional + ", Tipo Deporte: " + tipoDeporte
				+ ", Internacional: " + internacional + "]";
	}
	
	

}
