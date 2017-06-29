package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        Iterator<Integer> iterator = set.iterator();

        while(iterator.hasNext()){
            int a = iterator.next();
            if(a > 10){
                iterator.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) {
       /* HashSet<Integer> set = createSet();
        for (int i :set ) {
            System.out.println(i);
        }
        removeAllNumbersMoreThan10(set);
        for (int i :set ) {
            System.out.println(i);
        }*/
    }
}
