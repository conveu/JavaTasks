package com.company;

public class Computer implements Player {


    public String playername;
    public int playermove;
    private int playerpoint;


    Computer(){
       playername="MEGATRONVOVA";
       playerpoint=0;
    }

    @Override
    public String getName(){
        return this.playername;
    }

    @Override
    public int getMove(){
        final int min=1;
        final int max=3;
        int range = (max - min) + 1;
        this.playermove=(int)(Math.random() * range) + min;
        return 0;
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
