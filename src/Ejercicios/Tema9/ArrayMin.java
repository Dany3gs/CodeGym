package Ejercicios.Tema9;

/*En esta tarea necesitas:

Lea 10 números desde la consola y complete la matriz con ellos usando el método getArrayOfTenElements() .
Encuentre el elemento mínimo de la matriz y devuelva este elemento usando el método min(int[]) .
En el método min(int[]), asegúrese de utilizar el método Math.min(int, int).
Requisitos:
•	El programa debe leer números del teclado.
•	La clase Solution debe contener solo tres métodos.
•	El método getArrayOfTenElements() debe leer 10 números del teclado y luego devolver una matriz de 10 elementos
    llenos de los números leídos.
•	El método min(int[]) debe devolver el elemento mínimo de la matriz utilizando el método min(int, int) de la clase
    Math.
•	El método main() debe llamar al método getArrayOfTenElements().
•	El método main() debe llamar al método min(int[]).
*/

import java.util.Scanner;

public class ArrayMin {
    public static void main(String[] args) {
    // Se llama al método getArrayOfTenElements para crear y rellenar un array de 10 elementos introducidos
    // por el usuario. Este array se almacena en la variable intArray

        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    // Para calcular el valor min creamos un int que tenga el valor de la posición 0 del parámetro ints indicado en el
    // método, con un for empezando la i en 1 para que compare con la posición 0 del array ints, indicamos que al
    // recorrer el array ints el valor de minValue, usando la clase Math.min, compare el valor de minValue con la
    // posición de ints[i], con esto nos cambia el valor de minValue al valor mínimo que encuentre entre los dos
    // parámetros indicados (minValue, ints[i]).
    // Asignamos al return la variable minValue para que devuelva el valor mínimo al llamarla en el primer array
    // que creamos fuera en la clase main, que tiene asignado ya el método getArrayOfTenElements(); siendo el
    // párametro de min(intArray).
    public static int min(int[] ints) {

        int minValue = ints[0]; // Inicializamos minValue con el primer valor del array
        for (int i = 1; i < ints.length; i++) { // i empieza en 1 para comparar con ints[0]
            minValue = Math.min(minValue, ints[i]);// Comparar minValue con el elemento actual de ints[i]
        }
       return minValue; // Retorna el valor mínimo
    }
    // Creamos la entrada de teclado con la clase Scanner
    // para rellenar el array en el método creamos una la variable array myArray con los elementos que pide el
    // ejercicio (10) con un for recorremos el array indicando que cada valor de i es una nueva entrada de teclado
    // sc.nextInt(), para que el método devuelva el array cuando se llame, asignamos a return el array creado myArray

    public static int[] getArrayOfTenElements() {

        Scanner sc = new Scanner(System.in);

        int[] myArray = new int[10]; // Creamos un array de tamaño 10
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sc.nextInt(); // Leer un número y asignarlo al array
            System.out.println(myArray[i]); // Mostrar el valor introducido (opcional)
        }
        return myArray; // Retornar el array lleno
    }
}

//ok Codegym

