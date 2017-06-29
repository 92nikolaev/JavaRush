package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
       private String name0;
        private String name1;
        private int name2;
        private char name3;
        private double name4;
        private long name5;



        public Human() {
        }

        public Human(String name0, String name1) {
            this.name0 = name0;
            this.name1 = name1;
        }

        public Human(String name0, String name1, int name2) {
            this.name0 = name0;
            this.name1 = name1;
            this.name2 = name2;
        }

        public Human(String name0, String name1, int name2, char name3) {
            this.name0 = name0;
            this.name1 = name1;
            this.name2 = name2;
            this.name3 = name3;
        }

        public Human(String name0, String name1, int name2, char name3, double name4) {
            this.name0 = name0;
            this.name1 = name1;
            this.name2 = name2;
            this.name3 = name3;
            this.name4 = name4;
        }

        public Human(String name0, String name1, int name2, char name3, double name4, long name5) {
            this.name0 = name0;
            this.name1 = name1;
            this.name2 = name2;
            this.name3 = name3;
            this.name4 = name4;
            this.name5 = name5;
        }

        public Human(String name0, double name4) {
            this.name0 = name0;
            this.name4 = name4;
        }

        public Human(String name0, long name5) {
            this.name0 = name0;
            this.name5 = name5;
        }

        public Human(String name0, String name1, long name5) {
            this.name0 = name0;
            this.name1 = name1;
            this.name5 = name5;
        }

        public Human(String name0, int name2, char name3, double name4, long name5) {
            this.name0 = name0;
            this.name2 = name2;
            this.name3 = name3;
            this.name4 = name4;
            this.name5 = name5;
        }
    }
}
