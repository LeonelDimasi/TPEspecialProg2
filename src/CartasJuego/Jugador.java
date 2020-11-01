package CartasJuego;

import EstrategiaJugador.Estrategia;

public class Jugador {
	
	private String nombre;
	private MazoCartas cartasJugador;
	private Estrategia estrategia;
	
	

	public Jugador(String n,Estrategia estrategia) {
		this.nombre = n;
		this.cartasJugador = new MazoCartas();
		this.estrategia = estrategia;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String n) {
		this.nombre = n;
	}
	
	public Carta tomarCarta() {
		Carta c = this.cartasJugador.tomarPrimera();
		return c;
	}
	
	public boolean hayCartas() {
		return !this.cartasJugador.vacio();
	}
	
	public void addCarta(Carta c1) {
		this.cartasJugador.addCarta(c1);
	}
	
	public String elegirAtributo(Carta c) {
		return estrategia.getAtributo(c);
	}
	
	public int CantidadCartas(){ 
		return cartasJugador.getTamañoMazo();
	}
	
	public Estrategia getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(Estrategia estrategia) {
		this.estrategia = estrategia;
	}

}
