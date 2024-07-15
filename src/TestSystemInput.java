import java.util.Scanner;

public class TestSystemInput {
    public static void getFinalExamnScore() {
        System.out.println("************************************************");
        System.out.println("***** Conozca la nota final de su Asignatura ***");
        System.out.println("************************************************\n");

        int finalScore = 0;
        int totalCourses;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el total de exámenes: ");
        totalCourses = scanner.nextInt();

        for (int i = 0; i < totalCourses; i++) {
            System.out.println("Entre la nota de cada exámen:  " + (i + 1) + " : ");
                finalScore = finalScore + scanner.nextInt();
            }

            System.out.println("Tu nota final es: " + (finalScore / totalCourses));
            scanner.close();
    }

    public static void main(String[] args) {
        getFinalExamnScore();
    }

}

