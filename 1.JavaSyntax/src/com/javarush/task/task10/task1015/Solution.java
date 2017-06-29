package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] lists = new ArrayList[3];

        ArrayList<String> first = new ArrayList<>();
        ArrayList<String> second = new ArrayList<>();
        ArrayList<String> third = new ArrayList<>();

        for (int i = 0; i <10; i++) {
           first.add("first"+i);
           second.add("second"+ i);
           third.add("third"+ i);
        }
        lists[0]=(first);
        lists[1]=(second);
        lists[2]=(third);

        return lists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}