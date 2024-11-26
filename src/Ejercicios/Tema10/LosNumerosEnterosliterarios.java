package Ejercicios.Tema10;

/*Cuatro campos públicos, correspondientes a los cuatro tipos de enteros, se declaran en la clase Solution.
Cuando se declaran, estos campos se inicializan con varios valores almacenados en literales de tipo entero.

Pero el programa no compila y debes arreglarlo. Para hacerlo, realiza los menos cambios posibles en los valores de
los campos para que el tipo de cada variable coincida con el tipo del literal de tipo entero.
Solo puedes cambiar la signatura y el tipo de cada literal, no los dígitos ni su orden.
Requisitos:
•	Cambia la literal usada para inicializar el campo b de acuerdo con las condiciones de la tarea.
•	Cambia la literal usada para inicializar el campo s de acuerdo con las condiciones de la tarea.
•	Cambia la literal usada para inicializar el campo i de acuerdo con las condiciones de la tarea.
•	Cambia la literal usada para inicializar el campo l de acuerdo con las condiciones de la tarea.

    public byte b = 128;
    public short s = 32768;
    public int i = 1_234_567_890L;
    public long l = 2_345_678_900;

*/

public class LosNumerosEnterosliterarios {
    public byte b = (byte) 128;
    public short s = (short) 32768;
    public int i = (int) 1_234_567_890L;
    public long l = 2_345_678_900L;
}

