package Ejercicios.Tema9.BolaMagica;

/*
En esta tarea implementarás el método getPrediction() en la clase MagicBall, que funcionará como una bola de
predicción.
Devuelve aleatoriamente una frase de respuesta a la pregunta formulada. El método getPrediction() debe utilizar
el método nextInt(int) de la clase Random, que debe devolver valores. Desde 0 hasta 7 inclusive.
Dependiendo del resultado del método nextInt(int), se devuelve una de las opciones de respuesta:
0 -> Certainly
1 -> Definitely
2 -> Most likely
3 -> The outlook is good
4 -> Ask later
5 -> Try again
6 -> My answer is no
7 -> Very doubtful
De lo contrario, devuelve null.

Requisitos:
•	Implemente el método getPrediction() según la condición.*/
import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Certainly";
    private static final String DEFINITELY = "Definitely";
    private static final String MOST_LIKELY = "Most likely";
    private static final String OUTLOOK_GOOD = "The outlook is good";
    private static final String ASK_AGAIN_LATER = "Ask later";
    private static final String TRY_AGAIN = "Try again";
    private static final String NO = "My answer is no";
    private static final String VERY_DOUBTFUL = "Very doubtful";

    public static String getPrediction() {
        int random = new Random().nextInt(9);

        if (random == 0) {
            return CERTAIN;
        } else if (random == 1) {
            return DEFINITELY;
        } else if (random == 2) {
            return MOST_LIKELY;
        } else if (random == 3) {
            return OUTLOOK_GOOD;
        } else if (random == 4) {
            return ASK_AGAIN_LATER;
        } else if (random == 5) {
            return TRY_AGAIN;
        } else if (random == 6) {
            return NO;
        } else if (random == 7) {
            return VERY_DOUBTFUL;
        } else {
            return null;
        }
//        switch (random){
//            case 0: random = 0;
//                return CERTAIN;
//            case 1: random = 1;
//                return DEFINITELY;
//            case 2: random = 2;
//                return MOST_LIKELY;
//            case 3: random = 3;
//                return OUTLOOK_GOOD;
//            case 4: random = 4;
//                return ASK_AGAIN_LATER;
//            case 5: random = 5;
//                return TRY_AGAIN;
//            case 6: random = 6;
//                return MOST_LIKELY;
//            case 7: random = 7;
//                return NO;
//            case 8: random = 8;
//                return VERY_DOUBTFUL;
//        }
//        return "";
    }
}