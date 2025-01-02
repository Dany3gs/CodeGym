package Ejercicios.Tema10;

/*
Inicialice las variables estáticas con los siguientes valores:

partyFace - "\uD83E\uDD73"
balloon - "\uD83C\uDF88"
gift - "\uD83C\uDF81"
partyPopper - "\uD83C\uDF89"
cake - "\uD83C\uDF82"
Para ver algunas felicitaciones, ejecute el método main().

Requisitos:
•	La variable partyFace debe inicializarse con el valor "\uD83E\uDD73" cuando se declare.
•	La variable balloon debe inicializarse con el valor "\uD83C\uDF88" cuando se declare.
•	La variable gift debe inicializarse con el valor "\uD83C\uDF81" cuando se declare.
•	La variable partyPopper debe inicializarse con el valor "\uD83C\uDF89" cuando se declare.
•	La variable cake debe inicializarse con el valor "\uD83C\uDF82" cuando se declare.*/

public class Felicitaciones {
	public static String partyFace = "\uD83E\uDD73";
	public static String balloon = "\uD83C\uDF88";
	public static String gift = "\uD83C\uDF81";
	public static String partyPopper = "\uD83C\uDF89";
	public static String cake = "\uD83C\uDF82";
	
	public static void main(String[] args) {
		printCongratulation();
	}
	
	public static void printCongratulation() {
		String happyBirthday = "Happy birthday!";
		String congratulation = partyFace + balloon + partyPopper + cake + gift;
		System.out.println(happyBirthday + congratulation);
	}
}
// Ok codeGym