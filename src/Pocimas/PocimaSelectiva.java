package Pocimas;
import CartasJuego.Carta;
import CartasJuego.Jugador;

public class PocimaSelectiva extends PocimaPorcentaje{

	private String atributo; 
	private Jugador jugador;
	
	public PocimaSelectiva(String nombre, Double porcentaje,String atributo,Jugador jugador) {
		super(nombre, porcentaje);
		this.atributo = atributo; 
		this.jugador = jugador;
	}
	
	@Override
	public void aplicarPocima(Carta carta) {
		if(carta.containAtributo(this.getAtributo()) && this.getJugador().getAtributoElegido().equals(this.getAtributo()) )
		super.aplicarPocima(carta);
	}
	
	public String getAtributo() {
		return atributo;
	}

	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}
	
	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	
	

}
