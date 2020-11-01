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
	public void aplicarPocima(Carta carta) {
		Iterator<String> it = carta.getAtributos().keySet().iterator();
		while(it.hasNext()) {	
			String nombreAtributo = it.next(); 
			Double valor = carta.getAtributos().get(nombreAtributo);
			valor = this.getValorFijo();
			if(valor < 0)
				valor=0D;
			carta.cambiarValorAributo(nombreAtributo, valor);
		}
	}
	
	public Double getValorFijo() {
		return valorFijo;
	}

	public void setValorFijo(Double valorFijo) {
		this.valorFijo = valorFijo;
	}

}
