package com.maxdrob.company.Lesson4.AllTasksFromLesson4;

public class L4T3 {
    public static void main(String[] args) {
        String source = "Не надо делать гадость чловеку который тебе помогает. А коли сделал гадость, то прилетит тебе в ответ и тут уж не удивляйся";
        source = source.replaceAll("гадость", "-нехорошее слово-");
        System.out.println(source);
    }
}
