package Pocimas;

import CartasJuego.Carta;

public abstract class PocimaSimple implements  Pocima {

	private String nombre;
	
	public PocimaSimple(String nombre) {
		this.nombre=nombre;
		
	}

	
	public abstract Carta aplicarPocima(Carta carta,String atributo);


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
