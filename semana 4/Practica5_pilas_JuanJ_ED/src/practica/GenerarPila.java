package practica;
import java.util.Scanner;
public class GenerarPila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pilas miPila = new Pilas();//Crear una instancia de la pila
		//Operaciones basicas de la pila
		Scanner scan = new Scanner(System.in);
		int opc,cant,dato;
		System.out.println("===Menu de Opciones===");
		System.out.println("1. Ingresar datos");
		System.out.println("2.Mostrar datos");
		System.out.println("3.Verificar que este vacia o esta llena");
		System.out.println("4.Mostrar cuantos datos tiene");
		System.out.println("5.Eliminar datos");
		System.out.println("6.Salir");
		opc = scan.nextInt();
		while(opc !=6) {
			switch(opc) {
			case 1:
				System.out.println("Ingresa la cantidad de datos que desees ingresar");
				cant = scan.nextInt();
				for (int i=0;i<cant;i++) {
					System.out.println("Ingrese el dato de la pila N° "+(i+1)+" :");
					dato = scan.nextInt();
					miPila.push(dato);
				}
				System.out.println("Los datos han sido ingresados correctamente");
				break;
			case 2:
				miPila.mostrarPila();
				break;
			case 3:
				System.out.println("Verificando si la lista esta vacia: ");
				if(miPila.tamaño!=0) {
					System.out.println("Lista tiene datos dentro");
				}else {
					System.out.println("La pila esta vacia");
				}
				break;
			case 4:
				System.out.println("El tamaño de la pila es de: "+miPila.tamaño);
				break;
			case 5:
				miPila.eliminarPila();
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
			System.out.println("===Menu de Opciones===");
			System.out.println("1. Ingresar datos");
			System.out.println("2.Mostrar datos");
			System.out.println("3.Verificar que este vacia o esta llena");
			System.out.println("4.Mostrar cuantos datos tiene");
			System.out.println("5.Salir");
			opc = scan.nextInt();
		}
		System.out.println("Gracias por ingresar");
	}

}
