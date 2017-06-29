package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i <11; i++) {
            for (int j = 1; j <11; j++) {
                int a = i * j;
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
