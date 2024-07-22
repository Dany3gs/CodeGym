package Ejercicios;/*
* Lea un nombre desde el teclado y luego, usando un while loop, muestre <name> loves me (la variable text) 10 veces.
Cada instancia de la frase debe estar en una nueva línea.
Ejemplo de la salida de pantalla para el nombre "Regina":
Regina loves me.
Regina loves me.
Regina loves me.
Regina loves me.
Regina loves me.
Regina loves me.
Regina loves me.
Regina loves me.
Regina loves me.
Regina loves me.
Requisitos:
•	El programa debe leer un nombre desde el teclado.
•	El programa debe mostrar texto en pantalla.
•	El programa debe mostrar el texto indicado en la tarea 10 veces. Cada instancia de la frase debe estar en una nueva línea.
•	El programa debe usar un ciclo while.*/

import java.util.Scanner;

public class TodosQuieresSerAmados {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String text = " loves me.";

            System.out.println("Escribe Regina");
            String name = sc.nextLine();
            int num = 0;

            while (num < 10) {
                System.out.println(name + text);
                num++;
            }
  }
}

