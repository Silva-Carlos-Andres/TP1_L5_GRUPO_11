package dominio;
import java.util.Date;

import interfaces.Costo;

public class Entrada {

	//atributos
	private int numeroUnicoEntrada;
	private String nombre;
	private Date diaFuncion;
	//duracion "hh:mm"
	private String duracion;
	private float costo;	
	
	//Constructores
	
	public Entrada()
	{
		numeroUnicoEntrada=0;
		nombre = "Sin nombre";
		diaFuncion = new Date();
		duracion ="";
		costo= 0;		
	}

	public Entrada (int id,String nombre, Date diaFuncion, int duracion, float costo)
	{
		this.numeroUnicoEntrada=id;
		this.nombre=nombre;
		this.diaFuncion=diaFuncion;
		this.duracion="";
		this.costo=costo;	
	}
	
	//getters y setters
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
	
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public float getCostoTotal() {
		return costo;
	}
	public void setCostoTotal(float costoTotal) {
		this.costo = costoTotal;
	}

	public Date getDiaFuncion() {
		return diaFuncion;
	}

	public void setDiaFuncion(Date diaFuncion) {
		this.diaFuncion = diaFuncion;
	}

	
	
	
	
}
