package com.maxdrob.company.Lesson6.Tree;

public class TreeMainOne {
    public static void main(String[] args) {

        Tree tree1 = new Tree();
        System.out.println(tree1);
        Tree tree2 = new Tree("Oak", 99);
        System.out.println(tree2);
        Tree tree3 = new Tree("Birch", 1000, false);
        System.out.println(tree3);
    }
}
