package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];
        for (int i = 0; i < list.length; i++){
            list[i] = Integer.parseInt(reader.readLine());
        }
        int[] list1 = new int[10];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = list[i];
        }
        int [] list2 = new int [10];
        for (int i = 0; i < list2.length; i++ ) {
            list2 [i] = list[i + 10];
        }
        for (int i = 0; i < list2.length; i++){
            System.out.println(list2[i]);
        }//напишите тут ваш код
    }
}
