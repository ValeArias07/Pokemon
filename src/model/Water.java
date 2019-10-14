package model;

public class Water extends Pokemon{
	
	private int almacenamiento;
	private int intensidad;
	private boolean fueraAgua;
	
	
	public Water(int numero, String nombre, int nivel, int evolucion, int almacenamiento, int intensidad,
			boolean fueraAgua) {
		
		super(numero, nombre, nivel, evolucion);
		this.almacenamiento = almacenamiento;
		this.intensidad = intensidad;
		this.fueraAgua = fueraAgua;
	}


	public int getAlmacenamiento() {
		return almacenamiento;
	}


	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}


	public int getIntensidad() {
		return intensidad;
	}


	public void setIntensidad(int intensidad) {
		this.intensidad = intensidad;
	}


	public boolean isFueraAgua() {
		return fueraAgua;
	}


	public void setFueraAgua(boolean fueraAgua) {
		this.fueraAgua = fueraAgua;
	}


	@Override
	public String toString() {
		return super.toString()+"Water [almacenamiento=" + almacenamiento + ", intensidad=" + intensidad + ", fueraAgua=" + fueraAgua
				+ "]";
	}
	
	
}
