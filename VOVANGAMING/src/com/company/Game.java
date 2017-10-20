package com.company;

import java.util.Scanner;

public class Game {
    private Computer Player1;
    private Computer AI;

    Game(Computer Player, Computer com)
    {
        Player1=Player;
        AI=com;
    }

    public void play(){

        int gcont=1;
        Player1.getName();
        AI.getName();
        while (gcont==1){
            Player1.getMove();
            AI.getMove();
            //1 - камень, 2 - ножницы, 3 - бумага
            if(AI.playermove==1 && Player1.playermove==2 || AI.playermove==2 && Player1.playermove==3 || AI.playermove==3 && Player1.playermove==1)
                AI.addPoint();
            else if(AI.playermove==Player1.playermove)
                System.out.println("НИЧЬЯ");
                else
                    Player1.addPoint();
            System.out.println("СЧЕТ: " + AI.playername + " " + AI.getPoint() + ":" + Player1.getPoint() + " " + Player1.playername);



            gcont=1;
            try {
                Thread.sleep(100);                 //1000 milliseconds is one second.
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            while(gcont!=0 && gcont!=1) {
                        try {
                    Scanner in = new Scanner(System.in);
                    System.out.println("ПРОДОЛЖАЕМ??? 1-Да 0-Нет");
                    gcont=in.nextInt();
                    if(gcont!=0 && gcont!=1){
                    System.out.println("Некорректный ответ идиот. Твоя последняя попытка. ПРОДОЛЖАЕМ??? 1-Да 0-Нет");
                    gcont = in.nextInt();
                    }

                } catch (Exception e) {
                    System.out.println("Ты еще тупее чем я думал");

                }

            }





        }
        System.out.println("Спасибо за игру");



    }
}
