package Ejercicios.Tema6;
//ejemplo de for each anidado un bucle que itera una matriz bidimensional

public class ForEachAnidados {

    public static void main(String[] args) {

        int[][] mainArray = {{5, 4, 3, 2, 1}, {7, 8, 9, 10, 11}};
        //este int [] apunta al primer bloque del array

        for (int[] myArray : mainArray) {   // i apunta al segundo bloque del array
            for (int i : myArray) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
//output 5 4 3 2 1
//       7 8 9 10 11