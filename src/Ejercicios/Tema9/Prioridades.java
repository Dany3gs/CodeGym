package Ejercicios.Tema9;

/*Realice correcciones en el método main() para que muestre el número 12 en la consola.
Requisitos:
•	En el método main(), coloque un par de paréntesis para que se muestre en la consola el número 12.
    No cambie el resto del código.
•	El método main() debería imprimir el número 12.*/

public class Prioridades {
    public static void main(String[] args) {
        int number = 2;
        //                     2 +   2    *  ( 2     +   3 ) = 5
        System.out.println(number + number * (number + ++number)); // output 12
    }
}
