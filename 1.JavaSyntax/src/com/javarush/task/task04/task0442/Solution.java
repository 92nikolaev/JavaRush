
package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean status = true;
        int count = 0;
        while(status){
            int a = Integer.parseInt(reader.readLine());
            count+=a;
            if(a == -1){
                status=false;
                System.out.println(count);
            }
        }
    }
}
