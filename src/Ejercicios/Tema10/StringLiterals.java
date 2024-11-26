package Ejercicios.Tema10;

/*Un campo de string público se declara e inicializa en la clase Solution. Pero la cadena es demasiado larga
Para una mejor legibilidad, debe dividirla en 5 subcadenas y concatenarlas con el operador "+"
(concatenación de cadenas), como este:

primera línea: "Siempre escribe el código como si "
segunda línea: "el tipo que termina manteniendo tu código será "
tercera línea: "un psicópata violento "
cuarta línea: "que sabe dónde vives. "
quinta línea: "Martin Golding"
Requisitos:
•	Cambie el campo de texto de acuerdo con las condiciones de la tarea.*/

public class StringLiterals {
    public String text = "Siempre escribe el código como si " +
            "el tipo que termina manteniendo tu código será " +
            "un psicópata violento " +
            "que sabe dónde vives. " +
            "Martin Golding";

    public static void main(String[] args) {
String a = new StringLiterals().text;
        System.out.println(a);
    }
}
