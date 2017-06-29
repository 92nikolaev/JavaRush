package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str=reader.readLine();
        int chis = Integer.parseInt(str);
        for (int i=0; i<str.length();i++) {
            if (chis%2==0)
                even++;
            else {
                odd++;}
            chis=(chis-chis%10)/10;
        }
        System.out.println("Even: " +even+ " Odd: " +odd);
    }
}
