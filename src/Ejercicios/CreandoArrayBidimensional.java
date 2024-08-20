package Ejercicios;
/*Un array bidimensional es un array de arrays. Es decir, un array en el que cada celda contiene una referencia a un
 array.
Pero es mucho más fácil pensarlo como una tabla que tiene un número de filas (primera dimensión) y un número de columnas
 (segunda dimensión).
En esta tarea, crearemos un array de este tipo.

Implementa el método main(String[]) , que:

1 - Lea desde la consola un número R - el número de filas del array. El número debe ser mayor que 0.

2 - Luego lee R números de la consola (cualquier número mayor que 0).

3 - Luego inicializa el array bidimensional multiArray utilizando:
 el número de filas R;
 fila de arrays cuyo tamaño corresponde a los números introducidos en el paso 2 (en el orden en que se introducen).

Ejemplo:

Se introduce el número 5.
Se introducen los números 1, 7, 5, 9 y 3.
Y obtenemos un array como este:
[]
[][][][][][][]
[][][][][]
[][][][][][][][][]
[][][]
Requisitos:
•	La clase Solution debería tener una variable multidimensional entera static y sin inicializar.
•	El método main (String[]) debe leer N + 1 números del teclado.
•	En el método main (String[]), inicialice y llene la matriz de dos dimensiones según lo especificado en las
condiciones de la tarea.*/

import java.util.Scanner;
public class CreandoArrayBidimensional {

    public static int[][] multiArray;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        if (num1 > 0) {
            multiArray = new int[num1][]; //asígnamos el número 1 indicado por consola como cantidad de filas a imprimir
        }

        int num2;
        //con un for recorremos num1, para saber cuantas filas debemos imprimir
        //solicitamos cuantos elementos quiere en cada fila
        for (int i = 0; i < num1; i++) {
            num2 = sc.nextInt();
            multiArray[i] = new int[num2];//asígnamos el número 2 indicado por consola como cantidad de elementos a imprimir
        }

        //recorremos el array bidimensional para imprimir sus valores.
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = (i + j);
                System.out.print(multiArray[i][j] + "");
            }
            System.out.println();
        }
        sc.close();
    }
}
// ok CodeGym