package Ejercicios.Tema10;

public class StringBuilderMetodos {

    public static void main(String[] args) {

        // Con esta clase nos permite modificar un string con los siguientes métodos
        String frase = "Hola que tal?";
        System.out.println(frase);

        // Creamos el constructor, puede ser vacío también, en este caso usamos de ejemplo la variable frase
        StringBuilder builder = new StringBuilder(frase);

        // append() añade al final de la frase, se puede añadir números
        builder.append(" Como fue el día?");
        builder.append( 123);
        System.out.println(builder);

        // reverse(), escribe al revés la frase
        builder.reverse();
        System.out.println(builder);
        builder.reverse();
        // Para convertir de nuevo a un String estandar se usa toString()
        frase = builder.toString();
        if (frase instanceof String) {
            System.out.println("La frase es de tipo String");
        }

    }
}
