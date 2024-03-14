/* Create a method public boolean equals (Object compared), which can be used to compare the similarity of people.
The comparison should take into account the equality of all the variables of a person (birthday included). */

import java.util.*;

class Person {
    private String name;
    private int age;
    private String birthday;

    // Constructor
    public Person(String name, int age, String birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    // Override equals method to compare the equality of people
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Person person = (Person) obj;

        return age == person.age && Objects.equals(name, person.name) && Objects.equals(birthday, person.birthday);
    }
}

class Q7 {
    public static void main(String[] args) {
        Person person1 = new Person("John", 25, "1999-05-15");
        Person person2 = new Person("John", 25, "1999-05-15");
        Person person3 = new Person("Alice", 30, "1992-08-20");

        // Testing equals method
        System.out.println("Person1 equals Person2: " + person1.equals(person2)); // Should print true
        System.out.println("Person1 equals Person3: " + person1.equals(person3)); // Should print false
    }
}
