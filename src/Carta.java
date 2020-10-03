import java.util.HashMap;

public class Carta {
	
	private String personaje;
	private HashMap<String,Long> atributos;
	
	Carta(String personaje){
		this.personaje = personaje;
		this.atributos = new HashMap<String,Long>();
	}
	
	Carta(String personaje,HashMap<String,Long> atributos){
		this.personaje = personaje;
		this.atributos = atributos;
	}
	
	public String getPersonaje() {
		return personaje;
	}
	
	public HashMap<String, Long> getAtributos() {
		return atributos;
	}
	
	
	public void setAtributos(HashMap<String, Long> atributos) {
		this.atributos = atributos;
	}  
	
	public void addAtributo(String nombreAtributo, Long valor) {
		this.atributos.put(nombreAtributo, valor);
	}  
	
	public Boolean mejorCarta(String nombreAtributo, Long valor) {
		return true;
	}
	
}
