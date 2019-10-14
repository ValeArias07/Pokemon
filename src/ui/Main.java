import model.Juego;
import java.util.Scanner;

public class Main
{
	
private Scanner lectorN;
private Scanner lectorS;
private Juego juego;

public Main(){
	
	lectorN= new Scanner (System.in);
	lectorS= new Scanner (System.in);
	juego= new Juego();
}

public static void main (String args []){

	Main main=new Main();
	
	main.menu();

}
public void registrarAgua(){
	System.out.println("Inserta todos los siguientes datos para tu pokemon");
		
		System.out.println("Inserta el nombre");
			String nombre=lectorS.nextLine();
		System.out.println("inserta el numero(Codigo)");
			int numero=lectorN.nextInt();
		System.out.println("Inserta el nivel");
			int nivel=lectorN.nextInt();
		System.out.println("Inserta la evolucion");
			int evolucion=lectorN.nextInt();
	
	boolean fueraAgua=false;
	System.out.println("Inserta la capacidad del almacenamiento");
	int almacenamiento=lectorN.nextInt();
				
	System.out.println("Inserta la intensidad de chorro");
	int intensidad=lectorN.nextInt();
				
	System.out.println("El pokemon vive fuera del agua?");
	String res=lectorS.nextLine();
		if(res.equals("si")){
			fueraAgua=true;
			}
			else
				if(res.equals("no")){
				fueraAgua=false;
					}
					
				boolean confirmacion1=juego.addPokemon(numero,nombre,nivel,evolucion,almacenamiento,intensidad,fueraAgua);
					if(confirmacion1==true){
						System.out.println("Pokemon añadido exitosamente");
					}
					else
						if(confirmacion1==false){
						System.out.println("Error. Pokemon no pudo ser añadido");
					}	
	}
	

public void registrarFuego(){
	System.out.println("Inserta todos los siguientes datos para tu pokemon");
		
		System.out.println("Inserta el nombre");
			String nombre=lectorS.nextLine();
		System.out.println("inserta el numero(Codigo)");
			int numero=lectorN.nextInt();
		System.out.println("Inserta el nivel");
			int nivel=lectorN.nextInt();
		System.out.println("Inserta la evolucion");
			int evolucion=lectorN.nextInt();
			
	boolean flying=false;
		System.out.println("Inserta el poder del fuego");
		int firePower=lectorN.nextInt();
		
		System.out.println("Inserta la intensidad del fuego");
		int fireIntense=lectorN.nextInt();
		
		boolean confirmacion2=juego.addPokemon(numero,nombre,nivel,evolucion,firePower,fireIntense,flying);
		
		if(confirmacion2==true){
				System.out.println("Pokemon añadido exitosamente");
		}
			else
				if(confirmacion2==false){
				System.out.println("Error. Pokemon no pudo ser añadido");
			}
}

public void registrarTierra(){
	
	System.out.println("Inserta todos los siguientes datos para tu pokemon");
		
		System.out.println("Inserta el nombre");
			String nombre=lectorS.nextLine();
		System.out.println("inserta el numero(Codigo)");
			int numero=lectorN.nextInt();
		System.out.println("Inserta el nivel");
			int nivel=lectorN.nextInt();
		System.out.println("Inserta la evolucion");
			int evolucion=lectorN.nextInt();
	
System.out.println("Inserta la profundidad");
		int profundidad=lectorN.nextInt();
		
		boolean confirmacion3=juego.addPokemon(numero,nombre,nivel,evolucion,profundidad);
		
		if(confirmacion3==true){
				System.out.println("Pokemon añadido exitosamente");
		}
			else
				if(confirmacion3==false){
				System.out.println("Error. Pokemon no pudo ser añadido");
			}
}
public void menu(){

	int option=0;

	while(option!=6){
	System.out.println("Bienvenido a la Pokedex. Selecciona la opcion a la que quieres acceder. \n 1. Añadir pokemon \n 2. Contar numero de pokemones registrados \n 3. Mostrar los pokemones registrados de cada tipo \n 4. Mostrar la vida total \n 5. Contar los pokemones de agua que estan afuera \n 6. Salir ");
	option=lectorN.nextInt();
	
	switch(option)
	{
		case(1):
		
		System.out.println("Inserta el tipo de Pokemon (Agua, fuego o tierra)");
			String tipo=lectorS.nextLine();
			
			if(tipo.equals("agua")){
				registrarAgua();
			}
			
			else
				if(tipo.equals("fuego")){	
				registrarFuego();
				
			}
			else
				if(tipo.equals("earth")){	
				registrarTierra();
			}
			
		break;
		
		case(2):
		
		int numPoke[]=juego.numPokemon();
		
		System.out.println("El numero total de pokemones Agua : "+ numPoke[0]);
		System.out.println("El numero total de pokemones Fuego : "+ numPoke[1]);
		System.out.println("El numero total de pokemones Tierra: "+ numPoke[2]);
		
		break;
		
		case(3):
		
		System.out.println(juego.mostrarTodo());
		
		break;
		
		case(4):
		int numVida=juego.totalVida();
		System.out.println("La vida total de todos los pokemones es " + numVida);
		
		break;
		
		case(5):
		int numFuera=juego.cantidadPokemonesWaterOut();
		System.out.println("El numero de pokemones que pueden vivir fuera del agua son:  " + numFuera);
		break;
			}
		}
	}
}
