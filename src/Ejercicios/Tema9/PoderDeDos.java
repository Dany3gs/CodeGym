package Ejercicios.Tema9;

/*Implemente el método getPowerOfTwo(int power) , que devuelve el número 2 a la potencia de potencia.
Debe cambiar la implementación del método getPowerOfTwo(int) utilizando el desplazamiento de bits apropiado.
Requisitos:
El método getPowerOfTwo(int) debe devolver la potencia de dos.
El método getPowerOfTwo(int) debe utilizar el operador de desplazamiento a la izquierda bit a bit.*/

public class PoderDeDos {

    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(3));
    }

    public static int getPowerOfTwo(int power) {
        int result = 2;
        for(int i = 0; i < power - 1; i++) {
            result = result << 1; // estaba result *= 2, solo es indicar el movimiento de bits, 1 equivale al cuadrado de result
        }
        return result;
    }
}
//Ok CodeGym
