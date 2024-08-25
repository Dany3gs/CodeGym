package Ejercicios;
/*En el main(String[]) método, muestre todos los números en el multiArray de tres dimensiones.

Requisitos:
•	La clase Solution debe tener una variable multiArray int[][][] static y public.
•	En el método main (String []), muestra todos los números en multiArray.*/

public class Pruebas {

    public static int[][] multiArray = new int[][]{{0, 8, 15, 29, 393}, {10, 20,}};


    public static void main(String[] args) {
        //escribe aquí tu código

        if (multiArray[0][0] >= 0) {
            for (int i = 0; i < multiArray.length; i++) {
                for (int j = 0; j < multiArray[i].length; j++) {
                    System.out.println("Elemento en fila " + i + " columna " + j + " = " + multiArray[i][j]);
                }
            }
        }
    }
}








