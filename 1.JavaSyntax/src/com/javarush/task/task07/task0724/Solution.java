package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
       Human grend1 = new Human("Lox", true, 25);
       Human grend2 = new Human("Lox2", true, 25);
       Human grendmama = new Human("Mam", false, 25);
       Human grendmama1 = new Human("Mam2", false, 25);
       Human mama = new Human("dorr", false, 25, grend1,grend2);
       Human papa = new Human("gena", true, 20, grend2,grendmama1);
       Human child = new Human("toto", true, 12,mama, papa);
       Human child1 = new Human("toto", true, 12,mama, papa);
       Human child2 = new Human("toto", true, 12,mama, papa);

        System.out.println(grend1.toString());
        System.out.println(grend2.toString());
        System.out.println(grendmama.toString());
        System.out.println(grendmama1.toString());
        System.out.println(mama.toString());
        System.out.println(papa.toString());
        System.out.println(child.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());

    }


    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

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

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















