package TA2;

public class UtilMath {

    // Ejercicio 1
    public static int factorial(int num) {
        int resultado = 1;
        for(; num > 1; num--) { 
            resultado *= num;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
