package Ejercicios.Tema10;

/*
  Implemente el método changePath(String, String) de tal manera que reemplace la versión de jdk en la ruta que se
  pasa como primer parámetro con la versión que se pasa como segundo parámetro y devuelva la nueva ruta.

La versión de JDK comienza con "jdk" y finaliza en "/".

Ejemplo:
ruta - "/usr/java/jdk1.8/bin"
versión de JDK - "jdk-13"
El método changePath(path, JDK version) debe devolver la ruta "/usr/java/jdk-13/bin".

El método main() no está involucrado en la prueba.

Requisitos:
•	El método changePath(String, String) necesita ser implementado tal como se indica en las condiciones de la tarea.
* */

import java.util.Arrays;

public class ActualizacionDeLaRuta {

    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //escribe aquí tu código

        // Los métodos indexOf, startIndex, endIndex etc, esperan un valor de tipo int para localizar la posición del
        // parámetro buscado, en este caso, jdk nos devuelve el valor 10
        int startIndex = path.indexOf("jdk");

        int endIndex = path.indexOf("/", startIndex + 1); // buscamos ahora el siguiente / después de jdk,
        //que tiene valor 16, se añade + 1 para que lo incluya para el cambio, ya que indexOf llega a N-1

        // Creamos otra variable para sustraer con substring los valores que queremos cambiar y utilizarla para el cambio
        String oldPath = path.substring(startIndex, endIndex);

        // System.out.println(oldPath); Output jdk1.8

        return path.replace(oldPath, jdk); // y reemplazamos el código por la variable jdk

    }
}

// Ok CodeGym

/*El ejercicio pide cambiar cualquier versión de jdk, en un principio, solo implementé el cambio en la variable path con
return path.replace("jdk1.8", jdk);, esto me imprime en pantalla el cambio solicitado por el ejercicio, pero no tiene en
cuenta si es otro jdk el que cambia, no valdría este código, la lógica a aplicar es de extraer los valores que queremos
cambiar dentro del String, y reemplazarlos por la variable que tenemos asignada con el nuevo téxto, teniendo en cuenta
que indexOf llega hasta N-1, Esto encuentra el siguiente / después de "jdk" y añade 1 para incluirlo
* */



