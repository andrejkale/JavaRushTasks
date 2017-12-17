package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> list = new ArrayList<>();
        Human human1 = new Human("Vasya", true, 40);
        list.add(human1);
        Human human2 = new Human("Katya", false, 39);
        list.add(human2);
        Human human3 = new Human("Petya", true, 21);
        list.add(human3);
        Human human4 = new Human("Ira", false, 19);
        list.add(human4);
        Human human5 = new Human("Jon", true, 19, human1, human2);
        list.add(human5);
        Human human6 = new Human("Joni", true, 1, human3, human4);
        list.add(human6);
        Human human7 = new Human("Peter", true, 10, human3, human2);
        list.add(human7);
        Human human8 = new Human("Sarah", false, 2, human1, human4);
        list.add(human8);
        Human human9 = new Human("Julia", false, 10, human3, human2);
        list.add(human9);
        for (Human s : list) {
            System.out.println(s);
        }
        //напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















