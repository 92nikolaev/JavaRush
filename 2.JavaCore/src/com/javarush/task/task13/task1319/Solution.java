package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {

            BufferedReader reader = null;
            BufferedWriter writer = null;

            ArrayList<String> list = new ArrayList<>();
            boolean read = false;


            try{
                reader = new BufferedReader(new InputStreamReader(System.in));
                String nameFile = reader.readLine();
                while(!read){
                    String str = reader.readLine();
                    if(str.equals("exit")){
                        list.add(str);
                        read = true;
                    }else{
                        list.add(str);
                    }
                }

                writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nameFile)));

                for (String s : list) {
                    writer.write(s);
                    writer.newLine();

                }
                writer.flush();




            }catch (IOException e){
                System.out.println("Error");
            }finally {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

}
