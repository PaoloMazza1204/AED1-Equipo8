package TA2;

public class UtilMath {

    // Ejercicio 1
    public static int factorial(int num) {               // Subequipo B: No se proponen cambios.
        int resultado = 1;
        for(; num > 1; num--) { 
            resultado *= num;
        }
        return resultado;
    }

    // Ejercicio 2

    // Subrutina de public static long sumatoria(long n)
    public static boolean isPrime(long n) {              // Subequipo A: No se proponen cambios.
        boolean prime = true;

        int i = 3;
        while(i <= Math.sqrt(n)) { //(long i = 3; i <= Math.sqrt(n); i += 2)
            if (n % i == 0) {
                prime = false;
                break;
            }
            i += 2;
        }
        if((n%2 != 0 && prime && n > 2) || n == 2) {
            return true;
        }  
        else {
            return false;
        }
    }

    public static long sumatoria(long n) {               // Subequipo A: No se proponen cambios tampoco.
        if(isPrime(n)) {
            int i = 0; 
            long suma = 0;
            while(i <= n) {
                suma += i;
                i += 2;
            }
            return suma;
        }
        else {
            int i = 1; 
            long suma = 0;
            while(i <= n) {
                suma += i;
                i += 2;
            }
            return suma;
        }
    }

    // Pruebas de funcionamiento de los algoritmos de la clase UtilMath
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(isPrime(11));
        System.out.println(sumatoria(6));
    }
}
