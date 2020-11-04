package EstrategiaJugador;

import CartasJuego.Carta;

public abstract class Estrategia {
	public abstract String getAtributo(Carta c);
	public abstract String getNombre();
}
