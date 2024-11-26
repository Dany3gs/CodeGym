package Ejercicios.Tema10;

/*Cuatro campos de carácter públicos se declaran en la clase Solution. Se les asignaron algunos valores.

El programa no compila. Necesitas arreglar esto sin cambiar los valores de los caracteres. Todos los campos
son static - esto es necesario para poder acceder a ellos en el método main ().
Puedes ver el resultado ejecutando el método main (). No está involucrado en la prueba.
Requisitos:
•	La primera variable necesita tener asignado el valor '\u004A'.
•	La segunda variable necesita tener asignado el valor 'a'.
•	La tercera variable necesita tener asignado el valor '\u0076'.
•	La cuarta variable necesita tener asignado el valor 'a'.*/

public class CaracteresLiterales {
    public static char first = '\u004A';
    public static char second = 'a';
    public static char third = '\u0076';
    public static char fourth = 'a';

    public static void main(String[] args) {
        System.out.print(first);
        System.out.print(second);
        System.out.print(third);
        System.out.print(fourth);
    }
}

//ok CodeGym