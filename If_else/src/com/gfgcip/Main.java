package com.gfgcip;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// Nested if else
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n = sc.nextInt();
        if(n>0) {
            System.out.println("Positive ");
            if (n % 2 == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        } else if(n<0) {
            System.out.println("Negative ");
            if (n % 2 == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }   else
            System.out.println("Zero");

                    }
                }









