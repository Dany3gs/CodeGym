package Ejercicios;/*Escribamos un programa que lea 10líneas del teclado y muestre el número de líneas que eran números*/

import java.util.Scanner;

public class ContarNumLineas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;

        for (int i = 0; i <10; i++) {

            if (sc.hasNextInt()) {
                count++;
                sc.nextInt();
            }
        } System.out.println(count);
    }
}
