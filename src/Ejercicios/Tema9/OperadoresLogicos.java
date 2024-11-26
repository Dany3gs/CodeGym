package Ejercicios.Tema9;

/*Realice correcciones en el método taskForCondition() para que muestre el número 30 en la consola.
Solo se pueden cambiar los operadores lógicos: && a & y || a |.
Requisitos:
•	El método taskForCondition() necesita generar el número 30.
•	En el método taskForCondition(), no cambie nada excepto los operadores lógicos.*/

public class OperadoresLogicos {
    public static void main(String[] args) {
        taskForCondition();
    }

    public static void taskForCondition() {
        int number = 15;
        boolean firstCondition = number < 15 & number > 25 & (number += 15) < 25; //solo cambiamos && por &
        boolean secondCondition = (number & 5) > 12 && (number = number + 2) > 40;
        System.out.println(number);
    }
}
//ok Codegym