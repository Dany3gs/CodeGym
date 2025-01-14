package Ejercicios.Tema10;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
 Al usar un StringTokenizer, divida la variable de consulta en partes en base a la variable de delimitación.
El número máximo de elementos es 6.

Ejemplo:
getTokens("java.util.stream", "\\.") devuelve el array de string {"java", "util", "stream"}
Requisitos:
•	El método getTokens(String, String) necesita utilizar un StringTokenizer.
•	El método getTokens(String, String) necesita devolver una matriz(array) de String llena de acuerdo con las
    condiciones de la tarea.*/

public class StringTokenizerDividir {

    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {

        //Hay que crear el constructor con dos métodos, hasMoreTokens() y nextToken()

        // Creamos un objeto StringTokenizer con el String query a tokenizar (query) y el String delimitador (delimiter).
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);

        // Inicializamos un array que contendrá el total de tokens con el método countTokens()
        String[] tokens = new String[stringTokenizer.countTokens()];

        // Creamos un contador para el bucle
        int contador = 0;

        // Con el bucle comprobamos con hasMoreTokens() si quedan más token
        while (stringTokenizer.hasMoreTokens()) {
            tokens[contador] = stringTokenizer.nextToken(); // Con nextToken() obtenemos el siguiente token
            contador++; // Avanzamos por el bucle hasta que no hallan más token
        }
        // Imprimimos el array de tokens [java, util, stream]
        return tokens;
    }
}
// Ok CodeGym