/*Usando bucles while anidados (un bucle dentro de otro bucle), muestre un cuadrado de 5 (altura) por 10 (anchura)
relleno con la letra 'Q'.

Ejemplo de salida:
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
Requisitos:
•	El programa debe mostrar texto en pantalla.
•	El programa debe mostrar un rectángulo de 5 de altura y 10 de ancho, relleno con la letra 'Q'.
•	El programa debe usar ciclos while anidados (un ciclo dentro de otro).
•	La salida en pantalla debe suceder en un ciclo while.*/


public class CuadradoRelleno {

    public static void main(String[] args) {

        int outer = 0;

        while (outer < 5) {

            int inner = 0;

            while (inner < 10) {

                System.out.print("Q");
                inner++;
            }
            System.out.println();
            outer++;
        }
    }
}
// ok en CodeGym