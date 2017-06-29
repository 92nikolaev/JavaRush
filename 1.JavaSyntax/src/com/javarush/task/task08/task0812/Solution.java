package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int res = 1;
        int num = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == list.get(i + 1)) {
                num++;
                if (res < num) {
                    res = num;
                }
            } else {
                num = 1;
            }
        }
        System.out.println(res);
    }
}