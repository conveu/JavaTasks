package com.company;

public class Cups {
    private int numcup;
    private int cup;

    public Cups(int num){
        this.numcup=num;
        this.cup=0;

    }

    public int getCups(){
        return this.numcup;
    }

    public void setCups(int j){
        this.cup = j;
    }

    public int randCup(){
        final int min=0;
        final int max=this.numcup;
        int range = (max - min) + 0;
        return (int)(Math.random() * range) + min;
    }

    public void generateCup(){
        this.setCups(this.randCup());

    }
}
