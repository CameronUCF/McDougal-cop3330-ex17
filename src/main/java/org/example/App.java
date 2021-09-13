/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cameron McDougal
 */

package org.example;
import java.util.Scanner;

public class App
{
    static final double MALE = 0.73;
    static final double FEMALE = 0.66;
    public static void main( String[] args )
    {
        int gender;
        int alcoholAmount;
        int weight;
        int hours;
        double bac;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a 1 if you are male or a 2 if you are female:");
        gender = scanner.nextInt();

        System.out.println("How many ounces of alcohol did you have?");
        alcoholAmount = scanner.nextInt();

        System.out.println("What is your weight, in pounds?");
        weight = scanner.nextInt();

        System.out.println("How many hours has it been since your last drink?");
        hours = scanner.nextInt();

        scanner.close();

        if(gender == 1)
            bac = ((alcoholAmount * 5.14) / (weight * MALE)) - (0.15 * hours);
        else if(gender == 2)
            bac = (alcoholAmount * (5.14 / (weight * FEMALE))) - (0.15 * hours);
        else
        {
            System.out.println("Invalid gender.");
            return;
        }

        System.out.printf("Your BAC is %.6f\n", bac);

        if(bac >= 0.08)
        {
            System.out.println("It is not legal for you to drive.");
            return;
        }

        System.out.println("It is legal for you to drive.");
    }
}