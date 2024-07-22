package Ejercicios;/*Por lo general, la velocidad del viento se indica en m/s y no siempre está claro qué tan alto o bajo es.
Es más común ver el valor de la velocidad en km/h, como un coche, una bicicleta u otro vehículo.
Por lo tanto, haremos un conversor de valores de velocidad de m/s a km/h.

El valor inicial de la velocidad del viento en m/s debe obtenerse leyéndolo como un número entero desde el teclado.
La relación de velocidad es: 1 m/s = 3,6 km/h.

Debes mostrar la velocidad del viento en km/h, redondeada al entero más cercano.
Para redondear, debes utilizar el método Math.round().

Requisitos:
•	El programa debe leer números enteros desde el teclado.
•	El programa debería mostrar el número en la pantalla.
•	El programa debería mostrar un número entero: el resultado de redondear el número entero ingresado multiplicado
    por 3,6.
•	El programa debe utilizar el método Math.round().*/


import java.util.Scanner;

public class VelocidadDelViento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int windSpeed;
        windSpeed = sc.nextInt();
        double speed = windSpeed * 3.6;
        int speedKh = (int) Math.round(speed);
        System.out.println(speedKh);

    }
}

//Ok CodeGym
