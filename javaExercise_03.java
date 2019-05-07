package com.company;

import java.util.Scanner;

public class Main {

    //This is declaring a constant of the value Pi.
    public final  static double PI=3.14;


    public static void main(String[] args) {

        //Instanciate an object of type scanner
        Scanner scanner=new Scanner(System.in);
        //Asking for player input
        System.out.println("Enter the radious of the circle:");
        //Store the entered value inside a duble type value
        double radius =scanner.nextDouble();

        //This will return the perimeter of the circle
        System.out.println("The perimeter of the circle = "+ (2*(PI*radius)));

        //This will return the area of the circle.
        System.out.println("The area of the circle is= "+(PI*(radius*radius)));


    }
}
