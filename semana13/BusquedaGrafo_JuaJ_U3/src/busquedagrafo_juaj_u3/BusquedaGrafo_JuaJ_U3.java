
package busquedagrafo_juaj_u3;

import java.util.Scanner;

public class BusquedaGrafo_JuaJ_U3 {

    public static void main(String[] args) {
        // TODO code application logic here
        int cant = 0;
        int cantAri;
        int origen;
        int fin;
        int peso;
        Grafo grafo = new Grafo(cant);
        Scanner scan = new Scanner(System.in);
        int opc;
        System.out.println("=======Menu de Opciones======");
        System.out.println("1.Ingresar Vertices");
        System.out.println("2.Ingresar Aristas");
        System.out.println("3.Realizar busqueda");
        System.out.println("4.Mostrar Matriz de adyacencia");
        System.out.println("0.Salir");
        opc = scan.nextInt();
        while (opc!=0){
            switch(opc){
                case 1:
                    System.out.println("Ingrese la cantidad de vertices que desea: ");
                    cant = scan.nextInt();
                    break;
                case 2:
                    if(cant==0){
                        System.out.println("No hay valores en el grafo");
                    }else{
                        System.out.println("Ingrese la cantidad de aristas que desea: ");
                        cantAri = scan.nextInt();
                        for(int i=0;i<cantAri;i++){
                            System.out.println("Ingrese el origen de la arista: ");
                            origen = scan.nextInt();
                            System.out.println("Ingrese el final de la arista: ");
                            fin = scan.nextInt();
                            System.out.println("Ingrese el peso de la arista: ");
                            peso = scan.nextInt();
                            grafo.agregarArista(origen, fin, peso);
                        }
                    }
                    break;
                case 3:
                    if(cant==0){
                        System.out.println("No hay valores en el grafo");
                    }else{
                        System.out.println("Origen papel del 0 al 4: "+grafo.dijkstra(0, 4));
                        System.out.println("Peso total de recorrido: "+grafo.sumaPesosAristas(grafo.dijkstra(0, 4)));
                    }
                    break;
                case 4:
                    if(cant==0){
                        System.out.println("No hay valores en el grafo");
                    }else{
                        grafo.mostrarMatrizAdyacencia();
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        System.out.println("=======Menu de Opciones======");
        System.out.println("1.Ingresar Vertices");
        System.out.println("2.Ingresar Aristas");
        System.out.println("3.Realizar busqueda");
        System.out.println("4.Mostrar Matriz de adyacencia");
        System.out.println("0.Salir");
        opc = scan.nextInt();
        }
        System.out.println("Gracias por ingresar");
    }
}
