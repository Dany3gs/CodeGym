package Ejercicios.Tema7;

/*Vamos a escribir una utilidad para trabajar con matrices. La funcionalidad principal está lista: el método
printArray() muestra todos los elementos de la matriz en la consola.
Lo que te queda es una bagatela: implementa el método reverseArray(). Debería invertir el orden de los elementos en
la matriz.
El método solo debería funcionar con matrices de valores enteros (int[]).

Ejemplo:
Si la matriz contiene los elementos:
1, 2, 3, 4, 5, 6, 7, 8, 9, 0
luego, después de llamar al método reverseArray(), debería contener:
0, 9, 8, 7, 6, 5, 4, 3, 2, 1
Requisitos:
•	El método reverseArray debe invertir el orden de los elementos en el arreglo.*/

public class ElOrdenCorrecto {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};  // 1. Se crea y se inicializa un array
        printArray(array);  // 2. Se imprime el array original
        reverseArray(array);  // 3. Se invierte el array
        printArray(array);  // 4. Se imprime el array después de ser invertido
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {  // 5. Bucle que recorre la mitad del array
            int temp = array[i];  // 6. Se almacena temporalmente el valor del índice actual
            array[i] = array[array.length - i - 1];  // 7. Se reemplaza el valor actual con su opuesto
            array[array.length - i - 1] = temp;  // 8. Se coloca el valor temporal en la posición opuesta
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {  // 9. Bucle que recorre todo el array e imprime cada elemento
            System.out.print(i + ", ");
        }
        System.out.println();  // 10. Salto de línea después de imprimir el array
    }
}
/*Esto no lo he visto, explicación
* Hay varias formas de invertir un array, la más eficiente es el método in-place, tanto por tiempo como por espacio.
* Su funcionamiento consiste en dividir el array en dos para ir sustituyendo con una variable nueva el valor del homólogo
* de su posición en el array
* Este método recorre solo la mitad del array y, en cada iteración, intercambia el elemento en la posición actual (i)
* con su correspondiente en el extremo opuesto (array.length - i - 1).
        *       for (int i = 0; i < array.length / 2; i++) {
                    int temp = array[i];
                    array[i] = array[array.length - i - 1];
                    array[array.length - i - 1] = temp;

* Con esto vamos modificando el array, por eso el ejercicio tiene tres llamadas de los métodos, original, modificado y
* nueva modificación, pero impresión solo tiene dos.
*       printArray(array);  // 2. Se imprime el array original
        reverseArray(array);  // 3. Se invierte el array
        printArray(array);  // 4. Se imprime el array después de ser invertido
* */