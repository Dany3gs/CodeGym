//Vamos a ver, esto hay que verlo con calma


import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {
        //escribe aquí tu código
        Scanner sc = new Scanner(System.in);
        int numMin1 = Integer.MAX_VALUE;
        int numMin2 = Integer.MAX_VALUE;

        while (sc.hasNextInt()) {
            int num = sc.nextInt();

            if (num < numMin1) {
                numMin1 = numMin2;
                numMin2 = num;
            } else if (numMin2 < num) {
                numMin1 = numMin2;
            }

        }
        System.out.println(numMin2);
    }
}





