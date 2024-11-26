package Ejercicios.Tema9;

/*Corregir el método main() para que muestre el número 20 en la consola.
En el método, solo puedes cambiar post-incremento a pre incremento y viceversa, así como post-decremento
a pre incremento y viceversa.
Requisitos:
•	Corrija el método main() según la condición.*/

public class Incrementos {
    public static void main(String[] args) {
        int a = 3;
        //      4   +   4  *  4
        int b = ++a + (a-- * ++a);
        System.out.println(b);
    }
}
//ok CodeGym
