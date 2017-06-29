package com.javarush.task.task15.task1522;

/**
 * Created by Dom on 11.03.2017.
 */
public class Moon implements Planet{
    private static Moon instance;
    private Moon() {    }

    public static Moon getInstance(){
        if(instance == null){
            instance = new Moon();
        }
        return instance;
    }
}
