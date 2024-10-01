package Ejercicios.Tema6;

/*Escribamos un programa que lea 10 líneas del teclado que sean números y muestre el número de líneas*/

import java.util.Scanner;

public class ContarNumLineas {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int count = 0;

        for (int i = 0; i < 10; i++) {

            if (sc.hasNextInt()) {
                count++;
                sc.nextInt();
            }
        }
        System.out.println(count);
    }
}
