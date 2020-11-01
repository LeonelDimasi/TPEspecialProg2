package EstrategiaJugador;

import java.util.Iterator;

import CartasJuego.Carta;

public class EstrategiaTimbero extends Estrategia {
	
	private String nombre;
	
	public EstrategiaTimbero( ) {
		this.nombre = "Estrategia Timbero";
	}

	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String getAtributo(Carta c) {
		String clave = "";
		int r= (int) (Math.random() * (c.getCantidadAtributos()));
		Iterator<String> it = c.getAtributos().keySet().iterator();
		for (int i = 0;it.hasNext() && i<=r;i++) {
			clave = it.next();
		}
		return clave;
	}

}
