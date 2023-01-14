package com.gfgcip;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Calculator
        Scanner sc = new Scanner(System.in);
        System.out.println("Select an operation\n 1.Addition\n 2.Subtraction \n 3.Multiplication");
        int operation = sc.nextInt();
        if (operation != 1 && operation != 2 && operation != 3) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("Enter first number: ");
            int a = sc.nextInt();
            System.out.println("Enter Second number: ");
            int b = sc.nextInt();

            if (operation == 1) {
                System.out.println(a + b);
            } else if (operation == 2) {
                System.out.println(a - b);
            } else {
                System.out.println(a * b);
            }


        }
    }}
