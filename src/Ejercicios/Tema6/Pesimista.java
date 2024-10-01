package Ejercicios.Tema6;/*En el método main() hay una variable double vaso = 0,5 , que simboliza un vaso medio lleno. Para un pesimista está
medio vacío y para un optimista está medio lleno.
Es necesario leer datos de tipo boolean desde el teclado usando el método nextBoolean() de un objeto de tipo Scanner.
Dependiendo de los datos recibidos, redondee la variable de vidrio: a un número entero hacia abajo (0), si el pesimista
(false) y hasta un número entero up (1 ), si es optimista (true).
Muestra el resultado en la pantalla.

Ejemplo de entrada:
true

Resultado de ejemplo:
1

Pista:
Para redondear un número real a un número entero, utilice el método Math.floor() , para redondear hacia arriba,
el método Math.ceil() .

Requisitos:
•	El programa debe leer datos booleanos del teclado.
•	El programa debería mostrar un número entero en la pantalla según la condición.
•	El programa debe utilizar el método Math.floor().
•	El programa debe utilizar el método Math.ceil().*/

import java.util.Scanner;

public class Pesimista {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        double glass = 0.5;
        int glassFalse;
        int glassTrue;
        boolean pesimista = false;
        boolean state;

        state = sc.nextBoolean();
        if (state == pesimista) {
            glassFalse = (int) (Math.floor(glass));
            System.out.println(glassFalse);
        } else {
            glassTrue = (int) (Math.ceil(glass));
            System.out.println(glassTrue);
        }
    }
}
//Ok CodeGym