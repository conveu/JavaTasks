package com.company;

public class Area {



    static public int calcArea(int wight,int hieght){
        return wight*hieght;
    }

    static public int calcArea(int wight){
        return wight*wight;
    }




    static public int calcAreaSum(Rectangle[] RecArray){
        int sum=0;
        for (int i=0;i<RecArray.length;i++){
            sum+=calcArea(RecArray[i].getWight(),RecArray[i].getHieght());
//            System.out.println(sum);
        }
        return sum;
    }

    static public int calcAreaSum(Square[] RecArray){
        int sum=0;
        for (int i=0;i<RecArray.length;i++){
            sum+=calcArea(RecArray[i].getWight());
//            System.out.println(sum);
        }
        return sum;
    }




    static public int maxCalcArea(Rectangle[] RecArray){
        int max = calcArea(RecArray[0].getWight(),RecArray[0].getHieght());
        int cur;
        for (int i=1;i<RecArray.length;i++){
            cur = calcArea(RecArray[i].getWight(),RecArray[i].getHieght());
            if (cur > max)
                max=cur;
        }
        return max;
    }

    static public int maxCalcArea(Square[] RecArray){
        int max = calcArea(RecArray[0].getWight());
        int cur;
        for (int i=1;i<RecArray.length;i++){
            cur = calcArea(RecArray[i].getWight());
            if (cur > max)
                max=cur;
        }
        return max;
    }



    static public int minCalcArea(Rectangle[] RecArray){
        int max = calcArea(RecArray[0].getWight(),RecArray[0].getHieght());
        int cur;
        for (int i=1;i>RecArray.length;i++){
            cur = calcArea(RecArray[i].getWight(),RecArray[i].getHieght());
            if (cur > max)
                max=cur;
        }
        return max;
    }

    static public int minCalcArea(Square[] RecArray){
        int max = calcArea(RecArray[0].getWight());
        int cur;
        for (int i=1;i>RecArray.length;i++){
            cur = calcArea(RecArray[i].getWight());
            if (cur > max)
                max=cur;
        }
        return max;
    }

}
