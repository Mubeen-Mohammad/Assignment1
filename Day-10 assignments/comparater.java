//Task 4: Lambda Expressions
//Implement a Comparator for a Person class using a lambda expression, and sort a list of Person objects by their age.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class comparater {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Mubeen",24));
        people.add(new Person("Jasu", 25));
        people.add(new Person("Faheem",19 ));

        // Sort by age using a lambda expression
        people.sort(Comparator.comparingInt(Person::getAge));

        // Print the sorted list
        people.forEach(System.out::println);
    }
    
}
