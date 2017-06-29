package com.javarush.task.task01.task0131;

/* 
Полнометражная картина
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }

    public static int getMetreFromCentimetre(int centimetre) {
        //напишите тут ваш код
      int  i = centimetre/100;
        return  i;
    }
}