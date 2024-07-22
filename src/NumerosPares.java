/*Escribe un programa que use un for loop para mostrar los números pares en el rango de 1 a 15.
Cada valor debe mostrarse en una nueva línea.
Requisitos:
•	El programa debe mostrar texto en pantalla.
•	El programa debe mostrar números pares del 1 al 15. Muestre cada valor en una nueva línea.
•	El programa debe usar un ciclo for.*/


public class NumerosPares {

    public static void main(String[] args) {

        for(int i = 1; i <= 15; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}
// ok en CodeGym

/*Otra forma de sacar los números impares es iterando i +=2
        for(int i = 1; i <= 15; i+= 2) {
                System.out.println(i);
                //output 1 3 5 7 9 11 13 15
* */