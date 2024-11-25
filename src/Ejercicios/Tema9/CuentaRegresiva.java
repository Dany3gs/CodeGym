package Ejercicios.Tema9;

/*En la clase Solution, se produce una cuenta regresiva en el método countDown() .
Debe asegurarse de que haya una pausa de 1 segundo entre la salida de texto a la consola.
El método sleep(long) de la clase Thread le ayudará con esto.

Requisitos:
•	Implemente el método countDown() según la condición.

Thread.sleep(1000); método para ralentizar el programa, en milisegundos
*/

public class CuentaRegresiva {
    public static void main(String[] args) throws InterruptedException {
        countDown();
    }
    public static void countDown() throws InterruptedException {
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("Start!");
    }
}
// Ok Codegym