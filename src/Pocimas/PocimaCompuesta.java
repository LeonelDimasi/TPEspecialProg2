package Pocimas;

import java.util.ArrayList;

import CartasJuego.Carta;

public class PocimaCompuesta implements Pocima{

	private ArrayList<Pocima> pocimas;
	private String nombre;
	
	public PocimaCompuesta(String nombre) {
		this.nombre = nombre;
		this.pocimas =  new ArrayList<Pocima>();
	}
	
	public void addPocima(Pocima pocima) {
		this.pocimas.add(pocima);
	}
	
	public Carta aplicarPocima(Carta carta,String atributo) {
		Carta cartaAux = carta.copiarCarta();
		for(Pocima pocima: this.getPocimas()) {
			
			cartaAux = pocima.aplicarPocima(cartaAux, atributo);
			
		}
		return cartaAux;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Pocima> getPocimas() {
		return new ArrayList<Pocima>(this.pocimas); 
	}

	
}
