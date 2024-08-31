/*Este ejercicio no conseguí hacerlo, no llegué a ver como sustituir las palabras repetidas, o eliminarlas para que
la cambiara por null, anoto paso a paso para tenerlo en cuenta para prácticar.*/

package Ejercicios.Tema6;

import java.util.Scanner;



public class EliminarStringDuplicados {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        strings = new String[6];
        // Bucle for que itera 6 veces. En cada iteración, lee una línea de la consola usando el Scanner
        // y la almacena en el array 'strings' en la posición correspondiente.
        for (int i = 0; i < 6; i++) {
            strings[i] = scanner.nextLine();
        }

        // Primer bucle for que recorre cada elemento del array 'strings'.
        for (int i = 0; i < strings.length; i++) {

            // 'currentString' almacena el valor actual del elemento en la posición 'i' del array.
            String currentString = strings[i];

            // Segundo bucle for que comienza en 'i + 1' y recorre los elementos restantes del array.
            // Sirve para comparar 'currentString' con los elementos siguientes en el array.
            for (int j = i + 1; j < strings.length; j++) {

                // Verifica si 'currentString' es 'null'. Si lo es, sale del bucle interno con 'break'.
                // Esto se hace para evitar comparar un valor 'null' y, por lo tanto, no se continúa la verificación
                // de duplicados para este valor.
                if (currentString == null) {
                    break;
                }

                // Compara 'currentString' con 'strings[j]'. Si son iguales (es decir, se encontró un duplicado),
                // entonces asigna 'null' tanto a 'strings[j]' como a 'strings[i]'. Esto indica que se encontró
                // un duplicado y ambos elementos se marcan como 'null'.
                if (currentString.equals(strings[j])) {
                    strings[j] = null;
                    strings[i] = null;
                }
            }
        }

        // Bucle for que recorre el array 'strings' para imprimir cada elemento.
        // Imprime 'null' si el valor en la posición actual es 'null'.
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}

