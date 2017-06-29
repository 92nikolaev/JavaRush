package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        boolean stop = false;

        while(!stop){
            String s = reader.readLine();
            if(s.equals("сумма")){
                stop = true;
            }else {
                int a = Integer.parseInt(s);
                count += a;
            }


        }
        System.out.println(count);
    }
}
