package Pocimas;

import CartasJuego.Carta;

public abstract class PocimaSimple implements  Pocima {

	private String nombre;
	
	public PocimaSimple(String nombre) {
		this.nombre = nombre;
		
	}

	
	public abstract void aplicarPocima(Carta carta);

}
