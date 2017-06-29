package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int a = 365;
        int b = 366;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String c = reader.readLine();
        int c2 = Integer.parseInt(c);
        if(c2%4==0 && c2%100!=0){
            System.out.println("количество дней в году: " + b);
        }
        else if(c2%4==0 && (c2%100==0 && c2%400==0)){
            System.out.println("количество дней в году: " + b);
        }
        else {
            System.out.println("количество дней в году: " + a);
        }
    }
}