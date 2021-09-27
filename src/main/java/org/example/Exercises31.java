package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tiffany Thani
 */

public class Exercises31 {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            float rate;
            try {
                System.out.print("Enter your Age : ");
                int age = s.nextInt();
                System.out.print("Enter your resting heart rate : ");
                float restingHR = s.nextFloat();
                System.out.println("Resting Pulse : " + restingHR + "      Age : " + age);
                System.out.println("Intensity   | Rate");
                System.out.println("------------|----------");
                for (int intensity = 55; intensity <= 95; intensity += 5) {
                    rate = (((220 - age) - restingHR) * intensity/100) + restingHR;
                    System.out.println(intensity + "%" + "         | " + Math.round(rate) + " bpm");
                }
            } catch(Exception e) {
                System.out.println("Enter only numbers...");
            }
        }

}

