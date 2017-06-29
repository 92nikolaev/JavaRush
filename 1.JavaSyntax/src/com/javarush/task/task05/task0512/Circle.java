package com.javarush.task.task05.task0512;

/* 
Создать класс Circle
*/

public class Circle {
    private int centerX;
    private int centerY;
    private int radius;
    private int width;
    private int color;

    public void initialize(int centerX, int centerY, int radius) {
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
    }
    public void initialize(int centerX, int centerY, int radius, int width) {
        initialize(centerX, centerY, radius);
        this.width=width;
    }
    public void initialize(int centerX, int centerY, int radius, int width, int color) {
        initialize(centerX, centerY, radius, width);
        this.color=color;
    }

    public static void main(String[] args) {

    }
}
