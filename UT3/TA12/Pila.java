package UT3.TA12;

public class Pila<T> {

    private Lista<T> lista;

    public Pila() {
        lista = new Lista<T>();
    }
    
    public void push(Nodo<T> unNodo) {
        lista.insertarAlPrincipio(unNodo);
    }

    public Nodo<T> pop() {
        return lista.eliminarPrimero();
    }

    public boolean esVacia() {
        return lista.esVacia();
    }

    public T topeDato() {
        return lista.getPrimero().getDato();
    }

    public Comparable topeEtiqueta() {
        return lista.getPrimero().getEtiqueta();
    }

    public void anula() {
        //lista.setPrimero(null);
        lista = new Lista<T>();
    }

}