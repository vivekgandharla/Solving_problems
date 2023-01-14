package com.gfgcip;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a = 1;a <= n; a++){
            for (int b = n; a <= b; b--){
                System.out.print("*");
            }
            System.out.println();
        }




    }}
