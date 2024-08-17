package Ejercicios.ChatGpt;

/*Ejercicio 1: Tabla de Suma
Crea un programa que genere una tabla de suma, similar a la tabla de multiplicación, pero que en lugar de multiplicar
los números, los sume. Por ejemplo, SUM_TABLE[i][j] = (i + 1) + (j + 1).*/

public class TablaDeSuma {

    public static void main(String[] args) {

        int[][] SUM_TABLE = new int[10][10];

        for (int i = 0; i < SUM_TABLE.length; i++) {
            for (int j = 0; j < SUM_TABLE[i].length; j++) {
                SUM_TABLE[i][j] = (i + 1) + (j + 1);
                System.out.print(SUM_TABLE[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


//ok, valor mínimo correcto.