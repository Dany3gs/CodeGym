package Ejercicios;/*Escribamos un programa que no lea nada, sino que calcule algo. Algo difícil. Por ejemplo, el factorial del número 10.

El factorial de un número n(denotado por n!) es el producto de una serie de números: 1*2*3*4*5*..*n;*/

import java.util.Scanner;

public class FactorialDeN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int f = 1;
        for (int i = 1; i < 10; i++) {
            f = f * i;
            System.out.println(f);
        }
        System.out.println(f);
    }
}
