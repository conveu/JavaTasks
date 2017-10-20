package com.company;

import java.util.Scanner;

public class Aeroflot {
    String target;
    int flightnum;
    String planetype;
    Aeroflot[] aeroflot = new Aeroflot[5];


    public Aeroflot(String s1, int i1, String s2){
        target = s1;
        flightnum = i1;
        planetype = s2;

    }

    public void inputAero(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пунк назначения");
        target = in.next();
        System.out.println("Введите номер рейса");
        flightnum = in.nextInt();
        System.out.println("Введите тип самолёта");
        planetype = in.next();
        System.out.println();
        printInfo();
        }


    public static Aeroflot[] sortMass(Aeroflot[] aeroflot){

        boolean check=false;
        int i=0;
        Aeroflot temporary;
        while(true){
            if (aeroflot[i].flightnum<aeroflot[i+1].flightnum){
                temporary=aeroflot[i+1];
                aeroflot[i+1]=aeroflot[i];
                aeroflot[i]=temporary;
                check=false;
            }

            if(i==aeroflot.length-2&&check==false)
                check=true;
            else if(i==aeroflot.length-2&&check==true)
                break;

            if (i==(aeroflot.length-2))
                i=0;
            else
                i++;
        }
        return aeroflot;
    }



    public static void findTarget(Aeroflot[] aeroflot, String target){
        for (int i=0;i<aeroflot.length;i++) {
            if (aeroflot[i].target.equals(target))
                aeroflot[i].printInfo();
        }
    }

    public void printInfo(){
            System.out.println("Пунк назначения: " + target + "; " + "Номер рейса: " + flightnum + "; " +"Тип самолета: " + planetype + ";");

    }


}

