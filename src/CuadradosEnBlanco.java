/*La parte no rellena consiste en espacios en blanco.

Ejemplo de salida:
BBBBBBBBBBBBBBBBBBBB
B                  B
B                  B
B                  B
B                  B
B                  B
B                  B
B                  B
B                  B
B                  B
BBBBBBBBBBBBBBBBBBBB
Requisitos:
•	El programa debe mostrar texto en pantalla.
•	El programa debe dibujar el contorno de un rectángulo con una altura de 10 y una anchura de 20, formado por la letra 'B'.
•	El programa debe usar ciclos while anidados (un bucle en un bucle).
•	La salida de la pantalla debe realizarse en un ciclo while.*/

public class CuadradosEnBlanco {
    public static void main(String[] args) {

    int outer = 0;

        while (outer < 1) {
            System.out.println("BBBBBBBBBBBBBBBBBBBB");

        int inner = 0;

             while (inner < 8) {

            System.out.println("B                  B");
            inner++;
        }
        outer++;
            System.out.println("BBBBBBBBBBBBBBBBBBBB");
    }
  }
}

//Ok en CodeGym