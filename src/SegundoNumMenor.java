/**
 * En esta tarea, debes:

 * Leer números enteros desde el teclado hasta que se ingrese otra cosa, como una cadena o un carácter.
 * Al menos dos números deben ser ingresados. Si se ingresan menos de dos números enteros, luego termine
 * el programa con un error. No necesitas manejar esta situación.
 * Mostrar el segundo número entero más pequeño ingresado desde el teclado. Si se ingresan varios números,
 * debes mostrar cualquiera de ellos.
 * También pueden haber varios números mínimos.
 * Ejemplo de entrada:
 * 8
 * 4 // Número mínimo
 * 7
 * 4 // Número mínimo
 * 5 // Segundo número más pequeño
 * 9
 * 5 // Segundo número más pequeño
 * exit
 * Ejemplo de salida:
 * 5

 * Requisitos:
 * •	El programa deberá leer números desde el teclado.
 * •	El programa deberá mostrar un número en pantalla.
 * •	El programa deberá mostrar el segundo número más pequeño que se haya introducido.
 * •	Si se introducen varios segundos números más pequeños, entonces deberá mostrar cualquiera de ellos.
 * •	Deberá leer los datos desde el teclado en un ciclo while.
 */
import java.util.Scanner;

public class SegundoNumMenor {
    public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    int numMin = 0;

        while (console.hasNextInt()) {
        int num1 = console.nextInt();
        int num2 = console.nextInt();

        if (num1 < num2) {
            numMin = num1;

        } if (num2 < num1) {
                numMin = num2;

        }
       }System.out.println(numMin);

    }
}
