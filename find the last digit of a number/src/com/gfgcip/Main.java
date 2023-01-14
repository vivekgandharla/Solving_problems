package com.gfgcip;
import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int y = Math.abs(n);
        int ans = y % 10;
        System.out.println(ans );


    }

}