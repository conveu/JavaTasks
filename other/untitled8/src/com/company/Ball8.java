package com.company;



public class Ball8 {
    public enum Choose{
        YES,
        NO,
        MAYBE,
        LATER,
        SOON,
        NEVER,
        VOVA;
    }

    public void getRand(){
        int rand = 0+(int)(Math.random()*108);

        if(rand>0 && rand<=15)
            System.out.println(Ball8.Choose.MAYBE);
        if(rand>15 && rand<=30)
            System.out.println(Ball8.Choose.NO);
        if(rand>30 && rand<=60)
            System.out.println(Ball8.Choose.YES);
        if(rand>60 && rand<=75)
            System.out.println(Ball8.Choose.LATER);
        if(rand>75 && rand<=105)
            System.out.println(Ball8.Choose.SOON);
        if(rand>105 && rand<=107)
            System.out.println(Ball8.Choose.VOVA);
    }
}
