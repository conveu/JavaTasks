package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Human implements Player {


    public String playername;
    public int playermove;
    private int playerpoint;

    Human(){
        this.playername = "ANANAIMUS";
        this.playerpoint=0;
    }

    @Override
    public String getName(){
        System.out.print("Введите имя игрока: ");
        Scanner in = new Scanner(System.in);
        this.playername = in.nextLine();
        return this.playername;
    }

    @Override
    public int getMove(){

        this.playermove = 0;


        while(this.playermove <= 0 || this.playermove>3) {
            try {
                System.out.println("Введите ход: 1 - камень, 2 - ножницы, 3 - бумага");
                Scanner in = new Scanner(System.in);
                this.playermove = in.nextInt();
                if (this.playermove <= 0 || this.playermove > 3){
                    System.out.println("Такого хода нет ИДИОТ");
                    this.playermove = 0;
                }
            } catch (Exception e) {
                System.out.println("Тупой хода нет такого");
                this.playermove = 0;
            }

        }
//            while(this.playermove <= 0 || this.playermove>3) {
//            System.out.println("Введите ход: 1 - камень, 2 - ножницы, 3 - бумага");
//            this.playermove = in.nextInt();
//            if (this.playermove <= 0 || this.playermove > 3) {
//                System.out.println("Такого хода нет ИДИОТ");
//            }
//        }
        return this.playermove;
    }

    @Override
    public void addPoint(){
        this.playerpoint++;
    }

    @Override
    public int getPoint(){
        return this.playerpoint;
    }


}
