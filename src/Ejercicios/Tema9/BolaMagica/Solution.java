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

public class Solution {
    public static void main(String[] args) {
        System.out.println("Will I make enough money to buy a BMW?");
        System.out.println(MagicBall.getPrediction());
    }
}

