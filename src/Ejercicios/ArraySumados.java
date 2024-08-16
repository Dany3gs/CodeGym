package Ejercicios;

public class ArraySumados {
    public static void main(String[] args) {
        //para sumar arrays, hay que crear uno más que es el que los acumula y recorrer los tres array con otro for
        int [] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int [] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int [] resultArray; // en este array guardaremos los que queremos sumar resultArray = new int[total];

        //como no está inicializado, creamos una variable que incluya los arrays que queremos sumar y lo asignamos
        //a resultArray
        int total = firstArray.length + secondArray.length;
        resultArray = new int[total];

        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i]; //añadimos a resultArray los elementos de firstArray
        }
        for (int i = 0; i < secondArray.length; i++) {
            resultArray[firstArray.length + i] = secondArray[i];//le sumamos a resultArray los elementos de secondArray
        }
        for (int firstYSecund : resultArray) { //con foreach solo recorremos resultArray
            System.out.print(firstYSecund + ",");
        }
    }
}
