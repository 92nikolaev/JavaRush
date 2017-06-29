package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(reader.readLine());
        if(c>0){
            System.out.println(c+c);
        } else if (c < 0) {
            System.out.println(c+1);
        }else{
            System.out.println(0);
        }

    }

}