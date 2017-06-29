package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Куликов45","Гоша");
        map.put("Петечкин34","Петя");
        map.put("Назаров34","Гоша");
        map.put("Широкий23","Жора");
        map.put("Узков23","Стас");
        map.put("Петрухин23","Саня");
        map.put("Филипов23","Гоша");
        map.put("Узков23","Стас");
        map.put("Петрухин23","Саня");
        map.put("Филипов23","Гоша");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
