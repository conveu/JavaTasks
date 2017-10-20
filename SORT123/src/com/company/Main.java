package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String line = "S2 Thi1s T4est 3a";
        String finalline= "";
        String[] sline = line.split("\\W+");
        String[] sortline = new String[sline.length];
        String checker;
        System.out.println(Integer.parseInt(String.valueOf(sline[0].charAt(0))));
            for (int i = 0; i < sline.length; i++) {
                for (int j = 0; j < sline[i].length(); j++) {
                    checker=String.valueOf(i+1);

                    System.out.println(sline[i].matches("^\\D*$"));


                    //if(Integer.parseInt(String.valueOf(sline[i].charAt(j)))>0);
                      //  sortline[Integer.parseInt(String.valueOf(sline[i].charAt(j)))]=sline[i];
                   }


                }

            }

       // for(int i=0; i<sortline.length; i++)
         //   finalline+=" "+sortline[i];
        //System.out.println(finalline);

    }

