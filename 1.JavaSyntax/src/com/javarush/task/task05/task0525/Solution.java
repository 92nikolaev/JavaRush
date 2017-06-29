package com.javarush.task.task05.task0525;

/* 
И целой утки мало
*/

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat);
        System.out.println(cat2);
        Dog dog = new Dog();
        Dog dog2 = new Dog();
        System.out.println(dog);
        System.out.println(dog2);
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }
    public static class Cat {
        public String toString() {
            return "Cat";
        }
    }
    public static class Dog {
        public String toString() {
            return "Dog";
        }
    }
    //напишите тут ваш код
}
