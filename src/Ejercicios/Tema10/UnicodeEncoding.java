package Ejercicios.Tema10;

/*El método público estático init(char[]) se le pasa una matriz de 9 caracteres, que necesita ser llenada con los
siguientes valores:

0 - '\u00A9'
1 - '\u004A'
2 - '\u0061'
3 - '\u0076'
4 - '\u0061'
5 - '\u0052'
6 - '\u0075'
7 - '\u0073'
8 - '\u0068'
Para ver el resultado, ejecute el método main().

Requisitos:
•	El método init(char[]) necesita llenar el arreglo de caracteres recibido de acuerdo con las condiciones de la tarea.
* */

public class UnicodeEncoding {
	
	public static void main(String[] args) {
		char[] symbols = new char[9];
		init(symbols);
		System.out.println(new String(symbols));
	}
	
	public static void init(char[] symbols) {
		//escribe aquí tu código
		symbols[0] = '\u00A9';
		symbols[1] = '\u004A';
		symbols[2] = '\u0061';
		symbols[3] = '\u0076';
		symbols[4] = '\u0061';
		symbols[5] = '\u0052';
		symbols[6] = '\u0075';
		symbols[7] = '\u0073';
		symbols[8] = '\u0068';
	}
}
//ok CodeGym