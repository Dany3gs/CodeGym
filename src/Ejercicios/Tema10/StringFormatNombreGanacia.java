package Ejercicios.Tema10;

/*Haga que el método format(String name, int salary) devuelva una cadena como esta:
Mi nombre es <name>. Ganaré $<salary> al mes.

Use el método String.format() para hacerlo.
Requisitos:
•	Necesitas el método format(String, int) para usar el método String.format().
•	Necesitas el método format(String, int) para que devuelva una cadena de acuerdo con las condiciones de la tarea.*/

public class StringFormatNombreGanacia {

    public static void main(String[] args) {
        System.out.println(format("Amigo", 5000));
    }


    public static String format(String name, int salary) {

        // Se modifica el texto de phrase para añadir los especificadores de formato %s (String) y %d (int)
        String phrase = "My name is %s. I will earn $%d a month.";

        //escribe aquí tu código
        phrase = String.format(phrase,name,salary );
        return phrase;
    }
}
// Ok CodeGym