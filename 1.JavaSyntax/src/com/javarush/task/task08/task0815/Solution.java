package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Zorba1","Mina");
        map.put("Galga","Aliona");
        map.put("Venda","Zina");
        map.put("Merca","Alina");
        map.put("Armada","Nicoleta");
        map.put("Zorba","Vasilina");
        map.put("Ghenas","Zina");
        map.put("Mara","Zuta");
        map.put("Merkel","Angela");
        map.put("Obama","Barak");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String,String> pair: map.entrySet() ){
            if(pair.getValue().equals(name)){
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String,String> pair: map.entrySet() ){
            if(pair.getKey().equals(lastName)){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
