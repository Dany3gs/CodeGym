package Ejercicios.Tema9;
/*
*Implemente los métodos sin(double) , cos(double) , tan(double) que devuelven el seno, el coseno y la tangente de
 un ángulo, respectivamente, recibido como parámetro. El ángulo se especifica en grados.
Para ello le ayudarán los métodos correspondientes de la clase Math, que toman como parámetro un ángulo especificado
 en radianes.

Requisitos:
•	Implemente el método sin (doble) según la condición.
•	Implemente el método cos (doble) según la condición.
•	Implemente el método tan (doble) según la condición.
* */

import static java.lang.Math.toRadians;

public class ClaseChatarraParte1 {
    public static double sin(double a) {

        //Tememos que aplicar la clase Math a return, en el método que hemos creado sin (dentro de paréntesis),
        // pide que cambiemos el valor de "a" de grados a radianes, para eso está el método Math.toRadians(a);
        //el cálculo que hará es 1 radian = 57,2958 grados == a / 57.2958
        return Math.sin(Math.toRadians(a));
    }

    public static double cos(double a) {
        //escribe aquí tu código

        return Math.cos(Math.toRadians(a));
    }

    public static double tan(double a) {
        //escribe aquí tu código

        return Math.tan(Math.toRadians(a));
    }

    //Ok codegym

    public static void main(String[] args) {
        //ejemplo si "a" tuviera el valor de 20 grados
        double grados = 20;

        System.out.println("Si " + "\"" + "a" + "\""  + " tiene un valor en grados de: " + grados);
        //pasamos de grados a radianes
        grados=Math.toRadians(grados);

        System.out.println("\"" + "A" + "\"" + " equivale en radianes : " + grados); //output 0.3490658503988659
    }
}


