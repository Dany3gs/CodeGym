package Ejercicios;

import java.util.Scanner;

public class ArrayNumMin {
    public static int[] array;

    public static void main(String[] args) {
        //escribe aquí tu código

        Scanner sc = new Scanner(System.in);
        //creamos una variable para que guarde el número de elementos que queremos en el array
        int numerosIngresados = sc.nextInt();
        //le indicamos al array que el número de elementos que contendrá es la variable anterior
        array = new int[numerosIngresados];

        //recorremos los números ingresados para asignar a las celdas, con la variable i incrementamos la posición del
        //nuevo valor de cada elemento
        for (int i = 0; i < numerosIngresados; i++) {
            array[i] = sc.nextInt();
        }
        //creamos una variable que haga referencia a la posición 0 del array, para compararlo con un if y sustituir
        //si el valor de i es menor que min y así poder obtener el valor mínimo de los ingresados
        int min = array[0];
        for (int i = 1; i < numerosIngresados; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        //imprimimos valor mínimo
        System.out.println(min);

    }
}
//Ok CodeGym