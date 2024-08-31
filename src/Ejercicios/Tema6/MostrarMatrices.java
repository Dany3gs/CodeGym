package Ejercicios.Tema6;

/*Implementar el método main (String []), que muestra las matrices de strings e ints en la consola mediante el método
Arrays.toString ().

Requisitos:
•	La clase Solution debe tener una variable de cadena static public.
•	La clase Solution debe tener una variable entera static public.
•	En el método main (String[]), muestre la matriz de cadenas en la consola usando el método Arrays.toString (Object[]).
•	En el método main (String[]), muestre la matriz de enteros en la consola usando el método Arrays.toString (int[]).*/

import java.util.Arrays;

public class MostrarMatrices {
    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        //escribe aquí tu código
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(ints));
    }
}
// ok CodeGym