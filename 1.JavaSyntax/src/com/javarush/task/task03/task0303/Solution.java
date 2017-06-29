package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(2, 3.2));
        System.out.println(convertEurToUsd(2, 3.2));
    }

    public static double convertEurToUsd(int eur, double course) {
       double a = eur * course;
       return a;
    }
}
