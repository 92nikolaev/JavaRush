package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name;
    private int weight;
    private int age;
    private String color;
    private String address;

    public void initialize(String name) {
        this.name = name;
        this.weight=2;
        this.age=2;
        this.color="color";
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color="color";

    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 10;
        this.color="color";

    }

    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 5;

    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 5;
    }
    public static void main(String[] args) {

    }
}
