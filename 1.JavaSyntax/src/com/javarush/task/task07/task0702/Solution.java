package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = new String[10];

        for (int i = 0; i <s.length-2; i++) {
            s[i] = reader.readLine();
        }

        for (int i = s.length -1; i >= 0 ; i--) {
            System.out.println(s[i]);
        }
    }
}