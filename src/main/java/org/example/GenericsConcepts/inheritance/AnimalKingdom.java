package org.example.GenericsConcepts.inheritance;

import org.example.GenericsConcepts.inheritance.hierarchies.Animal;
import org.example.GenericsConcepts.inheritance.hierarchies.Dog;
import org.example.GenericsConcepts.inheritance.hierarchies.Mammal;

import java.util.List;

public class AnimalKingdom {
    // Animal is like an upper bound for Type
    public <T extends Animal> void doSomething(List<T> animals){

    }

    public <T extends Animal, V extends Animal> void doSomethingTwice(List<T> animals, List<V> anotherAnimals){

    }

    public <T, V extends Animal> void doSomethingMore(List<T> animals, List<V> anotherAnimals){

    }

    // Mammal is like an upper bound for Type T
    public <T extends Mammal> void doMammalThing(List<T> animals){

    }

    public void doLowerBoundThing(List<? super Dog> doggos){

    }
}
