package dominio;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import interfaces.ITipoEntrada;

public abstract class   Entrada {

	// atributos
	private int numeroUnicoEntrada;
	private static int contadorEntradas = 0;
	private String nombre;
	private LocalDate diaFuncion;
	// duracion "hh:mm"
	private LocalTime horario;
	private Duration duracion;
	private BigDecimal costo;
	// recitales - teatro - infantiles - deportes 
	ITipoEntrada tipoEntrada;

	// Constructores

	public Entrada() {
		contadorEntradas++;
		numeroUnicoEntrada = contadorEntradas;
		nombre = "Sin nombre";
		diaFuncion = LocalDate.now();
		horario = LocalTime.of(0, 0);
		duracion = Duration.ofHours(0);
		costo = new BigDecimal(0);
		tipoEntrada = null;
	}

	public Entrada(String nombre, LocalDate diaFuncion, LocalTime horario, Duration duracion, BigDecimal costo,
			ITipoEntrada tipoEntrada) {
		contadorEntradas++;
		this.numeroUnicoEntrada = contadorEntradas;
		this.nombre = nombre;
		this.horario = horario;
		this.diaFuncion = diaFuncion;
		this.duracion = duracion;
		this.costo = costo;
		this.tipoEntrada = tipoEntrada;
	}

	// getters y setters
	
	
	public int getNumeroUnicoEntrada() {
		return numeroUnicoEntrada;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(int horas, int minutos) {
		
		this.horario = LocalTime.of(horas, minutos);
		
	}

	public BigDecimal getCosto() {
		return costo;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

	public ITipoEntrada getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(ITipoEntrada tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public void setDuracion(Duration duracion) {
		this.duracion = duracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Duration getDuracion() {
		return duracion;
	}

	public void setDuracion(int horas, int minutos) {
		
		
		this.duracion = Duration.ofHours(horas).plusMinutes(minutos);
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

	public void setDiaFuncion(int dia, int mes, int anio) {
		
		LocalDate fechaFuncion = LocalDate.of(anio, mes, dia);
		this.diaFuncion = fechaFuncion;
	}

	@Override
	public String toString() {
		
		long horasNum = duracion.toHours();
		long minutosNum = duracion.toMinutes();
		minutosNum = minutosNum - (horasNum * 60); 
		
		String horas = "";
		String minutos = "";
		
		if(horasNum == 0) horas = "00";
		else if (horasNum > 0 && horasNum <10)  horas = "0"+horasNum;
	    else if (horasNum >= 10 )  horas = String.valueOf(horasNum);
		
		if(minutosNum == 0) minutos = "00";
		else if (minutosNum > 0 && minutosNum <10) horas = "0"+minutosNum;
		else if (minutosNum >= 10 ) minutos = minutosNum +" hs";
		
		
		return " Numero Unico de Entrada: " + numeroUnicoEntrada + ", Nombre del espectaculo: " + nombre +  ", Dia del espectaculo: " + diaFuncion
				+ ", horario: " + horario + ", Tiempo estimado de duracion: " + horas +":" + minutos + ", Precio: " + costo+ ", Tipo de entrada: " + tipoEntrada.toString();
	}

	public abstract BigDecimal calcularCostoTotal();
}
