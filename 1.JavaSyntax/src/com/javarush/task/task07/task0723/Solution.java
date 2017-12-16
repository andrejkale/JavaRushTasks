package com.javarush.task.task07.task0723;

/* 
Обратный отсчёт
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 30; i >= 0; i--) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);

            //напишите тут ваш код
        }

        System.out.println("Бум!");
    }
}
