package Ejercicios.Tema10;

/*El método público estático toBinary (int) debe convertir el número entero recibido como parámetro de entrada del
sistema de numeración decimal al sistema binario y devolver su representación en forma de cadena. Y a la inversa,
el método público estático toDecimal (String) convierte la representación en forma de cadena de un número binario
en un número decimal.

Los métodos solo funcionan con números positivos y cadenas no vacías.
Si el parámetro de entrada es menor o igual que 0, el método toBinary (int) devuelve una cadena vacía.
Si el parámetro de entrada es una cadena vacía o nulo, el método toDecimal (String) devuelve 0.

Tu tarea es implementar estos métodos.

Un algoritmo para convertir un número decimal en la representación en forma de cadena de un número binario es el siguiente:

mientras (el número decimal no es 0) {
la representación binaria = el resto de la división del número decimal por 2 + la representación binaria
el número decimal = el número decimal / 2
}
Un algoritmo para convertir la representación en forma de cadena de un número binario en un número decimal es el siguiente:

for (int i = 0; i < length of the binary representation; i++) {
el número decimal = el número decimal + dígito en la representación binaria * 2 a la potencia de i
}
Inicialmente, se toma el número de la derecha de la representación binaria.
Con cada iteración del ciclo, tomamos el próximo número más cercano al comienzo de la representación binaria.
Sugerencia: Puede usar el método Math.pow (number, degree) para elevar un número a una potencia.
El método main () no está involucrado en la prueba.

Requisitos:
•	El método toBinary(int) debe implementarse según lo establecido en las condiciones de la tarea.
•	El método toDecimal(String) debe implementarse según lo establecido en las condiciones de la tarea.
•	Los métodos Integer.toBinaryString(int) y Long.toBinaryString(int) no se pueden usar.
•	Los métodos Integer.parseInt(String, int) y Long.parseLong(String, int) no se pueden usar.
•	Los métodos Integer.toString(int, int) y Long.toString(long, int) no se pueden usar.
•	No se puede usar un objeto BigInteger.
•	No se puede usar un objeto BigDecimal*/

public class ConvertidorBinario {

    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Decimal number " + decimalNumber + " is equal to binary number " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Binary number " + binaryNumber + " is equal to decimal number " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        //escribe aquí tu código
        if (decimalNumber <= 0) {

            return "";
        }

        String binary = "";

        while (decimalNumber != 0){
            int remainder = decimalNumber % 2;
            binary = remainder + binary;
            decimalNumber /= 2;
        }

        return binary;
    }

    public static int toDecimal(String binaryNumber)  {
        //escribe aquí tu código
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return 0;
        }
        int decimalNumber = 0;
        int length = binaryNumber.length();

        // Iterar sobre cada bit del número binario
        for (int i = 0; i < length; i++) {
            // Obtener el carácter en la posición actual
            char bit = binaryNumber.charAt(length - i - 1); // Se procesa de derecha a izquierda
            if (bit == '1') {
                // Agregar el valor posicional del bit
                decimalNumber += (int) Math.pow(2, i);
            } else if (bit != '0') {
                // Manejar caracteres no binarios
                throw new IllegalArgumentException("El número binario contiene caracteres inválidos: " + bit);
            }
        }
        return decimalNumber;
    }
}
// ok Codegym