package Ejercicios.Tema7;

/*El método createCrew() muestra las posiciones y los nombres de los miembros de la tripulación de una nave espacial.
Para evitar cualquier confusion dentro del método, cambia los nombres de los parámetros del método createCrew() para
que coincidan con los nombres de las variables pasadas al método:
name1 en navigator
name2 a pilot
name3 a secondPilot
name4 a flightEngineer
Y no debería haber ningún cambio en la ejecución del programa.
Requisitos:
•	Los parámetros del método createCrew() deben llamarse navegante, piloto, copiloto y ingeniero de vuelo.
•	La salida en pantalla debe coincidir con las condiciones de la tarea.
•	En el método main(), las variables navigator, pilot, secondPilot y flightEngineer no deben cambiar.*/

public class LosCuatroDeLiverpol {
    public static void main(String[] args) {
        String navigator = "John";
        String pilot = "Paul";
        String secondPilot = "George";
        String flightEngineer = "Ringo";
        createCrew(navigator, pilot, secondPilot, flightEngineer);
    }

    public static void createCrew(String navigator, String pilot, String secondPilot, String flightEngineer) {
        System.out.println("The four who are to conquer the cosmos:");
        System.out.println("Navigator: " + navigator);
        System.out.println("Pilot: " + pilot);
        System.out.println("Second pilot: " + secondPilot);
        System.out.println("Flight engineer:" + flightEngineer);
    }
}
//Ok CodeGym
