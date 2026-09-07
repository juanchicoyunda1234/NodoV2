package nodoV2.modelo;

public class Nodo {
    private int numero ;
    private Nodo siguiente;

    public Nodo(int numero, Nodo siguiente) {
        this.numero = numero;
        this.siguiente = siguiente;
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
