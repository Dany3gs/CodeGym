package Ejercicios.Tema6;/*
El programa debe leer números enteros desde el teclado hasta que se ingrese otra cosa, como una cadena o un carácter. Muestre el número mínimo ingresado. Si se ingresan varios números, debe mostrar cualquiera de ellos.
Ejemplo de entrada:
8
4
9
4
5
e

Ejemplo de salida:
4

Requisitos:
•	El programa debe leer números del teclado.
•	El programa debe mostrar un número en pantalla.
•	El programa debe mostrar el número entero más pequeño.
•	Si se introducen varios números mínimos, luego debe mostrar cualquiera de ellos.
•	Si solo se introduce un carácter no numérico, entonces muestre el valor máximo posible para un int.
•	Debe leer datos desde el teclado en un ciclo while.*/

import java.util.Scanner;

public class MinimoNumEnt {
    public static void main(String[] args) {
        //escribe aquí tu código
        Scanner console = new Scanner(System.in);

        int numMin = Integer.MAX_VALUE;

        while (console.hasNextInt()) {
            int num = console.nextInt();

            if (num <= numMin) {
                numMin = num;
            }
        }
        System.out.println(numMin);
    }
}
// ok codegym