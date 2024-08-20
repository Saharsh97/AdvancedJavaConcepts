package org.example.inheritance;

import org.example.inheritance.hierarchies.*;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        AnimalKingdom animalKingdom = new AnimalKingdom();
        List<Animal> animals = new ArrayList<>();
        List<Mammal> mammals = new ArrayList<>();
        List<Reptile> reptiles = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        List<Snake> snakes = new ArrayList<>();

        animalKingdom.doSomething(animals);
        animalKingdom.doSomething(mammals);
        animalKingdom.doSomething(reptiles);
        animalKingdom.doSomething(dogs);
        animalKingdom.doSomething(cats);
        animalKingdom.doSomething(snakes);

        animalKingdom.doSomethingMore(animals, mammals);
        animalKingdom.doSomethingMore(cats, dogs);
        animalKingdom.doSomethingMore(mammals, reptiles);

//        animalKingdom.doMammalThing(animals);
        animalKingdom.doMammalThing(mammals);
        animalKingdom.doMammalThing(cats);
//        animalKingdom.doMammalThing(snakes);

        animalKingdom.doLowerBoundThing(dogs);
//        animalKingdom.doLowerBoundThing(reptiles);
//        animalKingdom.doLowerBoundThing(cats);
        animalKingdom.doLowerBoundThing(mammals);
        animalKingdom.doLowerBoundThing(animals);
    }
}
