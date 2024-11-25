package Ejercicios.Tema9;

/*En la clase Solution, implemente el método printNumbers() , que imprime números de 1 hasta 10 inclusive con
una pausa entre la salida de cada número: 1,3 milisegundos. El método sleep(long, int) de la clase Thread te ayudará
con esto, que debería funcionar 9 veces.

Requisitos:
•	Implemente el método printNumbers() según la condición.*/

public class EncimeraNanosegundos {
    public static void main(String[] args) throws InterruptedException {
        printNumbers();
    }

    public static void printNumbers() throws InterruptedException {
        //escribe aquí tu código
        int num = 1;
        int contador = 0;
        do {
            System.out.println(num);
            num++;

            if (num <= 10) {
                Thread.sleep(1, 300_000);
                contador++;
            }
        }
        while (num <= 10);
        System.out.println("contator fue " + contador);
    }
}

/*o Codegym
 Con for
 for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i < 10) {
                Thread.sleep(1, 300_000);
            }
        }*/