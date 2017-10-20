package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Player pl1 = new Player();
        int k = 0;
        System.out.println("Выйграшь умножается на колчесво чашек.");
        System.out.println("Начальное количество очков " + pl1.getPoints());
        System.out.println("В сколько чашек играем?");
        Scanner in = new Scanner(System.in);
        k=in.nextInt();
        while (k <= 1){
           System.out.println("Нужно ввести больше 1, тупик");
           k=in.nextInt();
        }
        Cups nap = new Cups(k);


        while (pl1.getPoints()>0) {
            System.out.println("Угадай в какой чашке из " + k);
            nap.generateCup();
            if (in.nextInt() == nap.getCups()){
                pl1.setPoints(pl1.getPoints()+1*k);
                System.out.println("Ты победил, твои очки " + pl1.getPoints());
            }
            else{
                pl1.setPoints(pl1.getPoints()-1);
                System.out.println("Ты проиграл, твои очки " + pl1.getPoints());
            }
        }
    }
}
