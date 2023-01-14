package com.gfgcip;
class point{
    int x ;
    int y ;
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        point p1 = new point();
        p1.x = 10; p1.y = 20;
        point p2 = p1;
        p2.x=30;
        System.out.println(p1.x);
        System.out.println(p2.x);
        //non-primitive datatypes are always references

    }
}
