package model;

public class Fire extends Pokemon {
	
	private int firePower;
	private int fireIntense;

	
	
	public Fire(int numero, String nombre, int nivel, int evolucion, int firePower, int fireIntense) {
		super(numero, nombre, nivel, evolucion);
		this.firePower = firePower;
		this.fireIntense = fireIntense;
	}


	public int getFirePower() {
		return firePower;
	}


	public void setFirePower(int firePower) {
		this.firePower = firePower;
	}


	public int getFireIntense() {
		return fireIntense;
	}


	public void setFireIntense(int fireIntense) {
		this.fireIntense = fireIntense;
	}


	@Override
	public String toString() {
		return "[Poder del Fuego=" + firePower + ",Intensidad del Fuego=" + fireIntense;
	}
}
