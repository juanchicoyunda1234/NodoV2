package nodoV2.app;

import nodoV2.modelo.Nodo;
import nodoV2.negocio.GestorNodo;

public class Main {
    public static void main(String[] args) {
        GestorNodo gestor = new GestorNodo();

        //Insertar al inicio
        gestor.insertarInicio(10);
        gestor.insertarInicio(20);
        gestor.insertarInicio(30);

        // Mostrar todos

        gestor.insertarFinal(40);
        gestor.insertarFinal(50);
        System.out.println("Antes de eliminar");
        gestor.mostrarTodos();
        //Eliminemos
        System.out.println("\nDespues de eliminar");
        gestor.eliminar(20);
        gestor.mostrarTodos();
        //Busqueda
        System.out.println("\nExiste el 30 : "+gestor.buscar(30));



    }
}
