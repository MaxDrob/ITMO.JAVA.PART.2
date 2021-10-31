package com.maxdrob.company.Lesson6;

public class Study {
    private String course;

    public String printCourse() {
        return this.course;
    }

    public Study(String course) {
        this.course = course;
    }

}

class JavaProgram {
    public static void main(String[] args) {
        Study StudyPrint = new Study("Программирование - это НЕ просто...");
        System.out.println(StudyPrint.printCourse());
    }
}
