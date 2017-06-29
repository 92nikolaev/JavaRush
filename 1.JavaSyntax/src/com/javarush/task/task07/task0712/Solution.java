package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        int shortest = Integer.MAX_VALUE;
        int shortestPosition = 0;
        int largest = 0;
        int largestPosition = 0;
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() < shortest) {
                shortest = strings.get(i).length();
                shortestPosition = i;
            }
            if (strings.get(i).length() > largest) {
                largest = strings.get(i).length();
                largestPosition = i;
            }
        }
        System.out.println(shortestPosition > largestPosition ? strings.get(largestPosition) : strings.get(shortestPosition));
    }
    }

