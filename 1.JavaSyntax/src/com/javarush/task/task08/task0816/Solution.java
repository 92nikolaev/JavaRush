package com.javarush.task.task08.task0816;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone1", new Date("JANUARY 1 1980"));
        map.put("Stallone2", new Date("FEBRUARY 1 1980"));
        map.put("Stallone3", new Date("MARCH 1 1980"));
        map.put("Stallone4", new Date("APRIL 1 1980"));
        map.put("Stallone5", new Date("MAY 1 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("AUGUST 1 1980"));
        map.put("Stallone8", new Date("SEPTEMBER 1 1980"));
        map.put("Stallone9", new Date("OCTOBER 1 1980"));
        map.put("Stallone0", new Date("NOVEMBER 1 1980"));


        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Date> pair = iterator.next();
            int mons = pair.getValue().getMonth();
            if(mons>4 && mons<8){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
       /* HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
        for (Map.Entry<String,Date> pair: map.entrySet() ) {
            System.out.println(pair.getKey());
        }*/
    }
}
