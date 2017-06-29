package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int chet = 0;
        int nechet = 0;
        int[] a = new int[15];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i <a.length; i++) {
            if(i%2==0){
                chet+=a[i];
            }else{
                nechet+=a[i];
            }
        }
        if(chet > nechet){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }else{
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }

    }
}
