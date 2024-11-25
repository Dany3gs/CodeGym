package Ejercicios.Tema9.IntercambiarDeUnaNuevaManera;

/*En la clase Pair, implemente el método swap() para que intercambie los valores del x y y .
Sólo puedes utilizar las siguientes operaciones:

Exclusivo o. = ^
Asignación. =
Exclusiva o con cesión.
No dejes comentarios, no cambies el resto del código.
Requisitos:
•	La clase Pair debe tener un método swap().
•	En la clase Pair, en el método swap(), utilice sólo operaciones permitidas.
•	Llamar al método swap() debería cambiar los valores de los campos x e y.
•	No cambie ningún código excepto el método swap().*/

public class Pair {
    private int x;
    private int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x=%d, y=%d", x, y);
    }

    public void swap() {
        //escribe aquí tu código
        // 0100 ^ 0101
        // 0101 ^ 0100
        // 0100 ^ 0101

        x ^= y;
        y ^= x;
        x ^= y;

    }
}
// ok CodeGym