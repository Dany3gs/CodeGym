package Ejercicios.Tema8.MetodosDeHerencia;

/*Organice la herencia de la clase correctamente:

Un humano hereda las propiedades de un entidad.
Un desarrollador de Java hereda las propiedades de un humano.
Elimine los métodos duplicados.
Requisitos:
•	La clase Human debe heredar de la clase Entity.
•	La clase JavaDeveloper debe heredar de la clase Human.
•	No debe haber métodos duplicado*/

class JavaDeveloper extends Human{
   /* public void move() {
        System.out.println("I am moving.");
    }

    public void eat() {
        System.out.println("I am eating.");
    }

    public void speak() {
        System.out.println("I can speak.");
    }*/

    public void code() {
        System.out.println("I can code in Java.");
    }
}
