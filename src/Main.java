

import CartasJuego.JuegoCartas;
import CartasJuego.Jugador;
import CartasJuego.MazoCartas;
import CartasJuego.VisorMazo;
import EstrategiaJugador.EstrategiaAmbicioso;
import EstrategiaJugador.EstrategiaTimbero;

public class Main {
	//Ayudante Andres

	public static void main(String[] args) {
		
		
		MazoCartas mazoAlterado = VisorMazo.obtenerMazo("src/superheroes.json");
		
		//mazoAlterado.addPocima();
		
		
		Jugador j1 = new Jugador("juan",new EstrategiaTimbero());
		Jugador j2 = new Jugador("maria",new EstrategiaAmbicioso());
		
		
		JuegoCartas juego = new JuegoCartas(j1,j2,mazoAlterado,10);
		
		juego.jugar();
		
		System.out.println(j1.getEstrategia().getNombre());
		System.out.println(j2.getEstrategia().getNombre());
	}
	
 }
