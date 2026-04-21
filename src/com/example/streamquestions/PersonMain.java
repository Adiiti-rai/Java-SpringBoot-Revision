package com.example.streamquestions;
import java.util.*;
import java.util.stream.*;
public class PersonMain {
    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("Aditi", 22),
                new Person("hari", 25),
                new Person("Ram", 30)
        );
        System.out.println(list);

        // calculate the average age of a list of person objects using java stream.
        double averageAge = list.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0.0);
        System.out.println(averageAge);


    }
}
