package com.maxdrob.company.Lesson4.AllTasksFromLesson4;

public class L4T1 {

    public static void main(String[] args) {
        String[] quote = {"я","не","уверен", "что","это сработает","но","выбора нет","надо кодить или идти работать в макдональдс"};
        int maxLengthString = 0;
        for(int i=0;i<quote.length;i++){
            if(quote[i].length()>maxLengthString){
                maxLengthString = quote[i].length();
            }
        }
        for(int i=0;i<quote.length;i++){
            if(quote[i].length()==maxLengthString){
                System.out.println(quote[i]);
            }
        }


    }

}
