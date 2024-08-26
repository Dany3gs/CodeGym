package Ejercicios;

/*Arregle la lógica del método main(String[]). Debe mostrar true si arrayFirst es el mismo que arraySecond. De lo
contrario, debe devolver false.

Requisitos:
•	Si arrayFirst es igual a arraySecond, entonces main (String[]) muestra true en la consola.
•	Si arrayFirst no es igual a arraySecond, entonces main (String[]) muestra false en la consola.*/

import java.util.Arrays;

public class CompararMatricesBidimensionales {

    public static int[][] arrayFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    public static int[][] arraySecond = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    public static void main(String[] args) {
        System.out.println(Arrays.deepEquals(arrayFirst, arraySecond));
    }
}
//ok CodeGym
