
public class Main {
	//Ayudante Andres

	public static void main(String[] args) {
		
		Jugador j1 = new Jugador("Juan");
		Jugador j2 = new Jugador("Maria");
		JuegoCartas juego = new JuegoCartas(VisorMazo.obtenerMazo("src/superheroes.json"));
		
		juego.repartirCartas(j1, j2);
		

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
