package nodoV2.negocio;

import nodoV2.modelo.Nodo;

public class GestorNodo {

    private Nodo head;
    public void insertarInicio(int valor){
        Nodo nuevo = new Nodo(valor,head);
        head = nuevo;
    }
    public void insertarFinal(int valor){
        Nodo nuevo = new Nodo(valor,null);
        if(head == null){
            head = nuevo;
        }
        else{
            Nodo actual = head;
            while(actual.getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }
    public void mostrarTodos(){
        Nodo actual = head;
        while(actual != null){
            if(actual.getSiguiente() == null){
                System.out.print("|"+actual.getNumero()+"|"+ " --> null");
            }else{
                System.out.print("|"+actual.getNumero()+"|"+ " -->");
            }
            actual = actual.getSiguiente();
        }
    }
    public boolean eliminar(int valor){
        if(head == null){
            return false;
        }
        if(head.getNumero() == valor){
            head  = head.getSiguiente();
        }
        Nodo anterior = head;
        Nodo actual = head.getSiguiente();
        while(actual != null){
            if(actual.getNumero() == valor){
                anterior.setSiguiente(actual.getSiguiente());
                return true;
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }
        return false;
    }
    public boolean buscar(int valor){
        Nodo actual = head;
        while(actual != null){
            if(actual.getNumero() == valor){
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }
}
//Comentario
