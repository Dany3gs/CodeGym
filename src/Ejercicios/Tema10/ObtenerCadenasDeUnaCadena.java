package Ejercicios.Tema10;

// Además de comparar cadenas y encontrar subcadenas, existe otra acción muy popular:
// obtener una subcadena de una cadena

public class ObtenerCadenasDeUnaCadena {

    public static void main(String[] args) {

        // Aquí hay una lista de 8 métodos que devuelven subcadenas de la cadena actual:

                    //   012345678901234567890123456789012345678901234567    ==> total 48
        String cadena = "   Vamos a extraer subcadenas de esta cadena -> ";

        System.out.println(cadena.length()); // tiene 48 elementos por los espacios puesto adrede para explicar trim

        // String substring(int beginIndex, int endIndex -1)
        //***********************************************
        // Devuelve la subcadena especificada por el rango de índice beginIndex..endIndex.
        // Si extraemos de variable original, cambia el orden de los elementos, ya que no se mantiende el texto
        // substraído, una opción es copiar en otra variable para sacar lo que queramos de la original con sus
        // valores de elementos originales.
        // Si ponemos solo un valor de rango, solo quita ese elemento

        String extraccion1 = cadena;
        extraccion1 = extraccion1.substring(0,18);
        System.out.println(extraccion1); // Output "Vamos a extraer"

        String extraccion2 = cadena;
        extraccion2 = extraccion2.substring(30,44);
        System.out.println(extraccion2); // de esta cadena

        String extraccion3 = cadena;
        extraccion3 = extraccion3.substring(46);
        System.out.println(extraccion3);

        // Repeat, repite la cadena n veces
        //*********************************
        String repeat = cadena.repeat(2);
        System.out.println(repeat);

        // Replace, sustituye el viejo char por uno nuevo
        //***********************************************
        String reemplazo = cadena.replace('a','B');
        System.out.println(reemplazo);

        // ReplaceFirst, sustituye la primera subcadena, expresada en una regex, por la actual
        //************************************************************************************
        String reemplazoFirst = cadena.replaceFirst("Vamos","Hola");
        System.out.println(reemplazoFirst);

        // ReplaceAll, reemplaza todas las subcadenas que coincidan con la regex
        //**********************************************************************
        String reemplazoAll = cadena.replaceAll("a","-A-");
        System.out.println(reemplazoAll);

        // toLowerCase y toUpperCase, pasa todo a minúscula o mayúscula
        //*************************************************************
        String todoAMinuscula = cadena.toLowerCase();
        String todoAMayuscula = cadena.toUpperCase();
        System.out.println(todoAMinuscula);
        System.out.println(todoAMayuscula);

        // Trim, elimina todos los espacios al principio y al final de una cadena, evita errores
        //**************************************************************************************
        String sinEspacios = cadena.trim();
        System.out.println(sinEspacios);
        System.out.println(cadena.length()); // sigue indicando 48 elementos, solo que no muestra los espacios
    }
}
