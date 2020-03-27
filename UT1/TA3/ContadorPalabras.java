package TA3;

public class ContadorPalabras {
    /**
     * El algoritmo contarPalabras cuenta las palabras que contiene una cadena pasada por parámetro.
     */
    public static int contarPalabras(String frase) {
        boolean word = false;
        int contador = 0;
        
        for(char ch : frase.toCharArray()) {
            if(Character.isDigit(ch) || Character.isLetter(ch)) {
                word = true;
            }
            else if(ch == ' ' && word == true) {
                contador += 1;
                word = false;
            }
        }
        if(word == true) {
            return contador += 1;
        }
            return contador;
    }
}

class Principal {
    public static void main(String[] args) {
        System.out.println(ContadorPalabras.contarPalabras("Hola, esto es una    prueba. ")); // 5
        System.out.println(ContadorPalabras.contarPalabras("Hola. Esto esunaprueba.")); // 3
        System.out.println(ContadorPalabras.contarPalabras("")); // 0
        System.out.println(ContadorPalabras.contarPalabras(" ")); // 0
        System.out.println(ContadorPalabras.contarPalabras(".")); // 0
        System.out.println(ContadorPalabras.contarPalabras("1")); // 1
        System.out.println(ContadorPalabras.contarPalabras("H")); // 1
    }
}