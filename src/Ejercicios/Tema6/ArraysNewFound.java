package Ejercicios.Tema6;

import java.util.Scanner;

public class ArraysNewFound {

    public static final String ODD = "Odd";
    public static final String EVEN = "Even";
    public static String[] strings = new String[5];

    public static void main(String[] args) {
        //escribe aquí tu código
        Scanner sc = new Scanner(System.in);
        String[] ciudades = {"Avila", "Madrid", "Las Palmas"};

        System.out.println("indica que ciudad quieres buscar; ");
        String ciudadBuscada;
        ciudadBuscada = sc.nextLine();
        boolean encontrado = false;
        for (String ciudad : ciudades) {
            if (ciudad.equalsIgnoreCase(ciudadBuscada)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("la ciudad de " + ciudadBuscada + " si está en la lista");

        } else {
            System.out.println("La ciudad " + ciudadBuscada + " no se encuentra en la lista");
        }
    }
}
