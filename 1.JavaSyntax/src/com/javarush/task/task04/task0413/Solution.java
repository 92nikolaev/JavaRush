package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(reader.readLine());

        if(c<1 || c>7){
            System.out.println("такого дня недели не существует");
        }else if(c==1){
            System.out.println("понедельник");
        }else if(c==2){
            System.out.println("вторник");
        }else if(c==3){
            System.out.println("среда");
        }else if(c==4){
            System.out.println("четверг");
        }else if(c==5){
            System.out.println("пятница");
        }else if(c==6){
            System.out.println("суббота");
        }else if(c==7) {
            System.out.println("воскресенье");
        }
    }
}