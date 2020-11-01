

import CartasJuego.JuegoCartas;
import CartasJuego.Jugador;
import CartasJuego.VisorMazo;
import EstrategiaJugador.EstrategiaAmbicioso;
import EstrategiaJugador.EstrategiaTimbero;

public class Main {
	//Ayudante Andres

	public static void main(String[] args) {
		
		
		
		
		
		
		
		//MazoCartas mazoAlterado = VisorMazo.obtenerMazo("src/superheroes.json");
		
		//mazoAlterado.setPocima(pocima);
		Jugador j1 = new Jugador("juan",new EstrategiaTimbero());
		Jugador j2 = new Jugador("maria",new EstrategiaAmbicioso());
		JuegoCartas juego = new JuegoCartas(j1,j2,VisorMazo.obtenerMazo("src/superheroes.json"),10);
		
		juego.jugar();
		
		System.out.println(j1.getEstrategia().getNombre());
		System.out.println(j2.getEstrategia().getNombre());
	}
	
	
	       
	
	/*
	el primer jugador toma la primera carta en su posesi�n 
	El jugador que posea la carta con mayor valor para ese atributo se lleva las dos cartas
	(se colocan al final de su mazo)
	y tambi�n tiene el turno en la siguiente ronda. jugadorGanador.setTurno(true)
	
	if (!j1.getCartas()!=null || j2.getCartas() != null ) || (juego.getRondas()< rondasmaxima){
		
		fin de juego getGanador() 
	} 
	
	Funcionalidad: 
		new Mazo()
	
	
	empate, las cartas de ambos jugadores pasan al final de su mazo y se sigue jugando con la siguiente carta,
		    manteniendo el turno del jugador.

	*/
 }
