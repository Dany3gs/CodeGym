package Ejercicios.Tema10;

/*
* El método getIndexOfFirstWord(String, String) y el método getIndexOfLastWord(String, String) aceptan ambos una cadena
  y una palabra.

El método getIndexOfFirstWord(String, String) necesita devolver el índice del primer carácter de la primera instancia
de la palabra (el segundo parámetro del método) en la cadena (el primer parámetro del método).
Y el método getIndexOfLastWord(String, String) necesita devolver el índice del primer carácter de la última instancia
de la palabra (el segundo parámetro del método) en la cadena (el primer parámetro del método).

Ejemplo:
La cadena es "To become a programmer, you need to write code. To write code, you have to learn. To learn,
you need desire." La palabra es "code".

El método getIndexOfFirstWord(string, word) debe devolver 42
El método getIndexOfLastWord(string, word) debe devolver 57

El método main() no está involucrado en las pruebas.
Requisitos:
•	Necesitas mostrar el índice del primer carácter de la primera instancia de la palabra (el segundo parámetro
    del método) en la cadena (el primer parámetro del método).
•	Necesitas mostrar el índice del primer carácter de la última instancia de la palabra (el segundo parámetro
    del método) en la cadena (el primer parámetro del método).*/


import java.util.Arrays;
public class BuscarEnUnaCadena {


    public static void main(String[] args) {
        String string = "To become a programmer, you need to write code. To write code, you have to learn. To learn, you need desire.";
        String word = "code";
        int indexOfFirstWord = getIndexOfFirstWord(string, word);
        int indexOfLastWord = getIndexOfLastWord(string, word);
        System.out.println("The index of the first character of the first instance of the word \"" + word + "\" is " + indexOfFirstWord);
        System.out.println("The index of the first character of the last instance of the word \"" + word + "\" is " + indexOfLastWord);
    }

    public static int getIndexOfFirstWord(String string, String word) {
        //escribe aquí tu código
        // Buscamos la posición de la primera aparición de la palabra "code", está en posición 42
       return string.indexOf(word);
    }

    public static int getIndexOfLastWord(String string, String word) {
        //escribe aquí tu código
        // Buscamos la posición de la última aparición de la palabra "code", está en posición 57

        return string.lastIndexOf(word);
    }
}
// Ok CodeGym
// 012345678901234567890123456789012345678901
//------------------------------------------42
// To become a programmer, you need to write code.

//012345678901234567890123456789012345678901234567890123456
//--------------------------------------------------------57
//To become a programmer, you need to write code. To write code,