package com.gfgcip;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
         if(a>=b && a>=c){
             System.out.println(a);
         } else if(b>=c && b >=a){
             System.out.println(b);
         } else {
             System.out.println(c);
         }
    }
}
