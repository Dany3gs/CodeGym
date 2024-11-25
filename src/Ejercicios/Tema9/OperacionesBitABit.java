package Ejercicios.Tema9;

/*
Comente las líneas de código innecesarias para que el número 5 se muestre en la pantalla.
Nota: Solo es necesario comentar dos líneas.
Requisitos:
•	El programa debe mostrar el número 5.
•	No puedes cambiar la línea que declara la variable x.
•	No puedes cambiar el cuerpo del método main (String[]), solo puedes comentar ciertas 2 líneas.*/

public class OperacionesBitABit {
    public static void main(String[] args) {
        int x = 7; // en binario 0111
        //x = x & 25;
        x = x & 5; //
        //si coinciden 1 se pone 1, si no 0, 0111(7) & 0101(5) con & se queda 0101 (5)
        //x = x & 3;
        x = x & 12;
        // x= 5 0101 y 12 es 1100 = 0100( 4 ) x = 4
        x = x | 1;
        // con |, si hay un 1, se pone 1, si no 0, x = 0100 y 1 = 0001 => da 0101 que es 5
        System.out.println(x);
    }
}
//ok CodeGym