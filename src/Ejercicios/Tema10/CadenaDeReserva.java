package Ejercicios.Tema10;

/*Los método equal(String, String) compara cadenas por referencia usando el operador ==.
Necesitas hacer que el método devuelva true si los valores (contenidos) de las cadenas son iguales, y false si son
diferentes, sin usar el método equals().
Requisitos:
•	Necesitas el método equal(String, String) para comparar cadenas por valor, pero usando el operador ==.
•	Necesitas que el método equal(String, String) devuelva true si las cadenas son iguales.
•	El método equal(String, String) debe devolver false si las cadenas son diferentes.
•	No debes usar el método equals().
*/


public class CadenaDeReserva {

    public static void main(String[] args) {
        String first = new String("CodeGym");
        String second = new String("CodeGym");
        String third = new String("codegym");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static boolean equal(String first, String second) {
        //escribe aquí tu código

        // Usamos el método intern() para guardar una copia en el String pool, permitiendo comparar con ==
        first = first.intern();
        second = second.intern();
        return first == second;
    }
}
// Ok CodeGym