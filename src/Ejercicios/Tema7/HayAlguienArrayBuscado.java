package Ejercicios;

/*Implemente el método main(String[]) , que imprime true en la consola si el elemento está contenido en la matriz pasada. de lo contrario falso.
La matriz array no debe cambiar la disposición de sus elementos.

Para encontrar un elemento en una matriz, necesita una búsqueda binaria. Para hacer esto, use el método static Arrays.binarySearch(int[], int) de la clase Arrays . El primer parámetro es pasar la matriz ordenada en la que buscar, y el segundo parámetro es el elemento que se buscará. El método Arrays.binarySearch(int[], int) devuelve el índice del elemento buscado, si dicho elemento está en la matriz.

Para ordenar una matriz, puede utilizar el método Arrays.sort(int[]) .
Al realizar la prueba, los valores de las variables de la clase Solution serán diferentes.
Requisitos:

    En el método main (String []), no cambie la disposición de los elementos de la matriz.
    Al llamar al método main(String[]), muestre verdadero en la consola si el valor de la variable del elemento está contenido en la matriz.
    Al llamar al método main(String[]), muestre false en la consola si el elemento pasado no está contenido en la matriz.
    En el método main (String []), utilice la llamada al método Arrays.binarySearch (int [], int). */


import java.util.Arrays;

public class HayAlguienArrayBuscado {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;
        public static void main(String[] args) {

        //primero hay que crear una array para copiar el original y ordenarlo
       int[] copy = Arrays.copyOf(array, array.length);
        Arrays.sort(copy);  
        //luego se crea variable que busque con Arrays.binarySearch() si se encuentra element entre los elementos
        int index = Arrays.binarySearch(copy, element);
        //La impresión en consola de true o false va en el print
        System.out.println(index >= 0);
    }
}
        
    