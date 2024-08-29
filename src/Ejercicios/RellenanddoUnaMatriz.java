package Ejercicios;

/*Implemente un método main(String[]) estático que rellene la variable de matriz con los valores valueStart y valueEnd.
Si la longitud de la matriz es par, entonces la primera mitad debe estar llena con valores valueStart, y la segunda
mitad con valores valueEnd.
Si la longitud de la matriz es impar, entonces rellene la parte mayor con valueStart, y la menor con valueEnd.

Para llenar la matriz con valores, utilice el método Arrays.fill(int [], int, int, int).
Durante la prueba, los valores de los campos en la clase Solution serán diferentes. Tenga eso en cuenta.
"
Requisitos:
•	Implemente el método main(String[]) de acuerdo con las condiciones de la tarea.*/

import java.util.Arrays;
public class RellenanddoUnaMatriz {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        //escribe aquí tu código

        if (array.length % 2 == 0){
            Arrays.fill(array, 0, array.length / 2, valueStart);
            Arrays.fill(array, array.length / 2,array.length, valueEnd);
        } else {
            Arrays.fill(array, 0,array.length /2 + 1, valueStart);
            Arrays.fill(array, array.length /2 + 1, array.length, valueEnd);

        }System.out.println(Arrays.toString(array));
    }
}
//ok CodeGym