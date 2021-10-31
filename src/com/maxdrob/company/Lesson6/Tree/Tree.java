package com.maxdrob.company.Lesson6.Tree;


    public class Tree {
        private String name;
        private int age;
        private boolean LivesOrNot;

        public Tree(String name, int age, boolean LivesOrNot) {
            this.name = name;
            this.age = age;
            this.LivesOrNot = LivesOrNot;
        }
        public Tree(String name, int age) {
            this(name,age, true);
        }
        public Tree() {
            System.out.println("Empty constructor works");
        }

        @Override
        public String toString() {
            return "Tree type " + name +
                    "{Age " + age + " years, " +
                    ((LivesOrNot) ? "The tree lives" : "dead") +
                    '}';
        }
    }


