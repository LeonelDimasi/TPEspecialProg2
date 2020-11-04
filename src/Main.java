

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
	public static void main(String[] args) {
		
		int rondas = 10;
		
		MazoCartas mazoAlterado = VisorMazo.obtenerMazo("src/superheroes.json");
		Pocima p1 =new PocimaPorcentaje("Fortalecedora",20D);
		Pocima p2 =new PocimaPorcentaje("Fortalecedora plus",50D);
		Pocima p3 =new PocimaPorcentaje("Kriptonita",-25D);
		Pocima p4 =new PocimaPorcentaje("Reductor de plomo",-55D);
		Pocima p5 =new PocimaValorfijo("vale cuatro",4D);
		Pocima p6 =new PocimaValorfijo("numero magico",23D);
		Pocima p7 =new PocimaSelectiva("Selectiva Fuerza",35D,"fuerza");
		Pocima p8 =new PocimaSelectiva("Selectiva Peso",43D,"peso");
		Pocima p9 =new PocimaPorcentaje("Fortalecedora",-20D);
		PocimaCompuesta p10 = new PocimaCompuesta("Pocima cocktail");
		p10.addPocima(p1);
		p10.addPocima(p2);
		
		mazoAlterado.addPocima(p1);
		mazoAlterado.addPocima(p2);
		mazoAlterado.addPocima(p3);
		mazoAlterado.addPocima(p4);
		mazoAlterado.addPocima(p5);
		mazoAlterado.addPocima(p6);
		mazoAlterado.addPocima(p7);
		mazoAlterado.addPocima(p8);
		mazoAlterado.addPocima(p9);
		mazoAlterado.addPocima(p10);
		
		
		
		Jugador j1 = new Jugador("juan",new EstrategiaObstinado("fuerza"));
		Jugador j2 = new Jugador("maria",new EstrategiaObstinado("fuerza"));
		
		JuegoCartas juego = new JuegoCartas(j1,j2,mazoAlterado,rondas);
		juego.jugar();
	}
	
 }
