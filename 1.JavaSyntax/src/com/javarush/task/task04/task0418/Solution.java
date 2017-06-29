package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if(n>c){
            System.out.println(c);
        }else if(n<c){
            System.out.println(n);
        }else{
            System.out.println(c);
        }
    }
}