package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread as = new SpecialThread();
        SpecialThread ad = new SpecialThread();
        SpecialThread af = new SpecialThread();
        SpecialThread ag = new SpecialThread();
        SpecialThread ah = new SpecialThread();
        list.add(new Thread(as));
        list.add(new Thread(ad));
        list.add(new Thread(af));
        list.add(new Thread(ag));
        list.add(new Thread(ah));
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
