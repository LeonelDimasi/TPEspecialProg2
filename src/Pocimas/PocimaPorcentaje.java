package Pocimas;

import java.util.Iterator;

import CartasJuego.Carta;

public class PocimaPorcentaje extends PocimaSimple{

	private Double porcentaje;
	
	public PocimaPorcentaje(String nombre,Double porcentaje ) {
		super(nombre);
		this.porcentaje = porcentaje;
	}

	@Override
	public Carta aplicarPocima(Carta carta,String atributo) {
		Carta cartaAux=carta.copiarCarta();
		Iterator<String> it = cartaAux.getAtributos().keySet().iterator();
		while(it.hasNext()) {	
			String nombreAtributo = it.next(); 
			Double valor = cartaAux.getAtributos().get(nombreAtributo);
			valor = valor + (valor * this.getPorcentaje())/100;
			if(valor < 0)
				valor=0D;
			cartaAux.cambiarValorAributo(nombreAtributo, valor);
		}
		return cartaAux;
	}

	public Double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(Double porcentaje) {
		this.porcentaje = porcentaje;
	}
	

}
