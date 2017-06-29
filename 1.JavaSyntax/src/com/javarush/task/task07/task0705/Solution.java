package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[]a = new int[20];
        int[]b = new int[10];
        int[]c = new int[10];

        for (int i = 0; i <a.length; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i <a.length; i++) {
            if(i<10){
                b[i] = a[i];
            }else{
                c[i-10] = a[i];
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
