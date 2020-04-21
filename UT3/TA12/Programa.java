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

        System.out.println(miPila.esVacia());

        System.out.println(miPila.topeDato());
        System.out.println(miPila.topeEtiqueta());

        miPila.anula();
        System.out.println(miPila.esVacia());


        // Cola
        System.out.println("Pruebas de cola");
        Cola<Integer> miCola = new Cola<>();

        Nodo<Integer> nodo1_ = new Nodo<>(1,1);
        Nodo<Integer> nodo2_ = new Nodo<>(2,2);
        Nodo<Integer> nodo3_ = new Nodo<>(3,3);
        Nodo<Integer> nodo4_ = new Nodo<>(4,4);

        System.out.println(miCola.esVacia()); // true

        miCola.agregar(nodo1_);
        miCola.agregar(nodo2_);
        miCola.agregar(nodo3_);
        miCola.agregar(nodo4_);

        System.out.println(miCola.esVacia()); // false
        System.out.println(miCola.frenteEtiqueta()); // 1
        miCola.quitar();
        System.out.println(miCola.frenteEtiqueta()); // 2

        miCola.anular();
        System.out.println(miCola.esVacia()); // true
    }
}