
import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {
        //escribe aquí tu código
        Scanner scanner = new Scanner(System.in);
        int x = 5;
        int y = 3;
        double div = x / y;
        int res = (int) Math.floor(div);
        int res1 = (int) Math.ceil(div);
        int res2 = (int) Math.round(div);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(div);
    }
}





