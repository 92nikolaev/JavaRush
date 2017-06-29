package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Мама";
        String s1 = "Мыла";
        String s2 = "Раму";
        System.out.println(s+s1+s2);
        System.out.println(s1+s+s2);
        System.out.println(s1+s2+s);
        System.out.println(s+s2+s1);
        System.out.println(s2+s+s1);
        System.out.println(s2+s1+s);
    }
}
