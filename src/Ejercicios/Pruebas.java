package Ejercicios;

import java.util.Scanner;
import java.util.SortedMap;

public class Pruebas {

    public static void main(String[] args) {
        //escribe aquí tu código

    Scanner sc = new Scanner(System.in);

        System.out.println("introduce 10 números, se mostrarán los valores a la inversa:");

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
// int min = array[0]; //esto indica que min cogerá el valor de la celda 0 del array




