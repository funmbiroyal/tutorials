package com.deitelExercises;

public class Statement {
    public static void main (String [] args){
        System.out.println("Understanding if statements");
        String name = "Semicolo";
        if (name == "Semicolon"){
            System.out.println("Mavens");
        }
        else
        {
            System.out.println("Not Mavens");

            System.out.println();
        }

        System.out.println("Nested if Statements");
        int i = 2;
        if(i > 0){
            System.out.println(i + " is greater than 0");
            if(i < 10){
                System.out.println(i + " is less than 10 at the same time");

            }
        }
        else{System.out.println("This is incorrect!");}



    }
}

