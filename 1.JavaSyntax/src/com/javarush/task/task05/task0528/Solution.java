package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
        System.out.println(simpleDateFormat.format(date));
    }
}
