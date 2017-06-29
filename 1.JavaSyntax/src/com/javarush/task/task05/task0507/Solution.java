package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int count = 0, i = 0;
        double summa = 0;
        while(i != -1)
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int m = Integer.parseInt(reader.readLine());
            i = m;
            count = count + 1;
            summa = summa + m;
        }
        summa = (summa + 1) / (count - 1);
        System.out.println(summa);
    }
    }


