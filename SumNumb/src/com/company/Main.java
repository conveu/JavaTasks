package com.company;



public class Main {


    public static int rowSumOddNumbers(int n) {
        int counter = 1;
        int result = 0;
        int h=0;
        for(int i=1; i<n;i++){
            h=h+i;
        }
        for (int i=0;i<h;i++){
            counter=counter+2;
        }
        result=counter;
        for (int i=1;i<n;i++){
            counter=counter+2;
            result=result+counter;
        }
        System.out.println("n: " + n + " h: " + h + " counter: " +counter +" result: " + result);
        System.out.println();
        return h;
    }

    public static void main(String[] args) {
	// write your code here
        rowSumOddNumbers(3);
        rowSumOddNumbers(4);
        rowSumOddNumbers(5);
        rowSumOddNumbers(6);

    }
}
