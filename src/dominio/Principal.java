package dominio;

import java.math.BigDecimal;
import java.nio.channels.SeekableByteChannel;
import java.time.Duration;
import java.time.LocalDate;

import enums.DescripcionTipoRecital;
import enums.GeneroEntradaRecital;
import enums.GeneroEntradaTeatro;

/**
 * @author
 *  Esteban <a href="https://github.com/JEOrellano">JEOrellano</a>
 * @author
 *  Carlos <a href="https://github.com/Silva-Carlos-Andres">Silva-Carlos-Andres</a>
 * @author
 *  Gast�n <a href="https://github.com/gaston5050">gaston5050</a>
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
		Entrada recital = new EntradaRecital();
		((EntradaRecital)recital).setGenero(GeneroEntradaRecital.ROCK);
		
		recital.setNombre(" Mantequita tuerta ");
		recital.setDiaFuncion(06, 05, 2023);
		recital.setDuracion(2, 33);
		recital.setTipoEntrada(new TipoEntradaRecital(DescripcionTipoRecital.VIP));
		
		System.out.println(recital.toString());
		
		//GENERAL
		EntradaRecital recital2 = new EntradaRecital();
		recital2.setGenero(GeneroEntradaRecital.POP);
		
		recital2.setNombre(" CosquinPop ");
		recital2.setDiaFuncion(06, 06, 2025);
		recital2.setDuracion(1, 45);
		recital2.setTipoEntrada(new TipoEntradaRecital(DescripcionTipoRecital.GENERAL));
		System.out.println(recital2.toString());
		
		
		//ENTRADA TEATRO
		//DRAMA
		EntradaTeatro teatro1 = new EntradaTeatro();
		teatro1.setGenero(GeneroEntradaTeatro.DRAMA);
		teatro1.setNombre("La obrita dramatica");
		teatro1.setDiaFuncion(03, 06, 2025);
		teatro1.setDuracion(3,55);
		teatro1.setActor("Leonardo Hectoral" , 0);
		teatro1.setActor("Manon Joseph" , 1);
		teatro1.setActor("Hector Alterio" , 2);
		
		System.out.println(teatro1.toString());
		
		//TEATRO
		EntradaTeatro teatro2 = new EntradaTeatro();
		teatro2.setGenero(GeneroEntradaTeatro.TEATTRO);
		teatro2.setNombre("La desgracia del feriado");
		teatro2.setDiaFuncion(03, 06, 2026);
		teatro2.setDuracion(2,35);
		teatro2.setActor("James Rosedal" , 0);
		teatro2.setActor("Silvio Soldan" , 1);
		teatro2.setActor("Duende Verde" , 2);
		
		System.out.println(teatro2.toString());
		
		// COMEDIA		
		EntradaTeatro teatro3 = new EntradaTeatro();
		teatro3.setGenero(GeneroEntradaTeatro.COMEDIA);
		teatro3.setNombre("La risa ");
		teatro3.setDiaFuncion(16, 05, 2026);
		teatro3.setDuracion(1,13);
		teatro3.setActor("William Williams" , 0);
		teatro3.setActor("Sargento Garcia" , 1);
		teatro3.setActor("Diego Luna" , 2);
		
		System.out.println(teatro3.toString());
		
		EntradaDeporte futbol = new EntradaDeporte();
		
		System.out.println(futbol.EntradaFutbolInternacional());
	}
}
