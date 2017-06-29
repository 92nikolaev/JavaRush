package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
        int[] list = new int[20];
        for (int i = 0; i < list.length; i++) {
            int a = Integer.parseInt(reader.readLine());
            list[i] = a;
        }
        maximum = list[0];
        minimum = list[0];
        for (int i = 1; i <list.length; i++) {
            if(minimum>list[i]){
                minimum = list[i];
            }else if (maximum < list[i]){
                maximum = list[i];
            }
        }

        System.out.print(maximum +" ");
        System.out.print(minimum);
    }
}
