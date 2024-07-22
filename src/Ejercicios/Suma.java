package Ejercicios;/*
Escribamos un programa que lea números enteros desde el teclado y calcule su suma hasta que el usuario ingrese la palabra "ENTER".
Muestra la suma y finaliza el programa.
Requisitos:
•	El programa debe leer datos del teclado.
•	Necesitas calcular la suma de los enteros introducidos y si el usuario introduce la palabra de finalización, mostrarla la suma en pantalla.
•	El programa debe usar un ciclo while.*/

import java.util.Scanner;
import java.util.SortedMap;

public class Suma {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            //asignamos la variable line para la entrada de usuario
            int suma =0;
            int num;
            String line;

            //la condición para el while indica que mientras line sea diferente a "ENTER", no salga del bucle
            //se puede indicar la condición completa en el while
            System.out.println("Indique la lista de números que quiere sumar y luego escriba Enter para tener el total: ");
            while (!(line = sc.nextLine()).equalsIgnoreCase("ENTER")) {
                //con Integer.parseInt(line); cambiamos la entrada del usuario "line", que entra"" a int, para que pueda
                //hacer el cálculo la suma, que suma si es int

                num= Integer.parseInt(line);
                suma+=num;
            }
            System.out.println("La suma de los números indicados es: " + suma);
        }
    }

/*Esta es la solución que aporta CodeGym, no estaba tan desencaminado cuando empece, otra opción de como solucionarlo

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        boolean isExit = false;
        while (!isExit) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum = sum + number;
            } else if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals("ENTER")) {
                    isExit = true;
                }
            }
        }
        System.out.println(sum);
    }
}*/
