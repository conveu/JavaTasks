package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String a="zz";
        String b="fdszzfsdf zzfsdfsd zzsdfsdf";
        int counter=0;
        System.out.println(b);
        while(true) {

            int numb = b.indexOf(a);
            if(numb==-1)
                break;
            System.out.println(b.substring(numb + a.length()));
            b = b.substring(numb + a.length());
            counter++;
        }
        System.out.println(counter);
    }
}
