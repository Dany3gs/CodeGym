package Ejercicios.Tema7;

/*El método printSqrt(int[] array) debería imprimir la raíz cuadrada de cada elemento en el array que se le pasa.
Pero esto no está ocurriendo debido a los nombres de variables en conflicto. Corrija los nombres de variables para que
el código se compile.
El programa debería mostrar una línea adecuada en la consola para cada elemento del array.

Ejemplo de una línea:
La raíz cuadrada de 64 es 8.0

Requisitos:
El código debe compilarse.
Para cada elemento en el array, el método printSqrt(int[] array) debe imprimir una cadena de acuerdo con las
 condiciones de la tarea.*/

public class TodoTieneUnaRaiz {
        //sacamos el String elementSqrt como un método aparte del for, imprimimos con nombre de clase+método generic
    private static String elementSqrt = "The square root of ";

    public static void main(String[] args) {
        int[] array = {15, 64, 9, 51, 42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSqrt = Math.sqrt(element);
            System.out.println(TodoTieneUnaRaiz.elementSqrt + element + " is " + elementSqrt);
        }
    }
}
