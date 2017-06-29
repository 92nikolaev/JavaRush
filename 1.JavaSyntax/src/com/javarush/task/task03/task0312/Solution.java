package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    public static int convertToSeconds(int hour){
        hour = hour * 3600;

        return hour;
    }

    public static void main(String[] args) {
        System.out.println(convertToSeconds(4));
        System.out.println(convertToSeconds(5));
    }
}
