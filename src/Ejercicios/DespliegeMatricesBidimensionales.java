package Ejercicios;

/*Implemente el main (String []) método, que muestra las matrices de cadenas e int en la consola utilizando el
 Arrays.deepToString (Object [] []) método.

Requisitos:
•	La clase Solution debe tener una variable strings public y static de tipo String[][].
•	La clase Solution debe tener una variable ints public y static de tipo int[][].
•	En el método main(String[]), muestre en pantalla la matriz strings mediante el método Arrays.deepToString(Object[][]).
•	En el método main(String[]), muestre en pantalla la matriz ints mediante el método Arrays.deepToString(Object[][]).*/

import java.util.Arrays;

public class DespliegeMatricesBidimensionales {

    public static String[][] strings = new String[][]{{"🙂", "🙂", "🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"}, {"😋", "😋", "😋", "😋"}, {"😎", "😎", "😎", "😎"}};
    public static int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    public static void main(String[] args) {
        //escribe aquí tu código

        System.out.println(Arrays.deepToString(strings));
        System.out.println(Arrays.deepToString(ints));

    }
}
//ok CodeGym