package dominio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import interfaces.ICosto;

public abstract class Entrada {

	// atributos
	private int numeroUnicoEntrada;
	private String nombre;
	private LocalDate diaFuncion;
	// duracion "hh:mm"
	private LocalTime duracion;
	private BigDecimal costo;
	// recitales - teatro - infantiles - deportes 
	String tipoEntrada;

	// Constructores

	public Entrada() {
		numeroUnicoEntrada = 0;
		nombre = "Sin nombre";
		diaFuncion = LocalDate.now();
		duracion = LocalTime.now();
		costo = new BigDecimal(0);
		tipoEntrada = "";
	}

	public Entrada(int id, String nombre, LocalDate diaFuncion, LocalTime duracion, BigDecimal costo,
			String tipoEntrada) {
		this.numeroUnicoEntrada = id;
		this.nombre = nombre;
		this.diaFuncion = diaFuncion;
		this.duracion = duracion;
		this.costo = costo;
		this.tipoEntrada = tipoEntrada;
	}

	// getters y setters
	public int getNumeroUnicoEntrada() {
		return numeroUnicoEntrada;
	}

	public void setNumeroUnicoEntrada(int numeroUnicoEntrada) {
		this.numeroUnicoEntrada = numeroUnicoEntrada;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalTime getDuracion() {
		return duracion;
	}

	public void setDuracion(LocalTime duracion) {
		this.duracion = duracion;
	}

	public BigDecimal getCostoTotal() {
		return costo;
	}

	public void setCostoTotal(BigDecimal costoTotal) {
		this.costo = costoTotal;
	}

	public LocalDate getDiaFuncion() {
		return diaFuncion;
	}

	public void setDiaFuncion(LocalDate diaFuncion) {
		this.diaFuncion = diaFuncion;
	}

	public abstract BigDecimal calcularCostoTotal(String tipoEntrada);
}
