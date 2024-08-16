package Ejercicios;

import java.util.Scanner;
import java.util.SortedMap;

public class ArraysEjemplos {

    public static void main(String[] args) {

        //recorrer un array

       /* int[] recorrer = new int[5];
        String[] ciudades = {"a","b","c","d","e"};
        for (int i = 0; i < recorrer.length; i++) {
            System.out.println(recorrer[i]); //output 0 0 0 0 0
            /*para añadir-llenar elementos
            recorrer[i] = i + 1; // si queremos que incremente de 2 en 2, recorrer[i] = (i + 1) * 2;
            System.out.println(recorrer[i]); // output 1 2 3 4 5
        }
        for (String nombre : ciudades) {
            System.out.println(nombre);
        }*/
        int n = 10;
        int[] calculo = new int[n];
        calculo[n - 1] = 2;
        calculo[n - 2] = 3;
        calculo[n / 5] = calculo[n - 1] + calculo[n - 2];//asigna al elemento 2 el valor de la suma
        for (int i = 0; i < calculo.length; i++) {
            System.out.println(calculo[i]);
        }
    }
}
