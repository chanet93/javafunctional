package org.amigoscode.imperative;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Jhon", Gender.MALE),
                new Person("Jhony", Gender.MALE),
                new Person("Jhonson", Gender.MALE),
                new Person("Alisha", Gender.FEMALE),
                new Person("Alexa", Gender.FEMALE)
        );
        System.out.println("//IMPERATIVE How many females do we have?");
        List<Person> females = new ArrayList<>();
        for (Person p: people) {
            if(p.gender.equals(Gender.FEMALE))
                females.add(p);
        }

        for (Person f: females) {
            System.out.println(f);
        }

        System.out.println("//DECLARATIVE APPROACH");
        people.stream()
                .filter(p -> Gender.FEMALE.equals(p.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        }

    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE
    }
}
