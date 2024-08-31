package Ejercicios.Tema7;

/*El método main imprime demasiadas líneas de información sobre varios conceptos.
Tendría sentido separar la información sobre el hidrógeno de la información sobre la isla de Java mediante el uso
de diferentes métodos para su visualización.

Cree un método public static void printHydrogenInfo(), que debe imprimir todas las líneas sobre el hidrógeno.
Asimismo, cree un método public static void printJavaInfo(), que debe imprimir todas las líneas sobre la isla de Java.
Por último, en el método main(), llame a estos dos métodos.

La salida general por consola no debería cambiar.
Requisitos:
•	Debe haber un método static public void printHydrogenInfo().
•	Debe haber un método static public void printJavaInfo().
•	El método printHydrogenInfo() debe imprimir todas las líneas existentes sobre el hidrógeno.
•	El método printJavaInfo() debe imprimir todas las líneas existentes sobre la isla de Java.
•	El método main() debe llamar a los métodos printHydrogenInfo() y printJavaInfo().
•	La salida general de la consola no debería cambiar.*/


public class SepararConceptos {
    public static void printHydrogenInfo() {
        System.out.println("Hydrogen:");
        System.out.println("This is a chemical element in the periodic table. Its designation is H, and its atomic number is 1.");
        System.out.println("It is the lightest element in the table.");
        System.out.println("Hydrogen is used in:");
        System.out.println("- the chemical industry");
        System.out.println("- the oil refining industry");
        System.out.println("- aviation");
        System.out.println("- power generation.");
    }

    public static void printJavaInfo() {
        System.out.println("Island of Java:");
        System.out.println("It is part of Indonesia.");
        System.out.println("The states of Mataram, Majapahit, and Demak originated on the island.");
        System.out.println("Java is the most populated island in the world:");
        System.out.println("The total population is 140 million people.");
        System.out.println("The population density is 1,061 people per square kilometer.");
        System.out.println("Kopi luwak, a famous variety of coffee, is produced here.");
    }

    public static void main(String[] args) {
        printHydrogenInfo();
        printJavaInfo();
    }
}
//Ok CodeGym
