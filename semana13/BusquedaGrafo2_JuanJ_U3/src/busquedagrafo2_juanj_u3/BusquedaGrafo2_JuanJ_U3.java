
package busquedagrafo2_juanj_u3;


public class BusquedaGrafo2_JuanJ_U3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Grafo grafo = new Grafo(6);
        grafo.agregarArista(0, 1, 7);
        grafo.agregarArista(0, 2, 1);
        grafo.agregarArista(0, 3, 6);
        grafo.agregarArista(1, 3, 2);
        grafo.agregarArista(1, 5, 2);
        grafo.agregarArista(2, 3, 2);
        grafo.agregarArista(2, 4, 5);
        grafo.agregarArista(3, 4, 3);
        grafo.agregarArista(3, 5, 4);
        grafo.agregarArista(4, 5, 2);
        
        System.out.println("Origen papel del 0 al 5: "+grafo.dijkstra(0, 5));
        System.out.println("Peso total de recorrido: "+grafo.sumaPesosAristas(grafo.dijkstra(0, 5)));
        grafo.mostrarMatrizAdyacencia();
    }
    
}
