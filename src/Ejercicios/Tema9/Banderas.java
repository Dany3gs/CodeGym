package Ejercicios.Tema9;

/*Implementar métodos:

setFlag(int number, int flagPos) : establece el valor “1” en el bit bajo el índice flagPos del número número
y devuelve el nuevo valor.
resetFlag(int number, int flagPos) : establece el bit bajo el índice flagPos en "0" del número número y devuelve
el nuevo valor.
checkFlag(int number, int flagPos) - verifica el valor del bit bajo el índice flagPos del número número y devuelve
 verdadero si el valor es "1" y falso si es "0".
Requisitos:
Implemente el método setFlag(int, int) según la condición.
Implemente el método resetFlag(int, int) según la condición.
Implemente el método checkFlag(int, int) según la condición.*/

public class Banderas {
    public static int setFlag(int number, int flagPos) {
        //escribe aquí tu código
        //numero es donde está el número cuyo bit se establecerá en 1. Y flagPos es la posición del bit a establecer a 1
        int i = number | 1 << flagPos;
        return i;
    }

    public static int resetFlag(int number, int flagPos) {
        //escribe aquí tu código
        //lo mismo pero reestablecemos de 1 a 0
        int i = number & ~(1 << flagPos);
        return i;
    }

    public static boolean checkFlag(int number, int flagPos) {
        //escribe aquí tu código
        //comprobamos que el bit sea igual al de la posición
        boolean i = (number & (1 << flagPos)) == (1 << flagPos);

        return i;
    }
}
// Ok CodeGym
