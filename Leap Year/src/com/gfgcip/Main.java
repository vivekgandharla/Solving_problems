package com.gfgcip;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if(year % 4==0 && year %100!=0){
            System.out.println("Yes");
        }else if(year % 400==0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }


    }
}
