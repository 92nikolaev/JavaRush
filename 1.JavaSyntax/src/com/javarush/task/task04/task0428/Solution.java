package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int cont = 0;
        if(a<0 && b<0 && c<0) {
            System.out.println(0);
        }else {
            if (a > 0)
                cont++;
            if (b > 0)
                cont++;
            if (c > 0)
                cont++;
            System.out.println(cont);
        }

    }
}
