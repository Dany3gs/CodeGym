package Ejercicios;


import java.util.Arrays;

public class Pruebas {

    
   

    public static void main(String[] args) {
        //escribe aquí tu código


            int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
            Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

            for (int i = numbers.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
           /* Compare the elements in pairs.
             If they are not in the right order,
             then swap them */
                    if (numbers[j] > numbers[j + 1]) {
                        int tmp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = tmp;
                    }
                }
            }
            System.out.println(Arrays.toString(numbers));

        }
    }