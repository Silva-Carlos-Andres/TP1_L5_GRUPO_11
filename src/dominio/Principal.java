package dominio;

import java.nio.channels.SeekableByteChannel;

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
		
	}
}
