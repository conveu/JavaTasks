package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i=1234;
        String lenght =(Integer.toBinaryString(i));

        double lenght1 = Math.ceil(lenght.length()/2);
        int res = (int)Math.ceil(lenght.length()+1)/2;

        System.out.println(res);
    }
}
