package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
//Считать строки с консоли и объявить ArrayList list тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        int arrListSize = list.size();

        ArrayList result = doubleValues(list);

//Вывести на экран result
        for (int i = 0; i < arrListSize * 2; i++) {
            System.out.println(result.get(i));
        }
    }

    public static ArrayList doubleValues(ArrayList list) {
        //напишите тут ваш код
        int arrListSize = list.size();
        for (int i = 0; i < arrListSize * 2; i += 2) {
            list.add(i, list.get(i));
        }
        return list;
    }
}