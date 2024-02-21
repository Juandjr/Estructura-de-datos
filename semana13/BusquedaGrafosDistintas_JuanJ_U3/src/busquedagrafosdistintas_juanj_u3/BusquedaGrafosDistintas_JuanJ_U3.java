
package busquedagrafosdistintas_juanj_u3;

import java.util.List;

public class BusquedaGrafosDistintas_JuanJ_U3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Grafo grafo = new Grafo();
        grafo.obtenerOcrearNodo("A");
        grafo.obtenerOcrearNodo("B");
        grafo.obtenerOcrearNodo("C");
        grafo.obtenerOcrearNodo("D");
        grafo.obtenerOcrearNodo("E");
        grafo.obtenerOcrearNodo("F");
        grafo.obtenerOcrearNodo("G");
        
        grafo.agregarArista("A", "B");
        grafo.agregarArista("A", "C");
        grafo.agregarArista("B", "D");
        grafo.agregarArista("C", "E");
        grafo.agregarArista("D", "F");
        grafo.agregarArista("E", "G");
        grafo.agregarArista("F", "G");
        
        NodoGrafo nodoGrafo = new NodoGrafo("A");
        NodoGrafo nodoGrafo1 = new NodoGrafo("B");
        NodoGrafo nodoGrafo2 = new NodoGrafo("C");
        NodoGrafo nodoGrafo3 = new NodoGrafo("D");
        NodoGrafo nodoGrafo4 = new NodoGrafo("E");
        NodoGrafo nodoGrafo5 = new NodoGrafo("F");
        NodoGrafo nodoGrafo6 = new NodoGrafo("G");
        nodoGrafo.agregarVecino(nodoGrafo1);
        nodoGrafo.agregarVecino(nodoGrafo2);
        nodoGrafo1.agregarVecino(nodoGrafo3);
        nodoGrafo2.agregarVecino(nodoGrafo4);
        nodoGrafo3.agregarVecino(nodoGrafo5);
        nodoGrafo4.agregarVecino(nodoGrafo6);
        nodoGrafo5.agregarVecino(nodoGrafo6);
        
        busquedaEnProfundidad busqueda = new busquedaEnProfundidad(grafo,"B");
        busqueda.
        
    }
    
}
