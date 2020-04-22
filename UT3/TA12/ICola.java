package UT3.TA12;

public interface ICola<T> {

    public boolean esVacia();

    public void agregar(Nodo<T> nodo);
    
    public Nodo<T> quitar();

    public void anular();

    public T frenteDato();

    public Comparable frenteEtiqueta();
}
