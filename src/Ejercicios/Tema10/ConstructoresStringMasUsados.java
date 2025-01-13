package Ejercicios.Tema10;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

import static java.lang.String.format;

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
		// TODO
		Input https://domain.com/about/reviews

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
		console2.nextLine();
		console2.close();
		
		
		// split(regex dilimitador) método
		
		/* este método puede ser complejo si tenemos muchas regex, dificultando su lectura de entender si tenemos
			que dividir por espacio u otro separador que nos de pié a muchos elementos, mejor usar la clase
			StringTokenizer()
		
		Es un método que nos permite dividir un string, partiendo la cadena en tantos elementos de un array conlleve */
	
		String[] nombreArray = nombre.split(" ");
		System.out.println(Arrays.toString(nombreArray));
		// [Méto, s constructores más usa, s con la clase String. Esta frase es para unir a nombre.] regex "do"
		
		// Sin espacios " "
		// [Métodos, constructores, más, usados, con, la, clase, String., Esta, frase, es, para, unir, a, nombre.]
		
		System.out.println(nombreArray.length); // 15
		
		// StringTokenizer clase
		
		/* Divide una cadena en subcadenas, sin usar regex, se le pasa la variable String y el delimitador como parámetro
			Tiene un CONSTRUCTOR Y DOS METODOS IMPORTANTES, string nextToken() y un boolean hasMoreTokens()
			Parecida a la clase Scanner con nextLine() y hasNextLine()
			Tenga en cuenta que cada carácter de la cadena que se pasa como la segunda cadena al StringTokenizerconstructor
			 se considera un separador.
		* */
		
		String name = "helena es boba, o no es boba?";
		StringTokenizer nameHelen = new StringTokenizer(name, ",");
		
		while (nameHelen.hasMoreTokens()) {
			String nombreToken = nameHelen.nextToken();
			System.out.print(nombreToken);
			// output helena es boba
			// o no es boba?
			
		}
		
		// String.format() método estático y StringFormatter clase
		/* Con este método usamos los delimitadores como en los printf() %s para strings, %d para números, en vez de
			crear el soutdf, podemos darle el formato con este método
			Para Arrays no creo que sea la opción óptima
		*/
		
		int[] anos = new int []{14, 42};
		String[] nombres = new String[]{"Helena", "Dani"};
		
		// Ejemplo codegym
		String name1 = "Amigo";
		int age = 12;
		String friend = "Diego";
		int weight = 200;
		
		String datos = String.format("Nombre: %s,\nEdad: %d,\nNombre: %s,\nEdad: %d,\n",nombres[0],anos[0], nombres[1], anos[1]);
		System.out.print(datos);
	}
}
