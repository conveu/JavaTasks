package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* write your code here
        String text,text1;
        text="123456789";
        text1=text.substring(1,5);

        System.out.println(text1);*/



        Scanner in = new Scanner(System.in);
        int egg = in.nextInt();

        String EggS=Integer.toString(egg);
        String[] EggArray = EggS.split("");
        int Length=EggArray.length;

        int lastNum = Integer.parseInt(EggArray[Length-1]);

        int flag=0;
        if (Length>1) {
            String last2Num = EggArray[Length - 2] + EggArray[Length - 1];
            int last2Numi = Integer.parseInt(last2Num);
            flag=1;
            System.out.println(last2Num);
            System.out.println(last2Numi);
        }
        System.out.println(lastNum);


        int[] badnumbers= {11,12,13,14,15,16,17,18,19};

        if (flag==1){
            if(last2Numi==badnubers){
                System.out.println("/n Яиц", egg);
            }
        }


        //System.out.println(EggArray);
    }
}
