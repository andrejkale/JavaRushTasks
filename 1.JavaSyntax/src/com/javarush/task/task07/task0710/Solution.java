package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            String s = reader.readLine();
            list.add(0, s);
        }
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }//напишите тут ваш код
    }
}
