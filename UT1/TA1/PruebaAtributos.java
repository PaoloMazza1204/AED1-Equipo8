package TA1;

// Ejercicio 1
public class PruebaAtributos {
    /*public String atributo1 = "";
    public int atributo2 = ""; // Mal: No se puede convertir de String a int
    public String atributo3 = 4; // Mal: No se puede convertir de int a String
    public float atributo4 = ""; // Mal: No se puede convertir de String a float
    public int 5atributo = 4; // Mal: No se puede iniciar el nombre de un atributo con un número*/

    public int atributo1; // 0
    public String atributo2; // null
    public float atributo3; // 0.0

    public static void main(String[] args) {
        PruebaAtributos obj = new PruebaAtributos();
        System.out.println(obj.atributo1);
        System.out.println(obj.atributo2);
        System.out.println(obj.atributo3);
        int variable;
        String variable2;
        float variable3;
        // System.out.println(variable);
        // System.out.println(variable2);  La variable no está inicializada (error)
        // System.out.println(variable3);

    }
}

// Ejercicio 2
class ArithmeticDemo {
    public static void main (String[] args){

        // Parte 1
        int result = 1 + 2; // result is now 3
        System.out.println(result);
        // result = result - 1; // result is now 2
        result -= 1;
        System.out.println(result);
        // result = result * 2; // result is now 4
        result *= 2;
        System.out.println(result);
        //result = result / 2; // result is now 2
        result /= 2;
        System.out.println(result);
        //result = result + 8; // result is now 10
        result += 8;
        //result = result % 7; // result is now 3
        result %= 7;
        System.out.println(result);

        // Parte 2
        int a = 5;
        int i = 3;
        a += ++i; // a = a + 4 = 5 + 4 = 9
        System.out.println(a);
    }
}

        // Parte 3
class PrePostDemo {
    public static void main(String[] args){
        int i = 3; // asignación i vale 3
        i++; // incremento en 1
        System.out.println(i); // se imprime por pantalla "4"
        ++i;
        System.out.println(i); // se imprime por pantalla "5"
        System.out.println(++i); // se incrementa el valor y se imprime por pantalla "6"
        System.out.println(i++); // se imprime por pantalla "6" y luego se incrementa el valor
        System.out.println(i); // se imprime por pantalla el valor de "7"
    }
}

/* Ejercicio 3

1. aValue = 8933.234; (b)
2. aValue++; (a)
3. System.out.println("Hello World!"); (d)
4. Bicycle myBike = new Bicycle(); (c)


a) Incremento
b) Asignación
c) Creación de objeto
d) Invocación de método

*/

/* Ejercicio 4

Parte a) "second string" 
         "third string"

parte b) Flujo: Se entra al primer if (ya que 3 >= 0), luego se entra al else (porque 3 != 0), dentro del else se ejecuta
la sentencia que imprime "second string en pantalla", luego se continua con el bloque del primer if, ejecutando la 
sentencia que imprime "third string" en pantalla.
*/
class Ejercicio4 {
    public static void main(String[] args) {
        int aNumber = 3;
        if (aNumber >= 0) {
            if (aNumber == 0) {
                System.out.println("first string");
            }
            else {
                System.out.println("second string");
            }
        System.out.println("third string");
        }
    }
}
