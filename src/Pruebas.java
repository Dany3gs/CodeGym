//Vamos a ver, esto hay que verlo con calma


import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {
        //escribe aquí tu código
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int number = scanner.nextInt();

        do {
            System.out.println(string);
            number--;
        } while (number > 0 && number < 10);
    }
}





