
/*Para resolver este problema, necesita:

Leer un entero positivo radio desde el teclado. Esto representa el radio de un círculo.
Muestra el área del círculo, calculada usando esta fórmula: Area = pi * radio * radio.
El resultado debe ser un entero (int type). Para hacer esto, debe convertir el resultado de la multiplicación en un
int (descartar la parte fraccionaria, redondeando hacia abajo a un número entero). el método para hacer esto me funcionó
creando una variable nueva areaInt con la conversation, resultado; int areaInt = (int)(area) cambia area a int!
Use 3.14 como valor para pi.

Aclaración:
Si se introduce un número negativo, no muestre nada en pantalla.

Ejemplo de entrada:
5

Ejemplo de salida:
78
Requisitos:
•	El programa deberá leer un entero del teclado.
•	El programa deberá mostrar un número en pantalla.
•	El programa deberá mostrar el área del círculo con un radio igual al de la variable radio. El área se deberá
    convertir a un entero.*/

import java.util.Scanner;

public class AreaCiruclo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int radio;
        radio = sc.nextInt();
        double area = 3.14 * radio * radio;
        int areaInt = (int)(area);
        if (radio < 0){
            System.out.println();

        }else {
            System.out.println(areaInt);
        }

    }
}
// ok CodeGym