import java.util.List;

public class Jugador {
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}

	private String nombre;
	private List<Carta> cartas;
	
	public Carta tomarCartaAleatoria(){
		//si tengo cartas
		//math randon entre las cartas q tenga
		
		return null;
	}

	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	

}
