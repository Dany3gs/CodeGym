package Ejercicios.Tema9;

/*Corregir métodos de la clase Solution usando la clase Math :

sqrt(double) : debe devolver la raíz cuadrada del argumento pasado.
cbrt(double) : debe devolver la raíz cúbica del argumento pasado.
pow(int, int) : debe devolver el valor del primer argumento elevado a la potencia del segundo argumento.
Requisitos:
•	Implemente el método sqrt(doble) según la condición.
•	Implemente el método cbrt(doble) según la condición.
•	Implemente el método pow(int, int) según la condición.
 */

import java.lang.Math;
public class ClaseChatarraParte2 {

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double cbrt(double a) {
        return Math.cbrt(a);
    }

    public static double pow(int number, int power) {
//        if (power == 0) {
//            return 1;
//        }
//
//        int modulus = power < 0 ? power * -1 : power;
//        int result = number;
//        for (int i = 1; i < modulus; i++) {
//            result *= number;
//        }
        return Math.pow(number, power);
    }
}

// ok Codegym

