package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("Иванов", 100);
        map.put("Петров", 200);
        map.put("Сидоров", 300);
        map.put("Слонов", 400);
        map.put("Бегемотов", 500);
        map.put("Котов", 700);
        map.put("Песов", 800);
        map.put("Жрецов", 900);
        map.put("Каркар", 1000);
        map.put("Мяу", 1100);

        return map;

    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<String,Integer> pair = iterator.next();
            if(pair.getValue()<500){
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {

    }
}