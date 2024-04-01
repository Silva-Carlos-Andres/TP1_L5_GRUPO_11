package dominio;

import java.math.BigDecimal;
import java.nio.channels.SeekableByteChannel;
import java.time.Duration;
import java.time.LocalDate;

/**
 * @author
 *  Esteban <a href="https://github.com/JEOrellano">JEOrellano</a>
 * @author
 *  Carlos <a href="https://github.com/Silva-Carlos-Andres">Silva-Carlos-Andres</a>
 * @author
 *  Gastón <a href="https://github.com/gaston5050">gaston5050</a>
 * @author
 *  Gustavo <a href="#">(...)</a>
 * @author
 *  Santiago <a href="#">(...)</a>
 * 
 * @see also
 * 	https://github.com/Silva-Carlos-Andres/TP1_L5_GRUPO_11.git
 * */
public class Principal {
	public static void main(String[] args) {
		
		//ENTRADA RECITAL
		//VIP
		EntradaRecital recital = new EntradaRecital();
		recital.setGenero(1);
		
		recital.setNombre(" Mantequita tuerta ");
		recital.setDiaFuncion(06, 05, 2023);
		recital.setDuracion(2, 33);
		recital.setTipoEntrada("VIP");
		recital.calcularCosto(recital.getTipoEntrada());
		
		System.out.println(recital.toString());
		
		//GENERAL
		EntradaRecital recital2 = new EntradaRecital();
		recital2.setGenero(6);
		
		recital2.setNombre(" CosquinPop ");
		recital2.setDiaFuncion(06, 06, 2025);
		recital2.setDuracion(1, 45);
		recital2.setTipoEntrada("X");
		recital2.calcularCosto(recital2.getTipoEntrada());
		
		System.out.println(recital2.toString());
		
		
		//ENTRADA TEATRO
		//DRAMA
		EntradaTeatro teatro1 = new EntradaTeatro();
		teatro1.setGenero(1);
		teatro1.setNombre("La obrita dramatica");
		teatro1.setDiaFuncion(03, 06, 2025);
		teatro1.setDuracion(3,55);
		teatro1.setTipoEntrada("unico");
		teatro1.setActor("Leonardo Hectoral" , 0);
		teatro1.setActor("Manon Joseph" , 1);
		teatro1.setActor("Hector Alterio" , 2);
		teatro1.calcularCosto(teatro1.getTipoEntrada());
		
		System.out.println(teatro1.toString());
		//TEATRO
		EntradaTeatro teatro2 = new EntradaTeatro();
		teatro2.setGenero(2);
		teatro2.setNombre("La desgracia del feriado");
		teatro2.setDiaFuncion(03, 06, 2026);
		teatro2.setDuracion(2,35);
		teatro2.setTipoEntrada("unico");
		teatro2.setActor("James Rosedal" , 0);
		teatro2.setActor("Silvio Soldan" , 1);
		teatro2.setActor("Duende Verde" , 2);
		teatro2.calcularCosto(teatro2.getTipoEntrada());
		
		System.out.println(teatro2.toString());
		
		// COMEDIA
		
		EntradaTeatro teatro3 = new EntradaTeatro();
		teatro3.setGenero(3);
		teatro3.setNombre("La risa ");
		teatro3.setDiaFuncion(16, 05, 2026);
		teatro3.setDuracion(1,13);
		teatro3.setTipoEntrada("unico");
		teatro3.setActor("William Williams" , 0);
		teatro3.setActor("Sargento Garcia" , 1);
		teatro3.setActor("Diego Luna" , 2);
		teatro3.calcularCosto(teatro3.getTipoEntrada());
		
		System.out.println(teatro3.toString());
		
		/*
		Entrada e1Recital = new EntradaRecital(1);
		
		System.out.println(e1Recital.getNombre());
		
		EntradaDeporte dep1 = new EntradaDeporte();
		dep1.setTipoDeporte("Futbol");
		dep1.setInternacional(false);
		System.out.println(dep1.toString());
		
		
		EntradaInfantil inf1 = new EntradaInfantil();
		inf1.setEdad(11);
		inf1.setSouvenir(true);
		System.out.println(inf1.toString());
		
		EntradaRecital rec1 = new EntradaRecital(3);
		
		System.out.println(rec1.toString());
		*/
	}
}
