package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();

        //add your code here - добавьте код тут
    }

    public static Flyable result;

    public static void reset() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            if(s.equals("helicopter")){
                result = new Helicopter();
            }else if(s.equals("plane")) {
                int count = Integer.parseInt(reader.readLine());
                result = new Plane(count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
