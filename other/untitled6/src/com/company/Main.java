package com.company;

public class Main {

    static double add(double x){
        return x;
    }
    static double add(double x, double y){
        return x+y;
    }
    static double add(double x,double y, double z){
        return x+y+z;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(add(1));
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
    }
}
