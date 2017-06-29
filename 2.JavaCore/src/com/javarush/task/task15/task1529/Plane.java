package com.javarush.task.task15.task1529;

/**
 * Created by Dom on 13.03.2017.
 */
public class Plane implements Flyable {
    private int countPerson;

    public Plane(int countPerson) {
        this.countPerson = countPerson;
    }

    @Override
    public void fly() {

    }
}
