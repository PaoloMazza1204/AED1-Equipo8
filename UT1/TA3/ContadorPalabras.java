package TA3;

import java.io.*;

public class ContadorPalabras {

    //El algoritmo contarPalabras cuenta las palabras que contiene una cadena pasada por parámetro.    
    public int contarPalabras(String frase) {
        boolean palabra = false;
        int contador = 0;
        
        for(char ch : frase.toCharArray()) {
            if(Character.isDigit(ch) || Character.isLetter(ch)) {
                palabra = true;
            }
            else if(ch == ' ' && palabra == true) {
                contador += 1;
                palabra = false;
            }
        }
        if(palabra == true) {
            return contador += 1;
        }
        return contador;
    }

    public String[] obtenerLineas(String path) {
        try {
            int cont = 0;
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            br.mark(1000000); // Marcamos la línea para luego resetear el stream aquí
            String line = br.readLine();
            while (line != null) {
                cont += 1;
                line = br.readLine();
            }
            br.reset(); // Reseteamos el stream a la marca
            line = br.readLine();
            String[] lines = new String[cont];
            for (int i = 0; line != null; i++) {
                lines[i] = line;
                line = br.readLine();
            }
            fr.close();
            br.close();
            return lines;
        }
        catch(FileNotFoundException e) {
            System.out.println("Could not find the file " + path);
            e.printStackTrace();
        }
        catch(IOException e) {
            System.out.println("Error at opening the file " + path);
            e.printStackTrace();
        }
        String[] r = {""};
        return r;
    }

    /* Se le pasa un array con líneas de un archivo de texto, a cada una de estas líneas se le aplica el método
    contarPalabras y se almacena el resultado en la variable total, que se retorna al final*/
    public int cantPalabras (String[] lineasArchivo) {
        int total = 0;
        for(int i = 0; i < lineasArchivo.length; i++) {
            total += contarPalabras(lineasArchivo[i]);
        }
        return total;
    }

    public String vocalesYConsonantes(String cadena) {
        String vocales_ = "aeiou";
        int vocales = 0;
        int consonantes = 0;
        for(char ch : cadena.toCharArray()) {
            if(Character.isLetter(ch)) {
                if(vocales_.contains(ch + "")) {
                    vocales += 1;
                }
                else {
                    consonantes += 1;
                }
            }
        }
        return "Vocales encontradas: " + vocales + "\nConsonantes encontradas: " + consonantes;
    }
}

class Principal {
    public static void main(String[] args) {
        // Inicializamos un objeto ContadorPalabras
        ContadorPalabras contador = new ContadorPalabras();

        // Ejercicio 1
        System.out.println("Ejercicio 1:");
        System.out.println(contador.contarPalabras("Hola, esto es una    prueba. ")); // 5
        System.out.println(contador.contarPalabras("Hola. Esto esunaprueba.")); // 3
        System.out.println(contador.contarPalabras("")); // 0
        System.out.println(contador.contarPalabras(" ")); // 0
        System.out.println(contador.contarPalabras(".")); // 0
        System.out.println(contador.contarPalabras("1")); // 1
        System.out.println(contador.contarPalabras("H")); // 1


        // Ejercicio 2
        System.out.println("Ejercicio 2:");
        
        // Subequipo A
        System.out.println("\tParte A:");
        String cadena = "Hola, esto es una prueba";
        System.out.println(contador.vocalesYConsonantes(cadena));

        System.out.println("\tParte B:"); // Su código
        // Ejercicio 3
        System.out.println("Ejercicio 3:");
        String[] lineas = contador.obtenerLineas("UT1/TA3/UT2_TA1_ARCHIVO_EJEMPLO.txt");
        int cantPalabras = contador.cantPalabras(lineas);
        System.out.println("Cantidad de Palabras: " + cantPalabras);
    }
}