package Practica4;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class listas {
	List<String>nombre = new ArrayList<>();
	List<String>nacionalidad = new ArrayList<>();
	List<Double>tiempo = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	String a, b, c;
	double d,suma=0;
	int tamaño;
	int soliCamp, borrar;
	public void insertarDatos() {
		System.out.println("Ingrese la cantidad de Atletas que va a ingresar: ");
		tamaño = scan.nextInt();
		for (int i = 0;i<tamaño;i++) {
		System.out.println("Ingrese los datos del Atleta "+(i+1)+" : ");
		System.out.println("Nombre: ");
		a = scan.next();
		nombre.add(a);
		System.out.println("Nacionalidad: ");
		b = scan.next();
		nacionalidad.add(b);
		System.out.println("Tiempo: ");
		d = scan.nextDouble();
		tiempo.add(d);
		System.out.println("=============================");
		}
		System.out.println("El jugador/es han sido agregados correctamente");
	}
	
	public void mostrarDatosPorName() {
		System.out.println("Ingrese el dato del jugador que desea: ");
		soliCamp = scan.nextInt();
		System.out.print("Nombre: "+nombre.get(soliCamp-1));
		System.out.println("");
		System.out.print("Nacionalidad: "+nacionalidad.get(soliCamp-1));
		System.out.println("");
		System.out.print("Tiempo: "+tiempo.get(soliCamp-1));
		System.out.println("");
	}
	
	public void AtletasPais() {
	    System.out.println("Ingrese la nacionalidad para buscar los jugadores: ");
	    c = scan.next();
	    System.out.println("Los siguientes son los jugadores que tienen la nacionalidad " + c + " : ");
	    boolean found = false;
	    for (int j = 0; j < nombre.size(); j++) {
	        if (nacionalidad.get(j).equals(c)) {
	            System.out.print("Nombre: " + nombre.get(j));
	            System.out.println("");
	            System.out.print("Nacionalidad: " + nacionalidad.get(j));
	            System.out.println("");
	            System.out.print("Tiempo: " + tiempo.get(j));
	            System.out.println("");
	            System.out.println("=============================");
	            found = true;
	        }
	    }
	    if (!found) {
	        System.out.println("No existen o no se ingresó correctamente la nacionalidad");
	    }
	}
	
	public void promTiempo() {
		System.out.print("El tiempo promedio de todos los atletas es de: ");
		for(int k=0;k<tamaño;k++) {
			suma += tiempo.get(k); 
		}
		suma = (suma/tamaño);
		System.out.println(suma);
	}
	
	public void Borrar() {
		System.out.println("Ingrese el dato del jugador que desea eliminar: ");
		borrar = scan.nextInt();
		System.out.print("Nombre: "+nombre.remove(borrar-1));
		System.out.println("");
		System.out.print("Nacionalidad: "+nacionalidad.remove(borrar-1));
		System.out.println("");
		System.out.print("Tiempo: "+tiempo.remove(borrar-1));
		System.out.println("");
		System.out.println("Ha sido eliminado");
	}
	
	public void mostrarTodo() {
		System.out.println("La lista de los jugadores es: ");
		for(int l = 0;l<nombre.size();l++) {
			System.out.print("Nombre: "+nombre.get(l));
			System.out.println("");
			System.out.print("Nacionalidad: "+nacionalidad.get(l));
			System.out.println("");
			System.out.print("Tiempo: "+tiempo.get(l));
			System.out.println("");
			System.out.println("=============================");
		}
	}
}
