package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    static final int RED_TIME = 1;
    static final int YELLOW_TIME = 1;
    static final int GREEN_TIME = 3;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double time = sc.nextDouble();
        int i = (int)time/(RED_TIME+YELLOW_TIME+GREEN_TIME);
        if (time < 0 || time > 60){
            System.out.println("такого времени нет");
        }else if (time-i*5 >= 0&&time-i*5 < 3){
            System.out.println("зелёный");
        }else if (time-i*5 >= 3&&time-i*5 < 4){
            System.out.println("желтый");
        }else{
            System.out.println("красный");
        }

    }
}