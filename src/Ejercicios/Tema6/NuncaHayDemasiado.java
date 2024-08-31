package Ejercicios.Tema6;/*
En esta tarea, debes:

Usar el teclado para leer una cadena y un número (number variable) que sea mayor que 0 y menor que 5.
Muestre la cadena number veces usando un do-while ciclo. Muestre cada valor en una nueva línea.
Si el valor leído para la variable number es menor o igual que 0 o mayor o igual que 5, entonces la cadena introducida
debe mostrarse una vez.
Example input:
abc
2

Example output:
abc
abc

Requisitos:
•	El programa debe leer datos desde el teclado.
•	El programa debe mostrar datos en la pantalla.
•	El programa debe mostrar la cadena de caracteres n veces.
•	El programa debe mostrar la cadena una vez si el número es menor o igual que 0 o mayor o igual que 5.
•	El programa debe usar un ciclo do-while.*/

import java.util.Scanner;

public class NuncaHayDemasiado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int number = scanner.nextInt();

        do {
            System.out.println(string);
            number--;
        } while (number > 0 && number < 4);
    }
}
//Ok codeGym , revisar para entender mejor Nivel 4, Lección 8