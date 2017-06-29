package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        int g = max(a,b);
        int w = max(c,d);

        resul(g,w);

    }
    public static int max(int a, int b){
        if(a>=b){
            return a;
        }else {
            return b;
        }
    }
    public static void resul(int a, int b){
        if(a>=b){
            System.out.println(a);;
        }else {
            System.out.println(b);;
        }
    }
}
