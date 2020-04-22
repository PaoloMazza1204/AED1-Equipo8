package UT3.TA12;

public class Programa {
    public static void main(String[] args) {

        // Pila
        System.out.println("Pruebas de pila");
        Pila<Integer> miPila = new Pila<>();

        Nodo<Integer> nodo1 = new Nodo<>(1,1);
        Nodo<Integer> nodo2 = new Nodo<>(2,2);
        Nodo<Integer> nodo3 = new Nodo<>(3,3);
        Nodo<Integer> nodo4 = new Nodo<>(4,4);

        miPila.push(nodo1);
        miPila.push(nodo2);
        miPila.push(nodo3);
        miPila.push(nodo4);

        System.out.println("Pila de 4 elementos es vacía? " + miPila.esVacia());

        System.out.println("tope debería ser 4, tope: " + miPila.topeDato());
        System.out.println("Etiqueta del tope debería ser 4, tope: " +
                            miPila.topeEtiqueta());

        miPila.anula();
        System.out.println("Vaciamos la pila.");
        System.out.println("Pila vacía luego de vaciarla? " + miPila.esVacia());


        // Cola
        System.out.println('\n' + "Pruebas de cola");
        Cola<Integer> cola = new Cola<>();

        Nodo<Integer> nodo1_ = new Nodo<>(1,1);
        Nodo<Integer> nodo2_ = new Nodo<>(2,2);
        Nodo<Integer> nodo3_ = new Nodo<>(3,3);
        Nodo<Integer> nodo4_ = new Nodo<>(4,4);

        System.out.println("Cola vacía es vacía? " + cola.esVacia());

        cola.agregar(nodo1_);
        cola.agregar(nodo2_);
        cola.agregar(nodo3_);
        cola.agregar(nodo4_);

        System.out.println("Cola de 4 elementos es vacía? " + cola.esVacia());
        System.out.println("Primer elemento debería ser 1 y es " + cola.frenteEtiqueta());
        cola.quitar();
        System.out.println("Quitamos un elemento");
        System.out.println("Primer elemento debería ser 2 y es " + cola.frenteEtiqueta());

        cola.anular();
        System.out.println("Anulamos la cola");
        System.out.println("Cola vacía es vacía? " + cola.esVacia());
    }
}