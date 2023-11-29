package Practica4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		listas list = new listas();
		Scanner scan = new Scanner(System.in);
		int opc;
		System.out.println("===Menu de opciones===");
		System.out.println("1.Registrar atleta");
		System.out.println("2.Datos Campeon");
		System.out.println("3.Atletas por pais");
		System.out.println("4.Tiempo promedio de todos los atletas");
		System.out.println("5.Eliminar atleta");
		System.out.println("6.Lista completa de los atletas");
		System.out.println("7.Salir");
		opc = scan.nextInt();
		while(opc!=7) {
			switch (opc) {
			    case 1:
			    	list.insertarDatos();
			    	break;
			    case 2:
			    	list.mostrarDatosPorName();
			    	break;
			    case 3:
			    	list.AtletasPais();
			    	break;
			    case 4:
			    	list.promTiempo();
			    	break;
			    case 5:
			    	list.Borrar();
			    	break;
			    case 6:
			    	list.mostrarTodo();
			    default:
			    	System.out.println("Opcion no valida");
			    	break;
			}
			System.out.println("===Menu de opciones===");
			System.out.println("1.Registrar atleta");
			System.out.println("2.Datos Campeon");
			System.out.println("3.Atletas por pais");
			System.out.println("4.Tiempo promedio de todos los atletas");
			System.out.println("5.Eliminar atleta");
			System.out.println("6.Lista completa de los atletas");
			System.out.println("7.Salir");
			opc = scan.nextInt();
		}
		System.out.println("Gracias por entrar");
	}
}
