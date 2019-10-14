package model;

import java.util.Arrays;

public class Juego {

	//relations
	private Pokemon pokemon[];
	
	//Methods 
	public Juego() {
		pokemon= new Pokemon[200];
	}


	public Pokemon[] getPokemon() {
		return pokemon;
	}

	public boolean addPokemon(int numero, String nombre, int nivel, int evolucion, int almacenamiento, int intensidad,boolean fueraAgua) {
		
		boolean pokemonCreado=false;
		
		int position=posicionValida();
		
			if(position!=-1)
			{
			pokemonCreado=true;
			
			pokemon[position]=new Water(numero,nombre,nivel,evolucion,almacenamiento,intensidad,fueraAgua);
			}
			
		return pokemonCreado;
			
	}
	
	public boolean addPokemon(int numero, String nombre, int nivel, int evolucion, int firePower, int fireIntense) {
		
	boolean pokemonCreado=false;
	
	int position=posicionValida();
	
		if(position!=-1)
		{
		pokemonCreado=true;
		
		pokemon[position]=new Fire(numero,nombre,nivel,evolucion,firePower,fireIntense);	
		
		}
		
	return pokemonCreado;
	}

	public boolean addPokemon(int numero, String nombre, int nivel, int evolucion, int profundidad) {
	
	boolean pokemonCreado=false;
	int position=posicionValida();
	
		if(position!=-1)
		{
			pokemonCreado=true;
			
			pokemon[position]=new Earth(numero,nombre,nivel,evolucion,profundidad);
			
			}
			
		return pokemonCreado;
}
	
	public int posicionValida() {
		
	int posicion=-1;
	boolean pValida=false;
	
		for(int i=0; i<pokemon.length && pValida==false; i++) {
			
			if(pokemon[i]==null) {
				pValida=true;
				posicion=i;
				}
			}	
	return posicion;
}
	
	public int[] numPokemon() {
		int numPokemon[]={0,0,0};
		
		for(int i=0; i<pokemon.length;i++) {
			if(pokemon[i]!=null) {
				if(pokemon[i] instanceof Water) {
					numPokemon[0]+=1;
				}
				
				if(pokemon[i] instanceof Fire) {
					numPokemon[1]+=1;
				}
				
				if(pokemon[i] instanceof Earth) {
					numPokemon[2]+=1;
				}
			}
		}
		return numPokemon;
	}
	
	public int cantidadPokemonesWaterOut() {
		
		int cantidad=0;
		
		for(int i=0; i<pokemon.length;i++) {
			if(pokemon[i]!=null) {
				if(pokemon[i] instanceof Water) {
					if (((Water)pokemon[i]).isFueraAgua()==true)
					cantidad+=1;
				}
			}
		}
		return cantidad;
	}
	
	public String mostrarPokemonW() {

		String infoW= "";
		
		for(int i=0; i<pokemon.length;i++) {
			if(pokemon[i]!=null) {
				
			if(pokemon[i] instanceof Water) {
				
			infoW+="\n" + ((Water)pokemon[i]).toString();
			
			}
		}
	}
	return infoW;
}

	public String mostrarPokemonF() {
		
		String infoF= "";
		
		for(int i=0; i<pokemon.length;i++) {
			if(pokemon[i]!=null) {
				
			if(pokemon[i] instanceof Fire) {
				
			infoF+="\n" + ((Fire)pokemon[i]).toString();
			
			}
		}
	}
	return infoF;
}
	
	public String mostrarPokemonE() {

		String infoE= "";
		
		for(int i=0; i<pokemon.length;i++) {
			if(pokemon[i]!=null) {
				
			if(pokemon[i] instanceof Earth) {
				
			infoE+="\n" + ((Earth)pokemon[i]).toString();
			
			}
		}
	}
	return infoE;
}
	public String mostrarTodo() {
		String infoW=mostrarPokemonW();
		String infoF=mostrarPokemonF();
		String infoE=mostrarPokemonE();
		
		return "Pokemones de Agua" + infoW + "\nPokemones de Fuego" + infoF + "\nPokemones de Tierra" +infoE;
	
	}
	
	public int totalVida() {
		
		int vidaTotal=0;
		
		for(int i=0; i<pokemon.length; i++){
			
		if(pokemon[i]!=null){
			
			vidaTotal+=pokemon[i].getHealth();
			
			}
		}
			return vidaTotal;
		}
	
}

	
