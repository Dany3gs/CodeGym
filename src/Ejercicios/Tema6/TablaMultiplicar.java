package Ejercicios.Tema6;
/*Inicialice la matriz MULTIPLICATION_TABLE como una new int[10][10], llénela con una tabla de multiplicación y luego
 muéstrela en la consola de la siguiente manera:
1 2 3 4 …
2 4 6 8 …
3 6 9 12 …
4 8 12 16 …
…

Los números en cada línea están separados por un espacio.

Requisitos:
•	En el método main, el array MULTIPLICATION_TABLE debe rellenarse con una tabla de multiplicación.
•	El texto mostrado debe contener 10 líneas.
•	Cada línea mostrada debe contener 10 números separados por un espacio.
•	Los números mostrados deben formar una tabla de multiplicación.*/


public class TablaMultiplicar {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //escribe aquí tu código
                                    // i   j
        MULTIPLICATION_TABLE = new int[10][10];

        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {  //recorremos el [i]
            for (int j = 0; j < MULTIPLICATION_TABLE[i].length; j++) { //recorremos [j] en base a [i]
                MULTIPLICATION_TABLE[i][j] = (i + 1) * (j + 1); //asignamos los valores a [i] y [j] con el cálculo
                System.out.print(MULTIPLICATION_TABLE[i][j] + " "); //imprimimos los valores de [i][j]
            }
            System.out.println(); //para salto de linea
        }
    }
}

/*   MI CÓDIGO, MAL POR NO MODIFICAR ELEMENTOS DEL ARRAY, NO SE CAMBIÓ LOS VALORES DEL ARRAY
AL EJECUTAR, SE VE IGUAL EN CONSOLA, PERO NO SE HA MODIFICADO LOS ELEMENTOS DEL ARRAY, PRACTICAR ESTO

public static int[][] MULTIPLICATION_TABLE = new int[10][10];

    public static void main(String[] args) {
        //escribe aquí tu código
         for (int i = 1; i < MULTIPLICATION_TABLE.length + 1; i++) {
            System.out.println("");
            for (int j = 1; j < MULTIPLICATION_TABLE.length + 1; j++) {
                System.out.print(j * i + "\t");
            }
        }
    }
}
Output
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
3 6 9 12 15 18 21 24 27 30
4 8 12 16 20 24 28 32 36 40
5 10 15 20 25 30 35 40 45 50
6 12 18 24 30 36 42 48 54 60
7 14 21 28 35 42 49 56 63 70
8 16 24 32 40 48 56 64 72 80
9 18 27 36 45 54 63 72 81 90
10 20 30 40 50 60 70 80 90 100

*/
