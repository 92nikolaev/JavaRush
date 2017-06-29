package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(reader.readLine());

       if(b>0 && b < 1000){
           if(b<10 && b%2 == 0){
               System.out.println("четное однозначное число");
           }else if(b<10 && b%2 != 0){
               System.out.println("нечетное однозначное число");
           }else if (b<=99 && b%2 == 0){
               System.out.println("четное двузначное число");
           }else if (b<=99 && b%2 != 0){
               System.out.println("нечетное двузначное число");
           }else if (b%2 == 0){
               System.out.println("четное трехзначное число");
           }else if (b%2!=0){
               System.out.println("нечетное трехзначное число");
           }
       }
    }
}
