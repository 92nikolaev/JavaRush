package com.javarush.task.task12.task1209;

/* 
Три метода возвращают минимальное из двух переданных в него чисел
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int min(int a, int b){
        if(a<b){
            return a;
        }else {
            return b;
        }
    }
    public static long min(long a, long b){
        if(a<b){
            return a;
        }else{
            return b;
        }
    }
    public static double min (double a, double b){
        if(a<b){
            return a;
        }else{
            return b;
        }
    }
}
