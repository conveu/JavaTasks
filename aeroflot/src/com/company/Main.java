package com.company;

import java.util.Scanner;

import static com.company.Aeroflot.findTarget;
import static com.company.Aeroflot.sortMass;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        //System.out.println("Введите размер массива");
        int n = 5;//in.nextInt();
        Aeroflot[] aeroflot = new Aeroflot[n];
        aeroflot[0]= new Aeroflot("MOSCOW",  22, "Passenger");
        aeroflot[1]= new Aeroflot("NEW-YORK",  12, "Passenger");
        aeroflot[2]= new Aeroflot("LONDON",  32, "Passenger");
        aeroflot[3]= new Aeroflot("SEVASTOPOL",  122, "Passenger");
        aeroflot[4]= new Aeroflot("BERLIN",  2, "Passenger");

        for(int i=0; i<n; i++) {
//            aeroflot[i] = new Aeroflot();
//            aeroflot[i].inputAero();
            aeroflot[i].printInfo();
        }
        //System.out.println(aeroflot);

        //inputAero();
        aeroflot=sortMass(aeroflot);
        System.out.println("Отсортированый масив:");
        for(int i=0; i<n; i++) {
            aeroflot[i].printInfo();
        }

        System.out.println("Введите город назначения");
        findTarget(aeroflot,in.next());
    }
}
