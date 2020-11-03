

import CartasJuego.JuegoCartas;
import CartasJuego.Jugador;
import CartasJuego.MazoCartas;
import CartasJuego.VisorMazo;
import EstrategiaJugador.EstrategiaAmbicioso;
import EstrategiaJugador.EstrategiaObstinado;
import EstrategiaJugador.EstrategiaTimbero;
import Pocimas.Pocima;
import Pocimas.PocimaCompuesta;
import Pocimas.PocimaPorcentaje;
import Pocimas.PocimaSelectiva;
import Pocimas.PocimaValorfijo;

public class Main {
	//Ayudante Andres

	public static void main(String[] args) {
		
		
		MazoCartas mazoAlterado = VisorMazo.obtenerMazo("src/superheroes.json");
		Pocima p1 =new PocimaPorcentaje("Fortalecedora",-20D);
		Pocima p2 =new PocimaValorfijo("vale cuatro",4D);
		Pocima p3 =new PocimaSelectiva("SelectivaFuerza",35D,"fuerza");
		PocimaCompuesta p4 = new PocimaCompuesta("pocimaCompuesta");
	
		PocimaCompuesta p5 = new PocimaCompuesta("pocimaCompuesta");
		PocimaCompuesta p6 = new PocimaCompuesta("pocimaCompuesta");
		p6.addPocima(p4);
		p6.addPocima(p5);
		
		//p3.addPocima(p1);
		mazoAlterado.addPocima(p6);
		//mazoAlterado.addPocima(p2);
		//mazoAlterado.addPocima(p3);
		//mazoAlterado.addPocima(p4);
		
		Jugador j1 = new Jugador("juan",new EstrategiaObstinado("fuerza"));
		//Jugador j2 = new Jugador("maria",new EstrategiaAmbicioso());
		Jugador j2 = new Jugador("maria",new EstrategiaObstinado("fuerza"));
		
		
		
		//MazoCartas mazoAlterado = VisorMazo.obtenerMazo("src/autos.json");
		
		JuegoCartas juego = new JuegoCartas(j1,j2,mazoAlterado,20);
		
		juego.jugar();
		
	
	}
	
 }
