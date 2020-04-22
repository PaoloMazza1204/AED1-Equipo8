package UT3.TA12;

public interface IPila<T> {
    
    public void push(Nodo<T> unNodo);

    public Nodo<T> pop();

    public boolean esVacia();

    public T topeDato();

    public Comparable topeEtiqueta();
    
    public void anula();

}