package dominio;
import java.util.Date;

public class Entradas {

	//atributos
	int id;
	String nombre;
	Date diaFuncion;
	int duracion;
	float costo;	
	//Constructores
	public Entradas()
	{
		id=0;
		nombre = "Sin nombre";
		diaFuncion = new Date();
		duracion =0;
		costo= 0;		
	}
	public Entradas (int id,String nombre, Date diaFuncion, int duracion, float costo)
	{
		this.id=id;
		this.nombre=nombre;
		this.diaFuncion=diaFuncion;
		this.duracion=duracion;
		this.costo=costo;
			
	}
	//getters y setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getDia() {
		return dia;
	}
	public void setDia(Date dia) {
		this.dia = dia;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public float getCosto() {
		return costo;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}
	
}
