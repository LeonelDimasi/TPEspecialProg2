import java.util.List;

public class MazoCartas {
	
	private List<Carta> mazoCartas;
	
	
	public MazoCartas(List<Carta> mazoCartas) {
		super();
		this.mazoCartas = mazoCartas;
	}

	public Boolean VerificarCartas() {
		
	//(mismos atributos y cantidad)	
	return true;
	}
	
	public int cantidadCartas() {
		return this.mazoCartas.size();
	}
	
	

}
