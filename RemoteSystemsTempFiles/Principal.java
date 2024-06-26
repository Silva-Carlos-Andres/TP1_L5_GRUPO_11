package dominio;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

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
		Persona[] p = {
						new Profesional("Luis", "Ayala",GeneroEntradaRecital.REGGAETON),
						new Profesional(),
						new Profesional()
					};
		Entrada recital = new EntradaRecital(
								" Mantequita tuerta ",
								LocalDate.of(2023, 05, 06),
								LocalTime.of(0, 0),
								Duration.ofHours(2).plusMinutes(33),
								null,
								new TipoEntradaRecital(DescripcionTipoRecital.VIP),
								new Banda(
										"Daddy Yankee",
										p,
										LocalDate.of(1994, 1, 1),
										GeneroEntradaRecital.REGGAETON
										),
								new Banda[2]
							);
		
		System.out.println(recital.toString());
		
		//GENERAL
		Persona[] p2 = {
					new Profesional("Paul", "Hewson",GeneroEntradaRecital.REGGAETON),
					new Profesional(),
					new Profesional()
				};
		Entrada recital2 = new EntradaRecital(
				" CosquinPop ",
				LocalDate.of(2025, 06, 06),
				LocalTime.of(0, 0),
				Duration.ofHours(1).plusMinutes(45),
				null,
				new TipoEntradaRecital(DescripcionTipoRecital.GENERAL),
				new Banda(
						"U2",
						p2,
						LocalDate.of(1976, 1, 1),
						GeneroEntradaRecital.POP
						),
				new Banda[2]
			);
		System.out.println(recital2.toString());
		
		
		//ENTRADA TEATRO
		//CREACION ACTORES
		Actor[] actores = new Actor[9];
		
		actores[0] = new Actor();
		actores[0].setNombreApellido("Joseph","Manon");
		actores[1] = new Actor();
		actores[1].setNombreApellido("Luis", "Caputto");
		actores[2] = new Actor();
		actores[2].setNombreApellido("Hector", "Alterio");
		actores[3] = new Actor();
		actores[3].setNombreApellido("Samuel", "Simpson");
		actores[4] = new Actor();
		actores[4].setNombreApellido("James", "Rosedal");
		actores[5] = new Actor();
		actores[5].setNombreApellido("Silvio", "Soldan");
		actores[6] = new Actor();
		actores[6].setNombreApellido("Duende", "Verde");
		actores[7] = new Actor();
		actores[7].setNombreApellido("William", "Williams");
		actores[8] = new Actor();
		actores[8].setNombreApellido("Sargento", "Garcia");
		
		
		
		
		
		//DRAMA
		EntradaTeatro teatro1 = new EntradaTeatro();
		teatro1.setGenero(GeneroEntradaTeatro.DRAMA);
		teatro1.setNombre("La obrita dramatica");
		teatro1.setDiaFuncion(03, 06, 2025);
		teatro1.setDuracion(3,55);
		teatro1.setActor(actores[0].getNombreApellido() , 0);
		teatro1.setActor(actores[1].getNombreApellido() , 1);
		teatro1.setActor(actores[2].getNombreApellido() , 2);
		
		
		System.out.println(teatro1.toString());
		
		//TEATRO
		EntradaTeatro teatro2 = new EntradaTeatro();
		teatro2.setGenero(GeneroEntradaTeatro.TEATRO);
		teatro2.setNombre("La desgracia del feriado");
		teatro2.setDiaFuncion(03, 06, 2026);
		teatro2.setDuracion(2,35);
		teatro2.setActor(actores[3].getNombreApellido() , 0);
		teatro2.setActor(actores[4].getNombreApellido() , 1);
		teatro2.setActor(actores[5].getNombreApellido() , 2);
		
		
		System.out.println(teatro2.toString());
		
		// COMEDIA		
		EntradaTeatro teatro3 = new EntradaTeatro();
		teatro3.setGenero(GeneroEntradaTeatro.COMEDIA);
		teatro3.setNombre("La risa ");
		teatro3.setDiaFuncion(16, 05, 2026);
		teatro3.setDuracion(1,13);
		teatro3.setActor(actores[6].getNombreApellido() , 0);
		teatro3.setActor(actores[7].getNombreApellido() , 1);
		teatro3.setActor(actores[8].getNombreApellido() , 2);
		
		System.out.println(teatro3.toString());
		
		EntradaDeporte futbol = new EntradaDeporte();
		
		System.out.println(futbol.EntradaFutbolInternacional());
	}
}
