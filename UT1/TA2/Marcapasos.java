package TA2;

// Ejercicio 3

public class Marcapasos {

    short presSangre, frecCardiaca, azucarSangre; // 3*2 bytes = 6 bytes
    long maxFuerza; // 8 bytes
    float tiempoLatidos; // 4 bytes
    double bateria; // 8 bytes
    char charCodigo1, charCodigo2, charCodigo3, charCodigo4, charCodigo5, charCodigo6, charCodigo7, charCodigo8; // 8*2 bytes = 16 bytes
}

/* Para calcular la memoria que ocupa un objeto del tipo Marcapasos sumamos los bytes que ocupa cada tipo de sus atributos
multiplicado por la cantidad de variables del tipo del atributo, esto es:

6 + 8 + 4 + 8 + 16 bytes = 42 bytes. Teniendo en cuenta exclusivamente sus atributos, una instancia de Marcapasos ocupa 42 bytes.
*/
