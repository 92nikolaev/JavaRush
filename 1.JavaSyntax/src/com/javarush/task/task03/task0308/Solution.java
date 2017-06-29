package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {

            int sum = 1;
            int[] arr = {1,2,3,4,5,6,7,8,9,10};
            for (int i=0;i<10;i++){
                sum=sum*arr[i];}
            System.out.print(sum);


    }
}
