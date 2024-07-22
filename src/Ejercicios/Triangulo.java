package Ejercicios;/*Vamos a escribir un programa que calcule la posibilidad de la existencia de un triángulo basado en las longitudes
de sus lados.

Para hacer esto, necesitas:

- Ingresar tres números desde el teclado ✅ las longitudes de los lados del triángulo.
- Usar las longitudes de los lados para determinar si un triángulo es posible.
- Dependiendo del resultado, mostrar "Es un triángulo" o "No es un triángulo".
- Para hacer esta determinación, necesitas comparar cada lado con la suma de los otros dos lados.

Es decir, necesitarás realizar tres comparaciones:

Si cada comparación indica que el lado es menor que la suma de los otros dos lados, entonces un triángulo con estos
lados existe. Si al menos una comparación indica que el lado es mayor o igual que la suma de los otros dos lados,
entonces un triángulo con estos lados no existe.
* */

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

        int num1 = 0, num2 = 0, num3 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese tres longitudes: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

    }
}
