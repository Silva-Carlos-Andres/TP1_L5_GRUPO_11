package dominio;

import enums.GeneroEntradaRecital;
import interfaces.IMusico;

public class Profesional extends Persona implements IMusico {
	private GeneroEntradaRecital genero;
	
	// constructor
	public Profesional() {
		super();
		this.genero = GeneroEntradaRecital.REGGAETON;
	}
	
	public Profesional(String nombre, String apellido, GeneroEntradaRecital genero) {
		super(nombre, apellido);
		this.genero = genero;
	}

	// gets y sets
	public GeneroEntradaRecital getGenero() {
		return genero;
	}
	
	public void setGenero(GeneroEntradaRecital genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Profesional [genero=" + genero + "]" + " " + super.toString();
	}

	@Override
	public String hacerMusica() {
		return "Tarareando voy...";
	}
}
