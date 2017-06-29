package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader =  null; new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileRed = null;
        BufferedReader fileRead = null;
        ArrayList<Integer> list = new ArrayList<>();

        try{
            reader =  new BufferedReader(new InputStreamReader(System.in));
            String nameFile = reader.readLine();
            fileRed = new FileInputStream(nameFile);
            fileRead = new BufferedReader(new InputStreamReader(fileRed));

            while(fileRead.ready()){
                String ch = fileRead.readLine();
                int tmp = Integer.parseInt(ch);
                list.add(tmp);
            }

        }catch (IOException e){
            System.out.println("Error");
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileRed.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileRead.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Collections.sort(list);

        for (int a: list) {
            if(a%2 == 0){
                System.out.println(a);
            }

        }
    }
}
