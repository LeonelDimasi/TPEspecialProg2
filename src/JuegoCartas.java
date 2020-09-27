
public class JuegoCartas {
	
	private static final int CANT_JUGADORES = 2;
	private static final int CANT_RONDAS = 10;
	private MazoCartas mazoCartas;
	
	JuegoCartas(mazoCartas){
		this.mazoCartas = mazoCartas;
	}
	
	
	public void repartirCartas(j1,j2) {
		if(esImpar(this.mazoCartas.cantidadCartas())) {
			j1 tiene una carta mas
		}
	}
	
	public boolean esImpar(int iNumero) {
		  if (iNumero%2!=0)
		    return true;
		  else
		    return false;
	}
	
	public void imprimirRonda() {
		System.out.println("------- Ronda "+"numeroRonda"+" ------- ");
		System.out.println("Turno Jugador : " +"jugadorGnador.getNombre()");
		System.out.println("Atributo elegido: " +"atributo fuerza" );
		System.out.println(" Juan    Flash        fuerza  840  ");
		System.out.println(" María   Superman     fuerza 2000 ");
		System.out.println("María : 11 cartas, Juan:  9 cartas ");
		System.out.println("Gana la ronda María.");
	}
	/**
	 * if (!j1.getCartas()!=null || j2.getCartas() != null ) || (juego.getRondas()< rondasmaxima){
	y así sucesivamente hasta que un jugador se quede sin cartas o se llegue a un máximo de rondas (lo que ocurra primero). 
	 * 
	 * */

}
