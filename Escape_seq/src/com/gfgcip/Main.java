package com.gfgcip;

import java.util.Scanner;
 public class Main {
            public static int Nth_term(int a, int d, int n){

                int ans = a+(n-1)*d;
                return ans;
            }
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter 3 numbers ");
                int a = sc.nextInt();
                int d = sc.nextInt();
                int n = sc.nextInt();
                System.out.println(Nth_term(a,d,n));

            }
}