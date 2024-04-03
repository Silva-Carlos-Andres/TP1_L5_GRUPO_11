package dominio;

import java.time.LocalDate;
import java.util.Arrays;

import enums.GeneroEntradaRecital;

public class Banda {
	private String nombre;
	private Persona[] integrantes = {new Profesional()};
	private LocalDate fechaBanda;
	private GeneroEntradaRecital genero;
	
	// constructor
	public Banda() {
		this.nombre = "Sin nombre";
		this.fechaBanda = LocalDate.now();
		this.genero = GeneroEntradaRecital.REGGAETON;
		
	}
	
	public Banda(String nombre, Persona[] integrantes, LocalDate fechaBanda, GeneroEntradaRecital genero) {
		this.nombre = nombre;
		this.integrantes = integrantes;
		this.fechaBanda = fechaBanda;
		this.genero = genero;
	}

	// gets y sets	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Persona[] getIntegrantes() {
		return integrantes;
	}
	
	public void setIntegrantes(Persona[] integrantes) {
		this.integrantes = integrantes;
	}
	
	public LocalDate getFechaBanda() {
		return fechaBanda;
	}
	
	public void setFechaBanda(LocalDate fechaBanda) {
		this.fechaBanda = fechaBanda;
	}
	
	public GeneroEntradaRecital getGenero() {
		return genero;
	}
	
	public void setGenero(GeneroEntradaRecital genero) {
		this.genero = genero;
	}


	@Override
	public String toString() {
		return "Banda [nombre=" + nombre + ", integrantes=" + Arrays.toString(integrantes) + ", fechaBanda="
				+ fechaBanda + ", genero=" + genero + "]";
	}
	
	
}
