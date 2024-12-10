package Ejercicios.Tema10;

/*El método público estático toOctal (int) debe convertir el entero recibido como parámetro de entrada del sistema
  decimal en octal. Y a la inversa, el método público estático toDecimal (int) convierte del sistema octal a decimal.
  Los métodos solo funcionan con números positivos. Si el parámetro de entrada es menor o igual que 0, los métodos
  devuelven 0.

Su tarea es implementar estos métodos.

Un algoritmo para convertir un número decimal en octal es el siguiente:

i es igual a 0
mientras (el número decimal no es 0) {
el número octal = el número octal + (resto de la división del número decimal entre 8) * 10 a la potencia de i
el número decimal = el número decimal / 8
aumentar i en 1
}

Un algoritmo para convertir un número octal en decimal es el siguiente:

i es igual a 0
mientras (el número octal no es 0) {
el número decimal = el número decimal + (resto de la división del número octal entre 10) * 8 a la potencia de i
el número octal = el número octal / 10
aumentar i en 1
}
El método main() no participa en la prueba.

Sugerencia: puede usar el método Math.pow (number, degree) para elevar un número a una potencia.

Requisitos:
•	El método toOctal(int) debe implementarse según lo especificado en las condiciones de la tarea.
•	El método toDecimal(int) debe implementarse según lo especificado en las condiciones de la tarea.
•	Los métodos Integer.toOctalString(int) y Long.toOctalString(int) no se pueden usar.
•	Los métodos Integer.parseInt(String, int) y Long.parseLong(String, int) no se pueden usar.
•	Los métodos Integer.toString(int, int) y Long.toString(long, int) no se pueden usar.
•	No se puede usar un objeto BigInteger.
•	No se puede usar un objeto BigDecimal.*/

public class ConvertirOctal {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Decimal number " + decimalNumber + " is equal to octal number " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Octal number " + octalNumber + " is equal to decimal number " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //escribe aquí tu código
        if (decimalNumber <= 0) { // como indicado en el ejercicio
            return 0;
        }

        int octalNumber = 0; //iniciamos el número octal en 0 para ir sumandole los restos
        int i = 0;

        while (decimalNumber != 0){// 1vuelta = 21. 2vuelta = 2
            int resto = decimalNumber % 8; //creamos variable para acumular los restos del valor inicial 21 5 8,
            // en primera vuelta da 5, en segunda 2 % 8 = 2 por que a % b = a
            octalNumber += resto * Math.pow(10, i); //se asigna resto a octalNumber y como i vale 0, el resto se mantiene en 5
            //en segunda vuelta, octalNumber vale 5 + (2*10) = ****25****
            decimalNumber /= 8; //21/8 da 2 redondeado, pasa decimalNumber a valer 2, empieza 2 vuelta en 2 y en segunda
            // vuelta, 2/8 redondea a 0, saliendo del bucle.
            i++;
        }

        return octalNumer;
    }

    public static int toDecimal(int octalNumber) {
        //escribe aquí tu código
        if (octalNumber <= 0) {
            return 0;
        }

        int decimalNumber = 0;
        int i = 0;

        while (octalNumber != 0) {
            int resto = octalNumber % 10;
            decimalNumber += resto * Math.pow(8, i);
            octalNumber /= 10;
            i++;
        }

        return decimalNumber;
    }
}
// Ok Codegym