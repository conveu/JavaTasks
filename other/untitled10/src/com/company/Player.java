package com.company;

public class Player {
    private int points;

    public Player(){
        setPoints(10);
    }

    public void setPoints(int i){
        this.points=i;
    }
    public int getPoints(){
        return this.points;
    }


}
