package Pocimas;

import java.util.Iterator;

import CartasJuego.Carta;

public class PocimaValorfijo extends PocimaSimple{
	
	private Double valorFijo;
	
	

	public PocimaValorfijo(String nombre,Double valorFijo) {
		super(nombre);
		this.valorFijo = valorFijo;
	}

	@Override
	public Carta aplicarPocima(Carta carta,String atributo) {
		Carta cartaAux=carta.copiarCarta();
		Iterator<String> it = cartaAux.getAtributos().keySet().iterator();
		while(it.hasNext()) {	
			String nombreAtributo = it.next(); 
			Double valor = cartaAux.getAtributos().get(nombreAtributo);
			valor = this.getValorFijo();
			if(valor < 0)
				valor=0D;
			cartaAux.cambiarValorAributo(nombreAtributo, valor);
		}
		return cartaAux;
	}
	
	public Double getValorFijo() {
		return valorFijo;
	}

	public void setValorFijo(Double valorFijo) {
		this.valorFijo = valorFijo;
	}

}
