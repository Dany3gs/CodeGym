package Ejercicios.Tema7;

/*Este es el método signIn() que saluda a los usuarios del sitio web. Actualmente, saluda a todos los usuarios,
 pero solo debería saludar a los usuarios registrados. Todos los usuarios no registrados tienen el nombre "user".
Agregue la validación de nombre de usuario al comienzo del método signIn().
Si el nombre es "user", use la instrucción return para abortar la ejecución del método.

Requisitos:
•	Si el nombre de usuario es "user", entonces el método signIn() debe salir sin imprimir nada en la consola.
•	Si el nombre de usuario no es "user", el método signIn() debe continuar e imprimir saludos en la consola.
•	La palabra clave return debe usarse para interrumpir el método signIn().*/

public class BienvenidosPeroNoTodos {
    public static void main(String[] args) {

    }

    public static void signIn(String username) {
        if (username.equals("user")) {
            return;
        }
        System.out.println("Welcome, " + username);
        System.out.println("We've really missed you, " + username);
    }
}
//ok codeGym

