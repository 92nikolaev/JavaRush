package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        int[] a = new int[5];
        int[] b = new int[2];
        int[] c = new int[4];
        int[] d = new int[7];
        int[] e = new int[0];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random()*5);
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random()*100);
        }
        for (int i = 0; i < c.length; i++) {
            c[i] = (int) (Math.random()*100);
        }
        for (int i = 0; i < d.length; i++) {
            d[i] = (int) (Math.random()*100);
        }
        for (int i = 0; i < e.length; i++) {
            e[i] = (int) (Math.random()*100);
        }

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        return list;

    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
