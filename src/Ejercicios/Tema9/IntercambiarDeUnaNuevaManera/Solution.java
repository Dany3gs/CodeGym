package Ejercicios.Tema9.IntercambiarDeUnaNuevaManera;

public class Solution {
    public static void main(String[] args) {
        /* Expected output
        x=4, y=5
        x=5, y=4
         */

        Pair pair = new Pair(4, 5);
        System.out.println(pair);
        pair.swap();
        System.out.println(pair);
    }
}