package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

            Date curDate = new Date(date);
            Date begOfYear = new Date(date);
            begOfYear.setMonth(0);
            begOfYear.setDate(1);
            begOfYear.setHours(0);
            begOfYear.setMinutes(0);
            begOfYear.setSeconds(0);
            long diffMs = curDate.getTime() - begOfYear.getTime();
            long dayMs = 24*60*60*1000;
            long days = diffMs/dayMs;
            long day = days + 1;
            return day % 2 != 0;
        }

    }

