package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Pruebas {

    public static boolean getBNumberRandom() {
        Random boleano = new Random();
        boolean bolean = boleano.nextBoolean();
        return bolean;
    }


    public static void main(String[] args) {



        for (int i = 0; i < 5; i++)
        {
            System.out.println(getBNumberRandom());
        }

        }
    }





