package com.company;




public class Main {

    public static String removeChar(String s, char c) {
        String r = "";
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) != c) r += s.charAt(i);
        }
        return r;
    }

    public static String seriussum(int n) {
        double sum = 1;
        double k = 1;
        double l;

        for (int i=0; i < n; i++) {
            k = k + 3;
            l = 1 / k;
            sum += l;

        }
        sum = Math.rint(100.0 * sum) / 100.0;
        String res;
        res=String.valueOf(sum);
        return res;
    }

    public static void main(String[] args) {
	// write your code here

        //System.out.println(seriussum(100));
        String qwert = "12312.30";
        qwert.split("");

        //if(qwert.charAt(qwert.length())==0)
          //  removeChar(qwert, Integer.valueOf(qwert.length()));
        System.out.println((qwert.charAt(qwert.length() - 1)).equals(0));
    }
}
