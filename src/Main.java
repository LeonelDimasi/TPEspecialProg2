

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
		
		//mazoAlterado.addPocima();
		//Pocima p1=new PocimaPorcentaje("Fortalecedora",-20D);
		//Pocima p2=new PocimaValorfijo("vale cuatro",4D);
		//Pocima p1=new PocimaSelectiva("SelectivaFuerza",35D,"fuerza");
		Pocima p3=new PocimaCompuesta("pocimaCompuesta");
		//p3.addPocima(p1);
		//mazoAlterado.addPocima(p1);
		
		Jugador j1 = new Jugador("juan",new EstrategiaObstinado("fuerza"));
		//Jugador j2 = new Jugador("maria",new EstrategiaAmbicioso());
		Jugador j2 = new Jugador("maria",new EstrategiaObstinado("fuerza"));
		
		
		JuegoCartas juego = new JuegoCartas(j1,j2,mazoAlterado,10);
		
		juego.jugar();
		
	
	}
	
 }
