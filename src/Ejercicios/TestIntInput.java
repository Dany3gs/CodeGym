package Ejercicios;

import java.util.Scanner;

//ejemplo de como escanear y analizar entrada de texto y marcar los int con un sout

public class TestIntInput {

    //creamos un método
    public static void checkInt(String testData) {

        System.out.println(testData);

        Scanner scanner = new Scanner(testData);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {              //\t\t es para que imprima tabulado
                System.out.println(scanner.nextInt() + "\t\t numero encontrado.");
            } else {
                System.out.println(scanner.next() + "\t\t");
            }
        }
        scanner.close();
        System.out.println();

    }


    public static void main(String[] args) {

        String testData1 = "My 3 years old cat Diana, just gave birth to 5 healthy babies.";
        String testData2 = "The number 1 place to learn Java is CodeGym!";
        // para reconocer los números tienen que estar separados por espacio, 6 y 3 no cumple
        String testData3 = "6; 5 4 3. 2 1 !";

        checkInt(testData1);
        checkInt(testData2);
        checkInt(testData3);
    }

}
