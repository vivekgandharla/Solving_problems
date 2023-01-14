package com.gfgcip;

import java.util.Scanner;

public class Main {
        Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        //break and continue

        for(int i = 0; i <5 ; i++){
//            if(i == 3)
            if (i ==1 || i == 2)
                continue;
            System.out.println(i);
        }


    }
}
