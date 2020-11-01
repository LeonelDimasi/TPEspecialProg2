package CartasJuego;

import java.util.HashMap;
import java.util.Iterator;

import Pocimas.Pocima;

public class Carta {
	
	private String nombre;
	private HashMap<String, Integer> atributos;

	public Carta(){ 
		this.atributos = new HashMap<String, Integer>(); 
	}
	
	public Carta(String nombre,HashMap<String,Integer> atributos){
		this.nombre=nombre;
		this.atributos = atributos; 

	}
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}

	public boolean isMenor(String nombre,Carta c){
		return this.getValorAtributo(nombre)<c.getValorAtributo(nombre);
	}	
	
	/*public String atributoAzar() {
		String clave = "";
		int r= (int) (Math.random() * (this.getCantidadAtributos()));


		Iterator<String> it = this.atributos.keySet().iterator();
		for (int i = 0;it.hasNext() && i<=r;i++) {
			
	
			clave = it.next();
	
		}
		return clave;
	}*/
	
	public void addAtributo(String nombre, int valor) {
		this.atributos.put(nombre, valor);
	}

	public int getValorAtributo(String nombre) {
		return this.atributos.get(nombre);
	}
		
	public String getNombre() {
		return this.nombre;
	}
	
	public boolean containAtributo(String nombre) {
		return atributos.containsKey(nombre);
	}
	
	public boolean equals(Carta c) {
		if (this.getCantidadAtributos() == c.getCantidadAtributos()) {			
			for (String atributo : atributos.keySet()) {
				if(c.containAtributo(atributo)){
					continue;
				}
				else 
				{
					return false;
				}
			}
						
			return true;			
		}
		else {
			return false;
		}
	}
	
	public HashMap<String, Integer> getAtributos() {
		return new HashMap<String, Integer>(atributos);
	}

	public int getCantidadAtributos() { 		
		return this.atributos.size();
	}
	
	public String toString(){ 
		String datosCarta = "";		
		datosCarta += this.getNombre() + "\n";
		
		for (String atributo : atributos.keySet()) {
			datosCarta += " - " + atributo + " = " + atributos.get(atributo) + "\n";
		}
		return datosCarta;
	}
	
	public void addPocima(Pocima pocima) {
		pocima.aplicarPocima(this);
	}
	
}
