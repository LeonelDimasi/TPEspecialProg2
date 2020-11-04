package CartasJuego;

public class JuegoCartas {
	
	private Jugador j1;
	private Jugador j2;
	private String nombreJ1;
	private String nombreJ2;
	private Jugador turno;
	private String jugadorGanador;
	private MazoCartas mazocartas;
	private int rondaActual;
	private int rondasMaximas;
	
	
	public JuegoCartas(Jugador j1, Jugador j2, MazoCartas mazocartas,int rondas) {
		this.j1 = j1;
		this.j2 = j2; 
		this.mazocartas = mazocartas;
		this.turno = j1;
		this.nombreJ1 = j1.getNombre();
		this.nombreJ2= j2.getNombre();
		this.rondasMaximas=rondas+1;
		this.rondaActual=1;
	}
	public void setRondas(int rondas){
		this.rondasMaximas=rondas;
	}
	
	public int getRondas() {	
		return this.rondasMaximas;
	}
	
	public void jugar() {
		this.prepararPartida();
		if (jugadoresAptos()){
			System.out.println("La estrategia usada por el jugador 1 ("+ j1.getNombre()+"), es " +j1.getEstrategia().getNombre());
			System.out.println("La estrategia usada por el jugador 2 ("+ j2.getNombre()+"), es " +j2.getEstrategia().getNombre());
				while (!hayGanador()&& this.getRondas()!=this.getRondaActual()) {
					jugarMano();
				}
				if (getGanador() == null) {
					System.out.println("Empataron");
				}else {
					jugadorGanador = this.getGanador().getNombre();
					System.out.println("----------------------------------");
					System.out.println("La partida la gano "+ jugadorGanador);
				}
			}	
				else{
				System.out.println("----------------------------------");
				System.out.println("La partida la gano "+ jugadorGanador);
				}
		
//		else{
//			jugadorGanador = this.getGanador().getNombre();
//			if(jugadorGanador==null){
//				System.out.println("Empataron");
//			}
			//System.out.println("Imposible jugar con este mazo");			
		
	}
	
	public boolean hayGanador() {
		return (!this.j1.hayCartas()||!this.j2.hayCartas());
	}
	
	private void prepararPartida() {
		this.mazocartas.barajar();
		this.mazocartas.repartir(j1,j2);
	}
	
	public Jugador getGanador() {
		if (this.j1.CantidadCartas() == this.j2.CantidadCartas()) {
			return null;
		} else if (this.j1.CantidadCartas() > this.j2.CantidadCartas()) {
			return this.j1;
		} else
			return this.j2;
	}
	
	public Jugador getTurno() {
		return this.turno;
	}
	
	public void cambiarMazo(MazoCartas nuevoMazo) {
		this.mazocartas = nuevoMazo;
	}
	
	public boolean jugadoresAptos() {
		return (this.j1.hayCartas()&&this.j2.hayCartas());
	}
	
	protected void jugarMano() {
		Carta c1 = this.j1.tomarCarta();			
		Carta c2 = this.j2.tomarCarta();
		String a;
		String nombreCartaJ1 = c1.getNombre();
		String nombreCartaJ2 = c2.getNombre();
		String nombreAtributo;
		Double valorAtributoJ1;
		Double valorAtributoJ2;
		int cantCartasJ1;
		int cantCartasJ2;
		Carta c1ConPocima;
		Carta c2ConPocima;

		if (this.getTurno().equals(j1)) {
			a = this.j1.elegirAtributo(c1);
		}else {	
			a = this.j2.elegirAtributo(c2);
		}
		
		c1ConPocima=this.j1.aplicarPocima(c1);
		c2ConPocima=this.j2.aplicarPocima(c2);
		nombreAtributo = a;
		valorAtributoJ1 = c1ConPocima.getValorAtributo(a);
		valorAtributoJ2 = c2ConPocima.getValorAtributo(a);
		System.out.println("----------------------------------");
		System.out.println("Ronda nro: "+this.getRondaActual());
		System.out.println("Es el Turno de " + (this.getTurno().getNombre()));
		System.out.println("La carta de " + this.nombreJ1 + " es " + nombreCartaJ1);
		System.out.println("con atributo "+ nombreAtributo+" " + c1.getValorAtributo(nombreAtributo));
		if(c1.getPocima()!=null)
		System.out.println(" se aplicó la pocima "+ c1ConPocima.getPocima().getNombre()+" con valor resultante " + valorAtributoJ1 );
		
		System.out.println("La carta de " + this.nombreJ2 + " es " + nombreCartaJ2);
		System.out.println("con atributo "+ nombreAtributo+" " + c2.getValorAtributo(nombreAtributo));
		if(c2.getPocima()!=null)
			System.out.println(" se aplicó la pocima "+ c2ConPocima.getPocima().getNombre()+" con valor resultante " + valorAtributoJ2 );
		
		System.out.println(nombreAtributo + " jugador 1 ("+ j1.getNombre()+") :" + valorAtributoJ1);
		System.out.println(nombreAtributo + " jugador 2 ("+j2.getNombre()+"):" + valorAtributoJ2);		
		
		if (c1ConPocima.isMenor(a,c2ConPocima)) { 			
			this.j2.addCarta(c1); 
			this.j2.addCarta(c2);
			System.out.println("Gano la ronda el jugador 2(" + j2.getNombre()+")");
			this.turno = j2;
		}else if (c2ConPocima.isMenor(a,c1ConPocima)) {
			this.j1.addCarta(c1);
			this.j1.addCarta(c2);
			System.out.println("Gano la ronda el jugador 1(" +j1.getNombre()+")");
			this.turno = j1;
		}else {//revisar 
			this.j1.addCarta(c1);
			this.j2.addCarta(c2);
		}
		cantCartasJ1 = j1.CantidadCartas();
		cantCartasJ2 = j2.CantidadCartas();
		System.out.println("El jugador 1(" + j1.getNombre()+") tiene " + cantCartasJ1 + " cartas");
		System.out.println("El jugador 2(" +j2.getNombre() + ") tiene " + cantCartasJ2 + " cartas");
		this.setRondaActual(this.getRondaActual()+1);

	}
	public int getRondaActual() {
		return rondaActual;
	}
	public void setRondaActual(int rondaActual) {
		this.rondaActual = rondaActual;
	}
	

}
