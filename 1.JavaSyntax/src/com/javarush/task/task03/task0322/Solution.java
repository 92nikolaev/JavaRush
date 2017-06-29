package com.javarush.task.task03.task0322;


/* 
Большая и чистая
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        System.out.println(name + " + " + name1 + " + " + name2 + " = Чистая любовь, да-да!");
    }
}