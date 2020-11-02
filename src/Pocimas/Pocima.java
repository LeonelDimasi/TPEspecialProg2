package Pocimas;



import CartasJuego.Carta;

public interface Pocima {
	public Carta aplicarPocima(Carta carta,String atributo);
	public String getNombre();
}
