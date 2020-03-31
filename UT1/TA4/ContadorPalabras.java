package TA4;

import java.util.Random;
import java.io.*;

public class ContadorPalabras {
    /**
     * Cuenta las palabras que contiene una cadena pasada por parámetro.
     * @param frase cadena a contar sus palabras.
     * @return cantidad de palabras en la cadena.
     */
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
    /**
     * La funcion obtenerLineas abre y lee un archivo pasado por parametro. A medida que lo lee cuenta la
     * cantidad de lineas y los agrega a un contador para luego definir el largo de un String[] en el cual
     * posteriormente se guardara el contenido del archivo.
     * @param String path Archivo a recorrer.
     * @return String r String con el contenido del archivo.
     */
    
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

    /**
     * Recorre el array de cadenas y llama a contarPalabras para cada cadena, almacena en la variable total la cantidad
     * de palabras en la cadena.
     * @param lineasArchivo Array con líneas del archivo
     * @return int cantidad de palabras en todo el array
     */
    public int cantPalabras (String[] lineasArchivo) {
        int total = 0;
        for(int i = 0; i < lineasArchivo.length; i++) {
            total += contarPalabras(lineasArchivo[i]);
        }
        return total;
    }
    /**
     * La función vocalesYConsonantes toma una cadena, si es una cadena y si se encuentra en la varible vocales_
     * le suma a la varible contador llamada consonante.
     * @param String cadena
     * @return int 
     */
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
    /**
     * La función contarPalabrasLargoX recorre la string pasada como parámetro letra a letra,
     * contando las letras consecutivas y al encontrar un espacio válida si la palabra es superior
     * al largo que se pasa por parámetro, si lo es se suma uno a la variaba palabrasLargoX,
     * la cual después será retornada.
     *
     * @param String frase Frase a evaluar.
     * @param byte x Cantidad de caracteres.
     * @return int cantidad de palabras con largo mayor a x.
     */
    public int contarPalabrasLargoX (String frase, byte x) {
        boolean palabra = false;
        int contador = 0;
        int palabrasLargoX = 0;
        
        for(char ch : frase.toCharArray()) {
            if(Character.isDigit(ch) || Character.isLetter(ch)) {
                palabra = true;
                contador += 1;
            }
            else if(ch == ' ' && palabra == true) {
               if(contador > x) {
                palabrasLargoX += 1;
               }
                palabra = false;
                contador = 0;
            }
        }
        if(contador > x) {
            return palabrasLargoX += 1;
        }
        return palabrasLargoX;
    }
    /**
     * La función contains recorre un String[] y verifica si el segundo parámetro está incluido en él.
     * @param String[] array frase a evaluar.
     * @param String v.
     * @return boolean.
     */
    public boolean contains(String[] array, String v) {
        boolean resultado = false;
        for(String str : array){
            if(str != null && v.toLowerCase().equals(str.toLowerCase())) {
                resultado = true;
                break;
            }
        }
        return resultado;
    }

    /**
     * Retorna las palabras comunes entre dor arrays de cadenas.
     * @param palabras1 Primer array con palabras.
     * @param palabras2 Segundo array con palabras
     * @return Array con palabras en común.
     */
    public String[] palabrasComunes(String[] palabras1, String[] palabras2) {
        String[] resultado = new String[palabras1.length];
        int i = 0;
        for(String str : palabras1) {
            if(contains(palabras2, str) && !contains(resultado, str)){
                resultado[i] = str;
                i++;
            }
        }
        return resultado;
    }
}

class Principal {
    public static void main(String[] args) {
        // Inicializamos un objeto ContadorPalabras.
        ContadorPalabras contador = new ContadorPalabras();

        // // Ejercicio 1.
        // System.out.println("Ejercicio 1:");
        // System.out.println(contador.contarPalabras("Hola, esto es una    prueba. ")); // 5
        // System.out.println(contador.contarPalabras("Hola. Esto esunaprueba.")); // 3
        // System.out.println(contador.contarPalabras("")); // 0
        // System.out.println(contador.contarPalabras(" ")); // 0
        // System.out.println(contador.contarPalabras(".")); // 0
        // System.out.println(contador.contarPalabras("1")); // 1
        // System.out.println(contador.contarPalabras("H")); // 1


        // // Ejercicio 2.
        // System.out.println("Ejercicio 2:");
        
        // // Subequipo A.
        // System.out.println("\tParte A:");
        // String cadena = "Hola, esto es una prueba";
        // System.out.println(contador.vocalesYConsonantes(cadena));

        // // Subequipo B.
        // System.out.println("\tParte B:");
        // String cadenab = "Hola, esto es una prueba";
        // byte x = 3 ;
        // System.out.println(contador.contarPalabrasLargoX(cadenab, x));
      
        // // Ejercicio 3.
        // System.out.println("Ejercicio 3:");
        String[] lineas = contador.obtenerLineas("TA4/UT2_TA1_ARCHIVO_EJEMPLO.txt");
        // int cantPalabras = contador.cantPalabras(lineas);
        // System.out.println("Cantidad de Palabras: " + cantPalabras);

        // TA4 Ejercicio 1.
        System.out.println("TA4: Ejercicio 1:");
        String[] ar1 = {"Hola", "mundo", "de", "los", "algoritmos"};
        String[] ar2 = {"Hola", "mundo", "de", "la", "informática"};
        String[] resultado = contador.palabrasComunes(ar1, ar2);
        for(String str : resultado) {
            if (str != null) {
                System.out.println(str);
            }
        }
        // TA4 Ejercicio 1 parte c.
        Random rand = new Random();
        int max = lineas.length - 1;
        String linea1 = lineas[rand.nextInt(max)];
        String linea2 = lineas[rand.nextInt(max)];
        System.out.println("Línea 1: " + linea1);
        System.out.println("Línea 2: " + linea2);
        String[] array1 = linea1.split(" ");
        String[] array2 = linea2.split(" ");
        String[] comunes = contador.palabrasComunes(array1, array2);
        System.out.println("Coincidencias:");
        for (String str : comunes) {
            if(str != null) {
                System.out.println(str);
            }
        }
    }
}
