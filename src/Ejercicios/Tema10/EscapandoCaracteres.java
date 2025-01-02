package Ejercicios.Tema10;

/*Muestre el siguiente texto en dos líneas:
It's a Windows path: "C:\Program Files\Java\jdk-13.0.0\bin"
It's a Java string: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"

Sugerencia:
\" sirve para escapar de una comilla doble;
\\ sirve para escapar de una barra diagonal inversa (\).

Lea más sobre los caracteres de escape y las secuencias de escape en Java en este artículo.

Requisitos:
•	Necesitas hacer que el programa muestre texto.
•	Necesitas mostrar dos líneas.
•	La primera línea de texto debe ser: It's a Windows path: "C:\Program Files\Java\jdk-13.0.0\bin"
•	La segunda línea de texto debe ser: It's a Java string: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"*/

public class EscapandoCaracteres {
	
	public static void main(String[] args) {
		//escribe aquí tu código
		System.out.println("It's a Windows path: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"");
		System.out.println("It's a Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk-13.0.0\\\\bin\\\"");
	}
}
// Ok CodeGym