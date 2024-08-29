package Ejercicios;
/*Implemente el método main(String[]), que ordene la matriz en orden ascendente.
Use el método Arrays.sort(int[]) para ordenar la matriz.

Requisitos:
•	Implemente el método main(String[]) de acuerdo con las condiciones de la tarea*/


import java.util.Arrays;
public class OrdenarUnArray {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) {
        //escribe aquí tu código
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
//ok Codegym