package com.company;





public class masslist {


    public static Double seriussum(int n) {
        double sum = 0;
        double k = 1;
        double l;

        for (int i=0; i < n; i++) {
            k = k + 3;
            l = 1 / k;
            sum += l;

        }
        return sum;
    }
}
