/*Escribamos un programa que dibuje un triángulo en la pantalla. La primera línea consta de 10asteriscos, la segunda — 9asteriscos, luego 8, etc.
*
*  for (int i = 0; i < 10; i++){
            int startCounter = 10 - i;
            for (int j = 0; j < startCounter; j++) {
                System.out.print("*");

            } System.out.println();
**********
*********
********
*******
******
*****
****
***
**
*
*
Usemos un for ciclo para mostrar un triángulo rectángulo formado por los números ocho con lados (piernas) de 10 y 10.
En otras palabras, la primera línea debe contener un 8, formando el lado izquierdo. La segunda línea debería tener dos 8, etcétera.

*
*

Ejemplo de salida en pantalla:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888

Requisitos:
•	El programa debería mostrar números en la pantalla.
•	El programa debería mostrar un triángulo rectángulo compuesto por números ocho con lados 10 y 10.
•	El programa debe usar un ciclo for.
•	La salida de pantalla debería suceder en un ciclo for
* */

public class DibujarPantalla {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            int startCounter = 1 + i;
            for (int j = 0; j < startCounter; j++) {
                System.out.print("8");

            } System.out.println();
        }
    }
}
//oK CodeGym
