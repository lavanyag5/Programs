package com.practice;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        // Area of circle is Pi*r^2;
        System.out.println("Main method started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        int radius = sc.nextInt();
        System.out.println("The Radius of circle is " + radius);

        float pi = 3.142f;
        float result = pi * radius * radius;
        System.out.println("Area of circle is " + result);
        System.out.println("Main method ended");
    }
}

//OUTPUT:
/*
Main method started
Enter radius of circle:
2
The Radius of circle is 2
Area of circle is 12.568
Main method ended
*/
