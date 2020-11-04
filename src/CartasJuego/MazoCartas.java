package CartasJuego;

import java.util.ArrayList;
import java.util.Collections;

import Pocimas.Pocima;

public class MazoCartas {
	
	private final int PRIMERA = 0;
	private String nombreMazo;
	private ArrayList<Carta> mazo;
	private ArrayList<Pocima>pocimas; 
	
	public MazoCartas() {
		this.nombreMazo = "";
		this.mazo = new ArrayList<Carta>();
		this.pocimas = new ArrayList<Pocima>();
	}	
	
	public void setNombreMazo(String nombreMazo){
		this.nombreMazo=nombreMazo;
	}
	
	public String getNombreMazo(){
		return nombreMazo;
	}
	
	public boolean addCarta(Carta c) {
		if (this.vacio()) {
			this.mazo.add(c);
			return true;
		}else if (c.equals(this.mazo.get(PRIMERA))) {//revisar
			this.mazo.add(c);
			return true;
		}else {
			return false;
		}		
	}
	
	public Carta tomarPrimera() {
		if (!this.mazo.isEmpty()){
			Carta c = this.mazo.get(PRIMERA);
			this.mazo.remove(PRIMERA);
			return c;
		}else
			return null;
	}
	
	public void repartir(Jugador j1,Jugador j2) {
		int tamaño;
		int i = 0;
		//if (this.mazo.size() % ESPAR != 0) {
		this.addPocionesAlAzar();
			tamaño = this.mazo.size();
			while (i < tamaño) {
				
				j1.addCarta(this.mazo.get(i));
				i++;
				if(i < tamaño) {
					j2.addCarta(this.mazo.get(i));
					i++;
				}
				
			}
		//}
		/*else {
			tamaño = this.mazo.size();
			while (i < tamaño) {
				j1.addCarta(this.mazo.get(i));
				i++;
				j2.addCarta(this.mazo.get(i));
				i++;
			}*/
		//}
		
		
		
	}
	
	public boolean vacio() {
		return this.mazo.isEmpty();
	}
	
	public void vaciarMazo() {
		this.mazo.clear();
	}
	
	public int getTamañoMazo(){
		return mazo.size();
	}
	
	public String toString(){ 
		String datosMazo = "";
		datosMazo += this.nombreMazo + "\n";
			
			for (int i=0; i<getTamañoMazo();i++) {
				datosMazo += this.mazo.get(i).toString() + "\n";		
				
			}
		return datosMazo;
	}
	
	public void barajar() {   
		Collections.shuffle(mazo);
	}
	
	/*public MazoCartas getCartas(Filtro filtro){
		MazoCartas nuevoMazo = new MazoCartas();
		
		for (Carta carta : mazo) {
			
			if (filtro.cumple(carta)){
				nuevoMazo.addCarta(carta);
			}
		}
		return nuevoMazo;
	}*/
	
	public ArrayList<Carta> getCartas(){
		return new ArrayList<Carta>(this.mazo);
	}

	public void addPocima(Pocima p1) {
		if(this.getTamañoMazo() >= this.pocimas.size()) {
			this.pocimas.add(p1);
		}else {
			System.out.println("no se pudo agregar la pocima,no puede haber mas pocimas que cartas en el mazo");
		}
		
	}
	
	private void addPocionesAlAzar() {

		int posimasRestantes = this.pocimas.size();
		int posima  = 0;
		while(posimasRestantes != 0) {
			int r= (int) (Math.random() * (this.getTamañoMazo()));
			if(this.mazo.get(r).getPocima()==null) {

				this.mazo.get(r).addPocima(pocimas.get(posima));
				posima++;
				posimasRestantes--;
			}

		}

	}

}
