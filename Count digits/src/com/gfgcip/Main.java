package com.gfgcip;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        while(n > 0){
            n = n/10;
            x = x+1;
        }
        System.out.println(x);



    }
}
