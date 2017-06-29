package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human g1 = new Human("Lol", true, 2);
        Human g2 = new Human("Lol", true, 2);
        Human g3 = new Human("Lol", false, 2);
        Human g4 = new Human("Lol", false, 2);
        Human gpa = new Human("Lol", true, 2);
        Human gma = new Human("Lol", false, 2);
        Human gCh = new Human("Lolv", true, 2);
        Human gCh1 = new Human("Lolv", true, 2);
        Human gCh2 = new Human("Lolv", true, 2);

        g1.children.add(gpa);
        g2.children.add(gma);
        g3.children.add(gpa);
        g4.children.add(gma);
        gpa.children.add(gCh);
        gpa.children.add(gCh1);
        gpa.children.add(gCh2);
        gma.children.add(gCh);
        gma.children.add(gCh1);
        gma.children.add(gCh2);


        System.out.println(g1.toString());
        System.out.println(g2.toString());
        System.out.println(g3.toString());
        System.out.println(g4.toString());
        System.out.println(gpa.toString());
        System.out.println(gma.toString());
        System.out.println(gCh.toString());
        System.out.println(gCh1.toString());
        System.out.println(gCh2.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;

        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
