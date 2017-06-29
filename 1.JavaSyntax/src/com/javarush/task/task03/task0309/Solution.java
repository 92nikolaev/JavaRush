package com.javarush.task.task03.task0309;

/* 
Сумма 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        int num = 0;
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i <10; i++) {
           num = num + arr[i];
            System.out.println(num);
        }
    }
}
