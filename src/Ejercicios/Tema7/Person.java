package Ejercicios.Tema7;

public class Person {
    public String work;
    public String firstName;
    public String lastName;
    public String fullName;


    public Person(String work, String firstName, String lastName, String fullName) {

        this.work = work;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;

    }
    public String getWork() {
        return work;
    }
    public String getFirstName() {
        return firstName;
    }

     public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
