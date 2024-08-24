package Ejercicios;
/*En el main(String[]) método, muestre todos los números en el multiArray de tres dimensiones.

Requisitos:
•	La clase Solution debe tener una variable multiArray int[][][] static y public.
•	En el método main (String []), muestra todos los números en multiArray.*/

public class CreandoUnMultiArray {
    public static int[][][] multiArray = new int[][][]{ // new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};
        //desglose del array para entender mejor
        {
                {4, 8, 15},// multiArray[0][0]
                {16}// multiArray[0][1]
        },

        {
                {23, 42}, {}// multiArray[1][0]
        },

        {
                {1},// multiArray[2][0]
                {2},// multiArray[2][1]
                {3},// multiArray[2][2]
                {4, 5} // multiArray[2][3]
        }
    };

    public static void main(String[] args) {
        //escribe aquí tu código

        if (multiArray[0][0][0] > 0) {
            for (int i = 0; i < multiArray.length; i++) {
                for (int j = 0; j < multiArray[i].length; j++) {
                    for (int k = 0; k < multiArray[i][j].length; k++) {
                        System.out.print(multiArray[i][j][k] + " ");
                    }
                }
            }
        }
    }
}

/*Vamos a explicar esto;

El arreglo multidimensional int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

Primer nivel ([capas]): Corresponde a las capas o la "profundidad" del arreglo.
Segundo nivel ([][filas]): Corresponde a las filas dentro de cada capa.
Tercer nivel ([][][columnas]): Corresponde a las columnas dentro de cada fila.
Para entender mejor cómo se organizan estos corchetes, descompongamos el arreglo:

Primer conjunto de llaves { ... }: Representa una capa completa.
Segundo conjunto de llaves { ... } dentro de la primera capa: Cada una de estas representa una fila dentro de esa capa.
Tercer conjunto de llaves { ... } dentro de cada fila: Representa los elementos (o columnas) de esa fila.
        c f c
new int[][][]{  0/{{4, 8, 15}, {16}}/          capa 0 tiene dos filas de dif tamaño
                1/{{23, 42}, {}}/              capa 1 tiene dos filas de dif tamaño, pero la {} no la cuenta.
                2/{{1}, {2}, {3}, {4, 5}}/     capa 2 tiene cuatro filas de dif tamaño

Para acceder a los elementos del array por capas, se hacen bucles anidados, para comprobar la longitud de cada fila,
usamos un if donde filtre si el primer elemento del array es [0][0][0] > 0? y con los bucles vamos recorriendo el array
capa por capa, y al final imprimimos por consola en cada iteración cada elemento
System.out.print(multiArray[i][j][k] + " ");

Para evitar errores, es una buena práctica verificar los límites del arreglo antes de acceder a los elementos:

Verificación de límites antes de acceder:
Primera dimensión (filas): Verificas que i esté dentro de los límites del arreglo tridimensional.
Segunda dimensión (columnas): Verificas que j esté dentro de los límites del arreglo bidimensional en la fila i.
Tercera dimensión (elementos): Verificas que k esté dentro de los límites del arreglo unidimensional en la fila i y columna j.

Podemos revisarlo creando variables que recorran cada capa
        int i = 0;
        int j = 0;
        int k = 0;

         Verificación para la primera dimensión
        if (i >= 0 && i < multiArray.length) {
             Verificación para la segunda dimensión
            if (j >= 0 && j < multiArray[i].length) {
                 Verificación para la tercera dimensión
                if (k >= 0 && k < multiArray[i][j].length) {
                     Acceso seguro al elemento
                    System.out.println("Elemento en multiArray[" + i + "][" + j + "][" + k + "] = " + multiArray[i][j][k]);
                } else {
                    System.out.println("Índice 'k' fuera de los límites.");
                }
            } else {
                System.out.println("Índice 'j' fuera de los límites.");
            }
        } else {
            System.out.println("Índice 'i' fuera de los límites.");
        }
    }
}

Para ver en consola el resultado de cada ubicación, se puede ver en consola así:
System.out.println("Elemento en capa " + i + " fila " + j + " columna " + k + " = " + multiArray[i][j][k]);
Elemento en capa 0 fila 0 columna 0 = 4
Elemento en capa 0 fila 0 columna 1 = 8
Elemento en capa 0 fila 0 columna 2 = 15
Elemento en capa 0 fila 1 columna 0 = 16
Elemento en capa 1 fila 0 columna 0 = 23
Elemento en capa 1 fila 0 columna 1 = 42
Elemento en capa 2 fila 0 columna 0 = 1
Elemento en capa 2 fila 1 columna 0 = 2
Elemento en capa 2 fila 2 columna 0 = 3
Elemento en capa 2 fila 3 columna 0 = 4
Elemento en capa 2 fila 3 columna 1 = 5

 */