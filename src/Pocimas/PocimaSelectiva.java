package Pocimas;
import CartasJuego.Carta;

public class PocimaSelectiva extends PocimaPorcentaje{

	private String atributo; 
	
	public PocimaSelectiva(String nombre, Double porcentaje,String atributo) {
		super(nombre, porcentaje);
		this.atributo = atributo; 
	}
	
	@Override
	public Carta aplicarPocima(Carta carta,String atributo) {
		Carta cartaAux=carta.copiarCarta();
		if(cartaAux.containAtributo(this.getAtributo()) && this.getAtributo().equals(atributo))
			cartaAux=super.aplicarPocima(cartaAux,atributo);
		return cartaAux;
	}
	
	public String getAtributo() {
		return atributo;
	}

	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}
}
