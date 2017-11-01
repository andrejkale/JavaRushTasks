package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList numbers = new ArrayList();
        for (int i = 0; i < 5; i += 1)
        {
            int number = Integer.parseInt(reader.readLine());
            numbers.add(number);
        }
        Collections.sort(numbers);

        for (int i = 0; i < 5; i += 1)
        {
            System.out.println(numbers.get(i));
        }
    }
}
