package EstrategiaJugador;

import CartasJuego.Carta;

public class EstrategiaObstinado extends Estrategia {
	
	private String nombre;
	private String atributo;
	
	public EstrategiaObstinado(String atributo) {
		this.atributo = atributo;
		this.nombre = "Estrategia Obstinado";
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getAtributo() {
		return atributo;
	}
	
	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}
	
	@Override
	public String getAtributo(Carta c) {
		
		if(c.containAtributo(this.getAtributo())) {
			return this.getAtributo();
		}
		return null;
	}

}
