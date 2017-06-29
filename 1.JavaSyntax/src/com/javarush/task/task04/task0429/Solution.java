package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int contNeg = 0;
        int cont = 0;
            if (a > 0) {
                cont++;
            }else if (a < 0){
                contNeg++;
            }
            if (b > 0){
                cont++;
            }else if (b < 0){
             contNeg++;
                }
            if (c > 0){
                cont++;
            }else if (c < 0){
                contNeg++;
            }


            System.out.println("количество положительных чисел: "+ cont);
        System.out.println("количество отрицательных чисел: "+ contNeg);



    }
}
