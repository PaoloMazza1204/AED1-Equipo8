package UT3.TA12;


public class Cola<T> implements ICola<T> {

    private Lista<T> lista;

    public Cola() {
        lista = new Lista<T>();
    }

    public boolean esVacia() {
        return lista.esVacia();
    }

    public void agregar(Nodo<T> nodo) {
        lista.insertar(nodo);
    }

    public Nodo<T> quitar() {
        return lista.eliminarPrimero();
    }

    public void anular() {
        lista = new Lista<T>();
    }

    public T frenteDato() {
        return lista.getPrimero().getDato();
    }

    public Comparable frenteEtiqueta() {
        return lista.getPrimero().getEtiqueta();
    }
}