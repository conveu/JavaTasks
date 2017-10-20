package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Computer player = new Computer();
        Computer ai = new Computer();
        Game start= new Game(player,ai);
//        for (int i = 0; i <11 ; i++) {
//
//
//        System.out.println(ai.getMove());}

        start.play();

    }
}
