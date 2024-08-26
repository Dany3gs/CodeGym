package Ejercicios;

import java.util.Arrays;

public class ArrayFillMetodo {

    public static void main(String[] args) {
        int[] x = new int[10];

        //Si queremos rellenar un array con un valor en especifico, podemos hacerlo con un for como este:
        for (int i = 0; i < x.length; i++) {
            x[i] = 9;
            System.out.print(x[i]); // output 9999999999
        }
        //Para imprimir los elementos al ser un array unidimensional también podemos usar el métdodo Array.toString();
        System.out.println(Arrays.toString(x));//output [9, 9, 9, 9, 9, 9, 9, 9, 9, 9]


        //**Array.fill** OJO SOLO PARA ARRAYS UNIDIMENSIONALES!!!!!!

        //Si queremos llenar los elementos de un rango del array, se usa el método
        //De acuerdo con la buena vieja tradición de Java, recuerde que el último elemento no está incluido en el rango.
        // Array.fill(nombre variable, desde, hasta, valor)
        Arrays.fill(x, 4, 8, 6);
        Arrays.fill(x, 0, 4, 2);
        Arrays.fill(x, 8, 10, 1);

        for (int j = 0; j < x.length; j++) {
            System.out.print(x[j] + " ");//---> 2 2 2 2 6 6 6 6 1 1
        }
    }
}
