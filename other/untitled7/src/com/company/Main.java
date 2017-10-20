package com.company;


public class Main {

    public static void main(String[] args) {

        Square[] arrayS = new Square[5];
        for (int i=0;i<arrayS.length;i++) {
            arrayS[i] = new Square();
            arrayS[i].setWight(i+1);
            System.out.println("  "+  arrayS[i].getWight());
            }

        String Vovan="lox";
        System.out.println(Area.calcAreaSum(arrayS));
        System.out.println(Area.maxCalcArea(arrayS));
        System.out.println(Area.minCalcArea(arrayS));

        Rectangle[] RectangleS = new Rectangle[5];
        for (int i = 0; i < RectangleS.length; i++) {
            RectangleS[i] = new Rectangle();
            RectangleS[i].setWight(i + 1);
            RectangleS[i].setHieght(i + 2);
            System.out.println("Сторона "+  RectangleS[i].getWight() +" и " + RectangleS[i].getHieght());
        }


        System.out.println(Area.calcAreaSum(RectangleS));
        System.out.println(Area.maxCalcArea(RectangleS));
        System.out.println(Area.minCalcArea(RectangleS));

    }
}




