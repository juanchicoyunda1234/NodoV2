package nodoV2.modelo;

public class Nodo {
    private int numero ;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(int numero, Nodo siguiente) {
        this.numero = numero;
        this.siguiente = siguiente;
        this.anterior = null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
