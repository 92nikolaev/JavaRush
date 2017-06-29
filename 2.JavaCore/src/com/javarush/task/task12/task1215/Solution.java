package com.javarush.task.task12.task1215;

/* 
Классы Cat и Dog от Pet
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {

        @Override
        public String getName() {
            return "na";
        }

        @Override
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {

        @Override
        public String getName() {
            return "a";
        }

        @Override
        public Pet getChild() {
            return new Dog();
        }
    }

}
