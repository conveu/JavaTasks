package com.company.tt;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Microwave megatron = new Microwave();
        boolean checker = true;
        while (checker) {
            try{
                megatron.getInfo();
                Scanner in = new Scanner(System.in);
                System.out.println("Выбери действие: 1 - открыть дверь, 2 - закрыть дверь, 3 - положить еду, 4 - выйти, 5 - ВКЛЮЧИТЬ МИКРОВОЛНОВКУ");
                int turn = in.nextInt();
                if(turn>0&&turn<=5){
                    switch (turn){
                        case 1: {
                            megatron.openDoor();
                            break;
                        }
                        case 2: {
                            megatron.closeDoor();
                            break;
                        }
                        case 3:{
                            megatron.putEat();
                            break;
                        }
                        case 4:{
                            checker = false;
                            break;
                        }
                        case 5:{
                            Eat eat = new Eat();
                            megatron.turnOnMicrowave(megatron, eat);
                        }

                    }
                }
                else{
                    System.out.println("Походе ты ошибся");
                }

            } catch (java.lang.Exception E){
                System.out.println("Ты правда такой тупой?");
            }


        }
    }
}
