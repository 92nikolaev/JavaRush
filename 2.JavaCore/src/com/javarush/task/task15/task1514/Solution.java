package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики 1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(2.2, "lol1");
        labels.put(2.1, "lol2");
        labels.put(2.3, "lol3");
        labels.put(2.4, "lol4");
        labels.put(2.5, "lol5");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
