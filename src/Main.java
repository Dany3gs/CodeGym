
import java.util.Scanner;

//Integer.parseInt(); con este método convertimos una cadena String en un int


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("uno,dos,tres, en un pais de la mancha " +
                "que no me quiero acordar, donde vivia" +
                "una especie de animal, peludo y feo,");
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        scanner.close();

    }
}