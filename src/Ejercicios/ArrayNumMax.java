package Ejercicios;

import java.util.Scanner;

public class ArrayNumMax {

    public static int[] array;

    public static void main(String[] args) {
        //escribe aquí tu código
        Scanner sc = new Scanner(System.in);
        int numerosIngresados = sc.nextInt();
        array = new int[numerosIngresados];

        for (int i = 0; i < numerosIngresados; i++) {
            array[i] = sc.nextInt();
        }
        //Hasta aquí es el mismo código que buscando el mínimo
        int numMax = array[0];
        for (int i = 1; i < numerosIngresados; i++) {
            //la difrencia solo está en el if, si el elemento del array de la variable i
            //es mayor que numMax, se sustituye
            if (numMax < array[i]) {
                numMax = array[i];
            }

        }
        System.out.println(numMax);
        sc.close();
    }
}
