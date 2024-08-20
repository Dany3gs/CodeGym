package Ejercicios;
/*Cree una matriz triangular en la que el valor de cada elemento sea la suma de sus índices.

Por ejemplo:
array [7] [3] = 7 + 3 = 10,
array [3] [0] = 3 + 0 = 3.

Muestre la matriz en la forma siguiente:
0
1 2
2 3 4
3 4 5 6
4 5 6 7 8
5 6 7 8 9 10
...

Los números en cada línea están separados por un espacio.
Puede definir una matriz triangular de la siguiente manera:
int [][] array = new int [10] [];
array [0] = new int [1];
array [1] = new int [2];
array [2] = new int [3];
...

Requisitos:
•	En el método main(String[]), rellene el array resultado bidimensional con números según lo indicado en las
    condiciones de la tarea.
•	El texto mostrado debe contener 10 líneas.
•	Los números mostrados deben coincidir con las condiciones de la tarea.*/


public class ArrayTriangular {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        //escribe aquí tu código

        /* [i]    =    [j]
        result[0] = new int[1];
        result[1] = new int[2];
        result[2] = new int[3];
        result[3] = new int[4];
        result[4] = new int[5];
        result[5] = new int[6];
        result[6] = new int[7];
        result[7] = new int[8];
        result[8] = new int[9];
        result[9] = new int[10];

        esto es lo mismo que hacer el for*/

        //se puede simplificar el código recorriendo [i] incrementando en 1 para que rellene las filas hasta la indicada
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (i + j); //asignamos valores a [i] y [j]
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//ok CodeGym