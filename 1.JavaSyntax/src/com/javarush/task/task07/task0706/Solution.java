package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int[] list = new int[15];
       int chet = 0;
       int nechet = 0;
       for (int i = 0; i < list.length; i++){
           list [i] = Integer.parseInt(reader.readLine());
           if(i % 2 == 0) chet += list[i];
           else if (i == 0) chet += list[i];
           else nechet += list[i];
       }
       if (chet > nechet) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");//напишите тут ваш код
    }
}
