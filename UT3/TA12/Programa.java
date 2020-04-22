package UT3.TA12;

public class Programa {
    public static void main(String[] args) {
        Pila<Integer> miPila = new Pila<>();

        Nodo<Integer> nodo1 = new Nodo<>(1,1);
        Nodo<Integer> nodo2 = new Nodo<>(2,2);
        Nodo<Integer> nodo3 = new Nodo<>(3,3);
        Nodo<Integer> nodo4 = new Nodo<>(4,4);

        miPila.push(nodo1);
        miPila.push(nodo2);
        miPila.push(nodo3);
        miPila.push(nodo4);

        System.out.println(miPila.esVacia());

        System.out.println(miPila.topeDato());
        System.out.println(miPila.topeEtiqueta());

        miPila.anula();
        System.out.println(miPila.esVacia());
    }
}