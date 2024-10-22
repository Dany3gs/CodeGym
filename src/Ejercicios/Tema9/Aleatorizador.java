package Ejercicios.Tema9;

/* En esta tarea, implementará el método generateNumber() , que devolverá un número aleatorio de 0 a 99.
En el método generateNumber(), utilice el método Math.random().

Requisitos:
•	La clase Solution debe tener un método estático público generateNumber() con un tipo de retorno de int.
•	Implemente el método generateNumber() según la condición.*/

import java.util.Random;

public class Aleatorizador {

    public static void main(String[] args) {
        for (int i = 0; i < 99; i++) {
            System.out.println(generateNumber());
        }
    }

    public static int generateNumber() {
        //escribe aquí tu código
        return (int) (Math.random() * 99 ) ;
    }
}

//ok codegym