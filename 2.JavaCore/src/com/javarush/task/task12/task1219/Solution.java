package com.javarush.task.task12.task1219;

/* 
Fly, Run, Swim для классов Human, Duck, Penguin, Airplane
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Run {
        public void run();
    }

    public interface Swim {
        public void swim();
    }


    public class Human implements Run,Swim {

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Duck implements Fly,Swim, Run {

        @Override
        public void fly() {

        }

        @Override
        public void swim() {

        }

        @Override
        public void run() {

        }
    }

    public class Penguin implements Run,Swim {

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Airplane implements Run, Fly{

        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }
}
