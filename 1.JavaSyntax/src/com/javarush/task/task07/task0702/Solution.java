package com.javarush.task.task07.task0702;

/*
Массив из строчек в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader arra = new BufferedReader(new InputStreamReader(System.in));
        String[] arra1 = new String[10];
        for (int i = 0; i < arra1.length - 2; i++) {
            arra1[i] = arra.readLine();
        }

            for (int i = arra1.length - 1; i > -1; i--) {
                System.out.println(arra1[i]);
            }
       /*
     BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = new String[10];

        for (int i = 0; i < str1.length-2; i++) {
            str1[i] = str.readLine();
        }
        for (int i = str1.length-1; i > -1; i--) {
            System.out.println(str1[i]);
        } */ //напишите тут ваш код
    }
}