package Ejercicios.Tema7;

/*
El programa debe mostrar la población de las ciudades más grandes del mundo y compararlas con Tokio, la ciudad más
poblada de todas.
Pero el algoritmo del programa está un poco roto. Para corregir el error, necesita hacer que la línea que muestra
información sobre la ciudad más grande del mundo utilice variables de clase estáticas en lugar de argumentos de métodos
locales.

La salida debería ser la siguiente:
La población de Jakarta es de 25,3 millones.
Pero en la ciudad más poblada, Tokio, la población es de 34,5 millones.
La población de Seúl es de 25,2 millones.
Pero en la ciudad más poblada, Tokio, la población es de 34,5 millones.
La población de Delhi es de 23,1 millones.
Pero en la ciudad más poblada, Tokio, la población es de 34,5 millones.
La población de la Ciudad de Nueva York es de 21,6 millones.
Pero en la ciudad más poblada, Tokio, la población es de 34,5 millones.

Requisitos:
•	No puedes cambiar los nombres de las variables.
•	Las variables static city y population de la clase se deben usar para mostrar información sobre la ciudad más poblada.
•	La salida del programa en la consola debe coincidir con las condiciones de la tarea.
*/

import Ejercicios.Pruebas;

public class CiudadesEnormes {
    //solo hay que indicar en printCityPopulation(String city, double population) que la variable a imprimir es la
    //publica de Tokio con Pruebas.city y Pruebas.population
    public static String city = "Tokio";
    public static double population = 34.5;

    public static void main(String[] args) {
        printCityPopulation("Jakarta", 25.3);
        printCityPopulation("Seúl", 25.2);
        printCityPopulation("Delhi", 23.1);
        printCityPopulation("la Ciudad de Nueva York", 21.6);
    }

    public static void printCityPopulation(String city, double population) {
        System.out.println("La población de " + city + " es de " + population + " millones.");
        //System.out.println("Pero en la ciudad más poblada, " + Pruebas.city + ", la población es de " + Pruebas.population + " millones.");
    }
}
