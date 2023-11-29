package practica;

public class Nodo {
	int valor;//Datos almacenados en el nodo
	Nodo siguiente;//Referecia al siguiente nodo en la pila 
	
	//Constructor de la clase Nodo
	public Nodo(int valor) {
		this.valor = valor;
		this.siguiente = null;//apunta afuera al vacio
	}
}
