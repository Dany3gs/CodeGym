package Ejercicios.Tema6;
/*
Implementa el método main(String[]), que divide un array en dos subarray y rellena un array bidimensional con ellos.
Si la longitud del array es impar, entonces la mitad más grande se debe copiar en el primer subarray.

Utiliza el método Arrays.copyOfRange(int[], int, int) para dividir el array. No cambie el orden de los elementos.
Durante la prueba, los valores de los campos en la clase Solution serán diferentes. Tenga esto en cuenta.

Requisitos:
Implemente el método main (String[] conforme a las condiciones de la tarea.*/

import java.util.Arrays;

public class DividirUnArray {
    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {

        int firstPart = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;

        result[0] = Arrays.copyOfRange(array, 0, firstPart);
        result[1] = Arrays.copyOfRange(array, firstPart, array.length);

        System.out.println(Arrays.deepToString(result));
    }
}

