package model;

public class Earth extends Pokemon{

	private int profundidad;
	
	public Earth(int numero, String nombre, int nivel, int evolucion, int profundidad) {
		super(numero, nombre, nivel, evolucion);
		this.profundidad = profundidad;
	}

	public int getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(int profundidad) {
		this.profundidad = profundidad;
	}

	@Override
	public String toString() {
		return "Earth [profundidad=" + profundidad + "]";
	}
	
	

}
