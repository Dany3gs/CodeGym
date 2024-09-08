package Ejercicios.Tema7;

/*No sorprenderá a nadie descubrir un calculador que pueda elevar un número al cubo.
Pero un calculador que pueda elevar un número a la novena potencia es otra historia. ¡Implementemos uno!

Para hacerlo, cree un método public static long ninthDegree(long).
Debe tomar un valor entero long como argumento.
El método debe elevar el valor pasado a la novena potencia y devolverlo como resultado del método.
Recordarás de tu clase de matemáticas de secundaria que puedes obtener la novena potencia de un número si lo elevas
a la tercera potencia y luego elevas el resultado a la tercera potencia. Utilicemos esta regla en nuestro programa.
En el método ninthDegree(), eleva el argumento pasado a la tercera potencia usando el método cube().
Luego pasa el resultado al método cube() una vez más. El resultado final es el valor de retorno del método.

Requisitos:
Debes tener un método public y static llamado ninthDegree(long a).
El método ninthDegree() debe devolver el resultado de elevar el número pasado a la potencia de nueve.
El método ninthDegree() debe usar el método cube() para elevar el número de forma sucesiva.*/

public class CubosCubicos {
    public static void main(String[] args) {

    }

    public static long cube(long a) {
        return a * a * a;
    }

    //escribe aquí tu código
    public static long ninthDegree(long a) {

        return cube(cube(a));
    }
}
//ok codeGym