package Ejercicios.Tema10;

/*
El método público estático toHex (String) debe convertir la representación de cadena de un número binario,
recibido como parámetro de entrada, del sistema binario numeral al hexadecimal y devolver su representación de cadena.
Y, por el contrario, el método público estático toBinary (String) convierte la representación de cadena de un número
hexadecimal a la representación de cadena de un número binario.

Los métodos solo funcionan con cadenas no vacías.
Si el parámetro de entrada es una cadena vacía o nula, entonces ambos métodos devuelven una cadena vacía.
Si el parámetro de entrada del método toHex (String) contiene cualquier carácter que no sea 0 o 1, entonces el método
devuelve una cadena vacía.
Si el parámetro de entrada del método toBinary (String) contiene cualquier carácter que no
sea dígitos del 0 al 9 o letras minúsculas del alfabeto latino a a f, entonces el método devuelve una cadena vacía.

Su tarea es implementar estos métodos.

Un algoritmo para convertir la representación de cadena de un número binario a la representación de cadena de un número
hexadecimal es el siguiente:

Comprobamos la longitud de la cadena recibida como parámetro de entrada. Debe ser múltiplo de 4.
Si no es así, entonces añadimos los 0 necesarios al comienzo de la cadena.
Tomamos cada cuatro caracteres (bits) y comprobamos a qué carácter hexadecimal corresponden.
Por ejemplo:

la representación binaria es "100111010000", donde "1001" es "9", "1101" es "d", y "0000" - "0"
la representación hexadecimal es "9d0".
Un algoritmo para convertir la representación de cadena de un número hexadecimal a la representación de cadena de un
número binario es el siguiente:
Tomamos cada carácter y comprobamos a qué número binario (4 bits) corresponde.

Por ejemplo:

la representación hexadecimal es "9d0", donde "9" es "1001", "d" es "1101", y "0" es "0000"
la representación binaria es "1001 1101 0000".
El método main() no está involucrado en la prueba.

Requisitos:
•	El método toHex(String) debe implementarse según lo especificado en las condiciones de la tarea.
•	El método toBinary(String) debe implementarse según lo especificado en las condiciones de la tarea.
•	Los métodos Integer.toBinaryString(int) y Long.toBinaryString(int) no se pueden usar.
•	Los métodos Integer.toHexString(int) y Long.toHexString(int) no se pueden usar.
•	Los métodos Integer.parseInt(String, int) y Long.parseLong(String, int) no se pueden usar.
•	Los métodos Integer.toString(int, int) y Long.toString(long, int) no se pueden usar.
•	No se puede usar un objeto BigInteger.
•	No se puede usar un objeto BigDecim*/

public class BinarioAHexadecimal {
	
	public static void main(String[] args) {
		String binaryNumber = "100111010000";
		System.out.println("Binary number " + binaryNumber + " is equal to hexadecimal number " + toHex(binaryNumber));
		String hexNumber = "9d0";
		System.out.println("Hexadecimal number " + hexNumber + " is equal to binary number " + toBinary(hexNumber));
	}
	
	public static String toHex(String binaryNumber) {
		//escribe aquí tu código
		
		// Verifica si la entrada es nula o vacía.
		if (binaryNumber == null || binaryNumber.isEmpty()) {
			return "";
		}
		
		// Añade ceros a la izquierda para que la longitud sea múltiplo de 4
		while (binaryNumber.length() % 4 != 0) {
			binaryNumber = "0" + binaryNumber;
		}
		
		// Crea un StringBuilder llamado 'hexadecimal' para construir el resultado.
		StringBuilder hexadecimal = new StringBuilder();
		String digitos = "0123456789ABCDEF";
		
		// Usa un bucle for para procesar grupos de 4 bits
		for (int i = 0; i < binaryNumber.length(); i += 4) {
			String grupo = binaryNumber.substring(i, i + 4); // substring(desde, hasta(excluido) + 4) extrae un grupo de 4 bits.
			
			// Convierte el grupo a su valor decimal.
			/**
			 * Cuando se escribe grupo.charAt(j) - '0', lo que realmente está sucediendo es:
			 * Obtener el valor ASCII: grupo.charAt(j) obtiene el carácter en la posición j del String grupo.
			 * Si este carácter es '1', su valor ASCII es 49.
			 * Restar el valor ASCII de '0': Al restar el valor ASCII de '0' (que es 48), se obtiene el valor numérico:
			 * Para '0': 48−48=0
			 * Para '1': 49−48=1
			 * */
			int valor = 0;
			for (int j = 0; j < 4; j++) {
				valor = valor * 2 + (grupo.charAt(j) - '0');
			}
			hexadecimal.append(digitos.charAt(valor)); // append() añade el dígito hexadecimal correspondiente al StringBuilder.
		}
		
		// Retorna el resultado como String usando toString().
		return hexadecimal.toString();
	}
	
	public static String toBinary(String hexNumber) {
		//código según codeGym
		
		// Verifica si la entrada es nula.
		String binaryNumber = "";
		if (hexNumber == null) {
			return binaryNumber;
		}
		
		// Crea un StringBuilder llamado 'result'.
		StringBuilder result = new StringBuilder();
		
		// Recorre cada carácter del número hexadecimal:
		for (int i = 0; i < hexNumber.length(); i++) {
			
			// Usa una serie de if-else para mapear cada dígito hex a su equivalente binario.
			String element;
			if (hexNumber.charAt(i) == '0') {
				element = "0000";
			} else if (hexNumber.charAt(i) == '1') {
				element = "0001";
			} else if (hexNumber.charAt(i) == '2') {
				element = "0010";
			} else if (hexNumber.charAt(i) == '3') {
				element = "0011";
			} else if (hexNumber.charAt(i) == '4') {
				element = "0100";
			} else if (hexNumber.charAt(i) == '5') {
				element = "0101";
			} else if (hexNumber.charAt(i) == '6') {
				element = "0110";
			} else if (hexNumber.charAt(i) == '7') {
				element = "0111";
			} else if (hexNumber.charAt(i) == '8') {
				element = "1000";
			} else if (hexNumber.charAt(i) == '9') {
				element = "1001";
			} else if (hexNumber.charAt(i) == 'a') {
				element = "1010";
			} else if (hexNumber.charAt(i) == 'b') {
				element = "1011";
			} else if (hexNumber.charAt(i) == 'c') {
				element = "1100";
			} else if (hexNumber.charAt(i) == 'd') {
				element = "1101";
			} else if (hexNumber.charAt(i) == 'e') {
				element = "1110";
			} else if (hexNumber.charAt(i) == 'f') {
				element = "1111";
			} else {
				// Si encuentra un carácter inválido, usa setLength(0) para vaciar el StringBuilder.
				result.setLength(0);
				;
				break;
			}
			result.append(element); // append() añade el equivalente binario al StringBuilder
		}
		
		// Retorna el resultado como String usando toString().
		return result.toString();
	}
}

/**
 * @Note
 * StringBuilder:
 * Es una clase mutable para manipular cadenas de forma eficiente.
 * Permite modificar su contenido sin crear nuevos objetos String
 
 * substring(int beginIndex, int endIndex):
 * Extrae una subcadena de un String.
 * Comienza en beginIndex (inclusive) y termina en endIndex (exclusive).
 
 * append(String str):
 * Añade una cadena al final del StringBuilder.
 
 * setLength(int newLength):
 * Establece la longitud del StringBuilder.
 * Si newLength es 0, efectivamente vacía el StringBuilder.
 */


