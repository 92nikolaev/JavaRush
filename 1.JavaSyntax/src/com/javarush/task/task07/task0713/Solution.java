
package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listNch = new ArrayList<>();
        ArrayList<Integer> listCh = new ArrayList<>();
        ArrayList<Integer> listLost = new ArrayList<>();

        for (int i = 0; i <20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i <list.size(); i++) {
            if(list.get(i)%3==0 && list.get(i)%2==0){
                listCh.add(list.get(i));
                listNch.add(list.get(i));
            }else if(list.get(i)%3==0 ){
                listNch.add(list.get(i));
            }else if(list.get(i)%2==0){
                listCh.add(list.get(i));
            }else{
                listLost.add(list.get(i));
            }
        }
        printList(listNch);
        printList(listCh);
        printList(listLost);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
