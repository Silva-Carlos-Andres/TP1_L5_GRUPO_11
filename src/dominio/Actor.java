package dominio;

public class Actor extends Persona{

	
	
	private static int numeroMatricula = 0;
	private int matriculaActoral ;
	
	
	public Actor() {
		super();
		numeroMatricula++;
		this.matriculaActoral = numeroMatricula;
	}


	public static int getNumeroMatricula() {
		return numeroMatricula;
	}


	public static void setNumeroMatricula(int numeroMatricula) {
		Actor.numeroMatricula = numeroMatricula;
	}

	
	public int getMatriculaActoral() {
		return matriculaActoral;
	}


	public void setMatriculaActoral(int matriculaActoral) {
		this.matriculaActoral = matriculaActoral;
	}

	public void setNombreApellido(String nombre, String apellido) {
		
		
		this.setNombre(nombre);
		this.setApellido(apellido);
	}
	
	public String getNombreApellido () {
		
		
		return  this.getNombre() +" "+ this.getApellido();
	}
	
	
	
	@Override
	public String toString() {
		return super.toString() + " matriculaActoral:" + matriculaActoral + "]";
	}
	
	

	
	
	
}
