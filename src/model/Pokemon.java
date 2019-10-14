package model;

public class Pokemon {
	
	private int numero;
	private String nombre;
	private int nivel;
	private int evolucion;
	private int health;
	
	
	public Pokemon(int numero, String nombre, int nivel, int evolucion) {
		
		this.numero = numero;
		this.nombre = nombre;
		this.nivel = nivel;
		this.evolucion = evolucion;
		this.health=genHealth();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getEvolucion() {
		return evolucion;
	}

	public int getHealth() {
		return health;
	}
	public void setEvolucion(int evolucion) {
		this.evolucion = evolucion;
	}
	
	public int genHealth() {
		this.health=(evolucion*nivel)*10;
	return health;
	}
	
}





