package Ejercicios.Tema6;/*El método main lee 3 enteros desde el teclado: start, end y multiple.
Actualice el programa para que la pantalla muestre la suma de los múltiplos de la variable multiple en el rango de start
 (incluido) a end (no incluido).
Use un for ciclo para hacer esto.
Sugerencia: Para pasar a la siguiente iteración del ciclo, utilice un continue la declaración.
Requisitos:
•	El programa debe mostrar la suma de los múltiplos de la variable múltiple en el rango de start (incluido) a end
(no incluido).
•	El programa debe usar un ciclo for.
•	Debe usar una instrucción continue en un ciclo for. */

import java.util.Scanner;

public class SumarNumPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;
        //escribe aquí tu código
        for (int j = 0; j < end; j++) {
            if (j % multiple != 0) {
                continue;

            }
            System.out.println(j);
        }
        for (int i = 0; i < end; i++) {
            if (i % multiple != 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);

    }
}
//Ok en CodeGym, añadido el for para ver los multiplos que está sumando, el último no debe sumarse, por eso el < end :)