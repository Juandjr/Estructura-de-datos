package practica;

public class Pilas {
	int tamaño;//tamaño de la pila
	Nodo tope;//Nodo en la cima de la pila
	public Pilas() {
		this.tamaño=0;
		this.tope=null;
	}
	//metodo para insertar un elemento en la pila(push)
	public void push(int valor) {
		Nodo nodo = new Nodo(valor);//Crear un nuevo nodo con el dato
		nodo.siguiente=tope;//El siguiente del nuevo nodo es la cima actual
		tope = nodo; //El nuevo nodo se convierte en la cima
		tamaño++;
	}
	public int pop() {//metodo para eliminar y devolver el elemento de la cima de la pila(pop)
		if(tamaño>0) {
			int returnValue = tope.valor;//Obtener el dato en la cima
			tope = tope.siguiente; //Mover la cima al siguiente nodo
			tamaño--;
			return returnValue;
		}else {
			return -1;//Valor predeterminado para indicar un error
		}
	}
	
	public void mostrarPila() {
		
		System.out.println("Los datos se presentaran a continuacion: ");
		for(int j=0;j<tamaño;j++) {
			int waza = tope.valor;
			System.out.println(waza);
			tope = tope.siguiente;
		}
	}
	
	public int eliminarPila() {
			if(tamaño>0) {
				int returnValue = tope.valor;//Obtener el dato en la cima
				tope = tope.siguiente; //Mover la cima al siguiente nodo
				tamaño--;
				 return returnValue;
			}else {
				return -1;//Valor predeterminado para indicar un error
			}
			System.out.println("Se han eliminado los datos");
		}
	}
