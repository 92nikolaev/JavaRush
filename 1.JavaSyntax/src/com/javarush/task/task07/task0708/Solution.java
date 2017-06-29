package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        int maxLengs = list.get(0).length();
        for (int i = 1; i <list.size() ; i++) {
            if(maxLengs<list.get(i).length()){
                maxLengs = list.get(i).length();
            }
        }

        for (int i = 0; i <list.size(); i++) {
            if(list.get(i).length()==maxLengs){
                System.out.println(list.get(i));
            }
        }
    }
}
