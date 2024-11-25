package Ejercicios.Tema9;

/*En la clase Solution , implemente el método setTimer(int, int, int, int, int),
 que lo pone a dormir durante un cierto tiempo, utilizando los métodos java.util.concurrent.TimeUnit apropiados.

Requisitos:
•	El método setTimer(int, int, int, int, int) debe implementarse de acuerdo con la condición.*/

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Temporizador {
    public static void setTimer(int days, int hours, int minutes, int seconds, int millis) throws InterruptedException {
        System.out.println("The timer has started!");
        //escribe aquí tu código
        TimeUnit.DAYS.sleep(days);
        TimeUnit.HOURS.sleep(hours);
        TimeUnit.MINUTES.sleep(minutes);
        TimeUnit.SECONDS.sleep(seconds);
        TimeUnit.MILLISECONDS.sleep(millis);
        System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
    }

    public static void main(String[] args) throws InterruptedException {
   // NO HACE FALTA MéTODO MAIN EN EL EJERCICIO, SOLO PIDE IMPLEMENTAR EN setTime el método TimeUnit
    }
}

//ok CodeGym
