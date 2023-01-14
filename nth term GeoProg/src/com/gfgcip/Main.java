package com.gfgcip;
import java.util.Scanner;

public class Main {

    public static int Nth_term(int a , int r , int n){
        int ans = a*(int)(Math.pow(r,n-1)); //because the (n-1) pow will give its output in double we've typercasted it using int.
        return ans;
    }
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(Nth_term(a,r,n));


    }


}