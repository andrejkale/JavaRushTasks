package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int [] arr = new int[20];
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < 20 ; i++) {
            arr[i] = Integer.parseInt(reader.readLine());

        }
        for (int a:arr) {
            if (a > maximum){
                maximum = a;
            }
            if (a < minimum){
                minimum = a;
            }
            
        }

        //напишите тут ваш код

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
