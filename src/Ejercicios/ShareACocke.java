package Ejercicios;/*Compartamos una lata de Coca Cola en el trabajo. Para hacer esto, vamos a escribir un programa con estos requisitos:
Necesitas leer dos números enteros desde el teclado. El primer número es el número de latas de Coca Cola en una lata.
El segundo es el número de personas en la oficina.
Muestra el resultado de dividir el primer número entre el segundo.
El resultado debe ser un número real.
Ejemplo de entrada:
3
2

Ejemplo de salida:
1.5
Requisitos:
•	El programa debe leer números enteros desde el teclado.
•	El programa debe mostrar un número en la pantalla.
•	El programa debe mostrar un número real - el resultado de dividir el primer número introducido por el segundo.
*/

import java.util.Scanner;
public class ShareACocke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int latas;
        int people;
        latas = sc.nextInt();
        people = sc.nextInt();
        double div = latas / (people * 1.0);
        System.out.println(div);

    }
}
// ok Code Gym easy peasy :) !!
