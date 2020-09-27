
public class Atributo {
	
	private String nombre;
	private int valor; 
	
	public Atributo(String nombre, int valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	public Atributo mejorAtributo(Atributo atr1,Atributo atr2) {
		
		if (atr1.getValor() > atr2.getValor()) {
			return atr1;
		}else if(!(atr1.getValor() == atr2.getValor())){
			return atr2;
		}
		return null;
	}

	
	
	public String getNombre() {
		return nombre;
	}

	public int getValor() {
		return valor;
	}

	
}
