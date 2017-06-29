package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Zorba1","Mina");
        map.put("Galga","Alina");
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String,String> map2 = new HashMap<String,String>(map);
        HashMap<String,String> map3 = new HashMap<String,String>(map);

        Iterator<Map.Entry<String,String>> iterator2 = map2.entrySet().iterator();

        while(iterator2.hasNext()){
            Map.Entry<String,String> pair = iterator2.next();
            String volueMap2 = pair.getValue();
            int count = 0;
            Iterator<Map.Entry<String,String>> iterator3 = map3.entrySet().iterator();

            while (iterator3.hasNext()){
                Map.Entry<String,String> pair3 = iterator3.next();
                if(volueMap2.equals(pair3.getValue())){
                    count++;
                    if(count > 1){
                        removeItemFromMapByValue(map, volueMap2);
                    }
                }
            }




        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        /*HashMap<String,String> map = createMap();
        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String,String> pair : map.entrySet()) {
            System.out.println(pair.getKey() +" /// "+ pair.getValue());
        }*/
    }
}
