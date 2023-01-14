package com.gfgcip;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
//        int i = 1;
//        while (i<m){
//            System.out.println(n*i);
//            i++;
        for (int i = 1; i<m; i++  ){
            System.out.println(i*n);
    }


    }
}
