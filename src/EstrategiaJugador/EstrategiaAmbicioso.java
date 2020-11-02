package EstrategiaJugador;

import java.util.Iterator;

import CartasJuego.Carta;

public class EstrategiaAmbicioso extends Estrategia{

	private String nombre;
	
	public EstrategiaAmbicioso() {
		this.nombre = "Estrategia Ambicioso";
	}
	
	public String getNombre() {
		return nombre;
	}

	

	@Override
	public String getAtributo(Carta c) {
		String clave = "";
		String claveaxu="";
		Double valorMaximo = 0D;
		Iterator<String> it = c.getAtributos().keySet().iterator();
		
		while(it.hasNext()) {	
			clave = it.next();
			if(c.getAtributos().get(clave) >= valorMaximo ) {
				claveaxu=clave;
				valorMaximo = c.getAtributos().get(clave);
				
			}
			
		}
		
		return claveaxu;
	}

}
