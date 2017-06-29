package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        for (String word : list) //бежим по списку, который принял метод countWords, а это список words, в этом случае
        {
            if (result.containsKey(word)) //проверяем, есть ли такое слово в хэшмап result в ячейке Key,
            {
                result.put(word, result.get(word) + 1); //если есть, тогда добавляем строку в Key, а Value увеличиваем на 1
            }
            else
            {
                result.put(word, 1);// если нет такого слова, которое проверяет условия лупа, тогда помещаем слово в Key, а единицу в Value
            }
        }
        return result;
    }


}

