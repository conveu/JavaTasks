package com.company.tt;

public class Eat {
    boolean eatstate;

    public Eat(){
        eatstate = false;
    }

    public void readyEat(){
        this.eatstate=true;
        System.out.println("УРА ЕДА ГОТОВА");
    }
}
