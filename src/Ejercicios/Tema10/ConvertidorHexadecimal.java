package Ejercicios.Tema10;

/*El método toHex(String) debe convertir el entero recibido como parámetro de entrada del
sistema decimal a hexadecimal y devolver su representación en forma de cadena.
Y viceversa, el método toDecimal(String) convierte la representación en forma de cadena de
un número hexadecimal a la representación en forma de cadena de un número decimal.

Los métodos solo funcionan con números positivos y cadenas no vacías.
Si el parámetro de entrada es menor o igual que 0, el método toHex(int) devuelve una cadena vacía.
Si el parámetro de entrada es una cadena vacía o null, entonces el método toDecimal(String) devuelve 0.
Tu tarea es implementar estos métodos.

Además, la clase Solution tiene una constante HEX, que contiene todos los caracteres utilizados en
el sistema hexadecimal.

Un algoritmo para convertir un número decimal a hexadecimal es el siguiente:

mientras (el número decimal no es 0) {
la representación hexadecimal = el carácter en la cadena HEX que tiene un índice igual al residuo
del número decimal dividido entre 16
+ la representación hexadecimal del número
el número decimal = el número decimal / 16
}
Un algoritmo para convertir un número hexadecimal a decimal es el siguiente:

para (int i = 0; i < longitud de la cadena de entrada; i++) {
el número decimal = 16 * el número decimal + el índice del carácter en la cadena HEX que es igual
al carácter en la cadena de entrada en el índice i
}
El método main() no está involucrado en la prueba.
Requisitos:
•	El método toHex(int) debe implementarse según lo establecido en las condiciones de la tarea.
•	El método toDecimal(String) debe implementarse según lo establecido en las condiciones de la tarea.
•	Los métodos Integer.toHexString(int) y Long.toHexString(int) no pueden usarse.
•	Los métodos Integer.parseInt(String, int) y Long.parseLong(String, int) no pueden usarse.
•	No se pueden usar los métodos Integer.toString(int, int) y Long.toString(long, int).
•	No se puede usar un objeto BigInteger.
•	No se puede usar un objeto BigDecimal.*/

public class ConvertidorHexadecimal {

    // Tenemos que recorrer los caracteres de HEX para obtener el valor, contando que su length en 16
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Decimal number " + decimalNumber + " is equal to hexadecimal number " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to decimal number " + toDecimal(hexNumber));
    }

    /**
     * Si el número es 0 o negativo, devuelve una cadena vacía.
     * Usa un bucle while para convertir el número decimal a hexadecimal:
     * Calcula el resto de la división por 16.
     * Obtiene el carácter hexadecimal correspondiente de la cadena HEX.
     * Añade este carácter al inicio de la cadena hexadecimal.
     * Divide el número decimal por 16.*/

    public static String toHex(int decimalNumber) {
        //escribe aquí tu código
        if (decimalNumber <= 0){
            return "";
        }
        String hexadecimal = "";
        while (decimalNumber != 0) {
            // Buscamos el resto del número indicado hasta 0 con % 16
            int resto = decimalNumber % 16;
            hexadecimal = HEX.charAt(resto) + hexadecimal;
            decimalNumber /= 16;
        }
        return hexadecimal;
    }

    /**
     * Si la cadena es nula o vacía, devuelve 0.
     * Recorre cada carácter de la cadena hexadecimal:
     * Convierte el carácter a minúscula.
     * Encuentra su valor decimal usando su índice en la cadena HEX.
     * Multiplica el resultado acumulado por 16 y suma el nuevo valor.*/
    public static int toDecimal(String hexNumber) {
        //escribe aquí tu código
        if (hexNumber == null || hexNumber.isEmpty()) {
            return 0;
        }
        int hexadecimal = 0;

        for (int i = 0; i < hexNumber.length(); i++) {
            char hexChar = hexNumber.toLowerCase().charAt(i);
            int digitValue = HEX.indexOf(hexChar);
            hexadecimal = hexadecimal * 16 + digitValue;
        }

        return hexadecimal;
    }
}

//Ok Codegym

