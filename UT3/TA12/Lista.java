package UT3.TA12;

public class Lista<T> implements ILista<T> {

    private Nodo<T> primero;

    /**
     * Total de comparaciones realizadas al incorporar nodos.
     */
    private int comparaciones = 0;

    /**
     * Total de movimientos realizados al incorporar nodos.
     */
    private int movimientos = 0;

    public Lista() {
        primero = null;
    }


    @Override
    public void insertar(Nodo<T> unNodo) {
        movimientos += 1;
        if (esVacia()) {
            primero = unNodo;
        } else {
            Nodo<T> aux = primero;
            comparaciones += 1;
            while (aux.getSiguiente() != null) {
                comparaciones += 1;
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(unNodo);
        }
    }

    public void insertarAlPrincipio(Nodo<T> unNodo) {
        if (esVacia()) {
            primero = unNodo;
        } else {
            Nodo<T> aux = primero;
            primero = unNodo;
            primero.setSiguiente(aux);
        }
    }

    @Override
    public Nodo<T> buscar(Comparable clave) {
        if (esVacia()) {
            return null;
        } else {
            Nodo<T> aux = primero;
            while (aux != null) {
                if (aux.getEtiqueta().equals(clave)) {
                    return aux;
                }
                aux = aux.getSiguiente();
            }
        }
        return null;
    }

    public Nodo<T> eliminarPrimero() {
        if (esVacia()) {
            return null;
        }
        Nodo<T> aux = primero;
        setPrimero(primero.getSiguiente());
        return aux.clonar();
    }

    @Override
    public boolean eliminar(Comparable clave) {
        if (esVacia()) {
            return false;
        }
        if (primero.getSiguiente() == null) {
            if (primero.getEtiqueta().equals(clave)) {
                primero = null;
                return true;
            }
        }
        Nodo<T> aux = primero;
        if (aux.getEtiqueta().compareTo(clave) == 0) {
            //Eliminamos el primer elemento
            Nodo<T> temp1 = aux;
            Nodo<T> temp = aux.getSiguiente();
            primero = temp;
            return true;
        }
        while (aux.getSiguiente() != null) {
            if (aux.getSiguiente().getEtiqueta().equals(clave)) {
                Nodo<T> temp = aux.getSiguiente();
                aux.setSiguiente(temp.getSiguiente());
                return true;

            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    @Override
    public String imprimir() {
        String aux = "";
        if (!esVacia()) {
            Nodo<T> temp = primero;
            while (temp != null) {
                temp.imprimirEtiqueta();
                temp = temp.getSiguiente();
            }
        }
        return aux;
    }

    public String imprimir(String separador) {
        String aux = "";
        if (esVacia()) {
            return "";
        } else {
            Nodo<T> temp = primero;
            aux = "" + temp.getEtiqueta();
            while (temp.getSiguiente() != null) {
                aux = aux + separador + temp.getSiguiente().getEtiqueta();
                temp = temp.getSiguiente();
            }

        }
        return aux;

    }

    @Override
    public int cantElementos() {
        int contador = 0;
        if (esVacia()) {
            System.out.println("Cantidad de elementos 0.");
            return 0;
        } else {
            INodo aux = primero;
            while (aux != null) {
                contador++;
                aux = aux.getSiguiente();
            }
        }
        return contador;
    }

    @Override
    public boolean esVacia() {
        comparaciones += 1;
        return primero == null;
    }

    public Nodo<T> getPrimero() {
        return primero;
    }

    @Override
    public void setPrimero(Nodo<T> unNodo) {
        this.primero = unNodo;
    }

        /**
     * Devuelve la cantidad de comparaciones al incorporar nodos.
     * @return
     */
    public int getComparaciones() {
        return comparaciones;
    }

    /**
     * Establece la cantidad de comparaciones al incorporar nodos.
     * @return
     */
    public void setComparaciones(int nuevasComp) {
        comparaciones = nuevasComp;
    }

    /**
     * Devuelve la cantidad de movimientos al incorporar nodos.
     * @return
     */
    public int getMovimientos() {
        return movimientos;
    }

    /**
     * Establece la cantidad de movimientos al incorporar nodos.
     * @return
     */
    public void setMovimientos(int nuevosMov) {
        movimientos = nuevosMov;
    }
}
