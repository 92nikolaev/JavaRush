package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        result.add(cat);
        result.add(cat1);
        result.add(cat2);
        result.add(cat3);
        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> result = new HashSet<Dog>();

        Dog dog = new Dog();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        result.add(dog);
        result.add(dog1);
        result.add(dog2);
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> join = new HashSet<>();
        join.addAll(cats);
        join.addAll(dogs);
        return join;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        for (Object o : pets) {
            System.out.println(o);
        }
    }

    public static class Cat{

    }
    public static class Dog{

    }
}
