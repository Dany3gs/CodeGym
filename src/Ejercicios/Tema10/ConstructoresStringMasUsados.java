package Ejercicios.Tema10;

import java.util.Arrays;
import java.util.Scanner;

public class ConstructoresStringMasUsados {
	
	public static void main(String[] args) {
		
		String nombre = "Métodos constructores más usados con la clase String.";
		//-------------------------------------------------------------------------//
		// int length
		// Devuelve el número de caracteres de la cadena.
		System.out.println(nombre.length()); // output 53
		
		//-------------------------------------------------------------------------//
		// boolean isEmpty()
		// Comprueba si la cadena es una cadena vacía
		System.out.println(nombre.isEmpty()); // false
		
		//-------------------------------------------------------------------------//
		// boolean isBlank()
		// Comprueba que la cadena contiene "solo" caracteres de espacio en blanco: espacio, tabulador, nueva línea, etc.
		System.out.println(nombre.isBlank()); // false
		
		//-------------------------------------------------------------------------//
		// char chasrAt(int index) -> hay que pasarle un valor int para ir a la posición de elemento
		// Devuelve el carácter en la posición de índice en la cadena.
		System.out.println(nombre.charAt(3)); // output o (tercer elemento)
		
		//-------------------------------------------------------------------------//
		// char[] toCharArray
		// Devuelve una matriz de los caracteres (una copia) que componen la cadena
		char[] nombreComoArray = nombre.toCharArray();
		System.out.println(nombreComoArray.length);
		for(char c : nombreComoArray) {
			System.out.print(c);
		}
		System.out.println(" ");
		
		//-------------------------------------------------------------------------//
		// byte[] getBytes()
		// Convierte una cadena en un conjunto de bytes y devuelve la matriz de bytes
		byte[] nombreBytes = nombre.getBytes();
		System.out.println(nombreBytes.length);
		for(byte b : nombreBytes) {
			//"%02x " es el especificador para convertir a hexadecimal, rellenando con ceros a la izq si hace falta.
			System.out.printf("%02x ", b);
		}
		System.out.println(" ");
		System.out.println(Arrays.toString(nombreBytes)); // output array de valores binarios de cada char en charset UTF-8
		
		//-------------------------------------------------------------------------//
		// String[] split(String regex)
		// Divide una cadena en varias subcadenas según indiquemos en la expresión regular.
		String[] nombreSplit = nombre.split(" ");
		System.out.println(nombreSplit.length); // output 8, las palabras que componen nombre
		
		// Si queremos imprimir la cadena dividida, por ejemplo por un espacio, podemos usar split en la variable nombre
		// o en la variable nombreSplit modificando el foreach, indicando en la impresión la separación de split
		for(String s : nombre.split(" ")) {
			System.out.print("[" + s + "]");
		}
		System.out.println("\n------");
		
		for(String s : nombreSplit) {
			System.out.print(Arrays.toString(s.split(" ")));
		}
		
		//-------------------------------------------------------------------------//
		// String join(CharSequence delimiter, elements)
		// Une varias subcadenas juntas
		
		// Creamos la variable de tipo String que queremos añadir para indicar en el join.
		String nombreJoin = "Esta frase es para unir a nombre.";
		System.out.println("\n------");
		
		// Usamos sobre la variable que queremos ampliar el método String.join( con que lo queremos delimitar, 1variable
		// + 2Variable.
		nombre = String.join(" ", nombre, nombreJoin);
		System.out.println(nombre); // Output Métodos constructores más usados con la clase String. Esta frase es para unir a nombre
		
		//-------------------------------------------------------------------------//
		// String intern()
		// Pone una cadena en el string pool, se usa para gestionar mejor el uso de memoria.
		// Si no encuentra una cadena igual, crea una copia exacta en el String Pool y devuelve la referencia a esta nueva copia
		// Permite la comparación con == en vez de .equals()
		
		String s1 = new String("Hola");
		String s2 = "Hola";
		String s3 = s1.intern();
		
		System.out.println("\n------");
		System.out.println(s1 == s2); // false
		System.out.println(s2 == s3); // true
		
		//-------------------------------------------------------------------------//
		/*Solución 1: usar una matriz de caracteres
		
		Cree un objeto Scanner.
		Lea una línea desde la consola.
		Input  https://domain.com/about/reviews

		Convierta una cadena en una matriz de caracteres.
		Repita los caracteres.
		Si el carácter es /,
		reemplácelo con \. No te olvides de escapar.
		
		Cree una nueva cadena basada en la matriz de caracteres.
		Muestre la cadena.
		* */
	
		Scanner console = new Scanner(System.in);
		String path = console.nextLine();
		
		char[] chars = path.toCharArray();
		for (int i = 0; i < chars.length; i++)
			if (chars[i] == '/')
				chars[i] = '\\';
		
		String result = new String(chars);
		System.out.println(result); // Output https:\\domain.com\about\reviews

		//console.close();
	
		/*Solución 2: — usando los métodos split()yjoin()
		*Cree un objeto Scanner.
		Lea una línea desde la consola.
		
		Convierta una cadena en una matriz de cadenas . El /carácter se usa como separador (las dos barras adicionales
		son el resultado del doble escape).
		Concatene todas las cadenas en la matriz de cadenas . El \se usa como separador (lo vemos escapado).
		
		Muestre la cadena.
		* */
		Scanner console1 = new Scanner(System.in);
		String path1 = console1.nextLine();
		
		String[] array = path1.split("/");
		String result1 = String.join("\\", array);
		System.out.println(result1);// Output https:\\domain.com\about\reviews

		//console1.close();
		/*Solución 3: — usando el replace(char oldChar, char newChar)método

		Cree un objeto Scanner.
		Lea una línea desde la consola.
		
		Simplemente reemplace un carácter por otro (el segundo tiene escape).
		Muestre la cadena.
		
		* */
		Scanner console2 = new Scanner(System.in);
		String path2 = console2.nextLine();
		
		String result2 = path2.replace('/', '\\');
		
		System.out.println(result2);// Output https:\\domain.com\about\reviews
		console2.close();
	}
}
