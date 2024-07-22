
import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] names = {"Dani", "Edu", "Yure", "Helen"};
        for (String name : names) {

            if (name.equals("Edu")){

               continue;
            }
            System.out.println(name + " hola!");
        }

    }
}





