package com.company.tt;

public class Microwave {

    boolean isDoorOpen;
    boolean isEathere;


    Microwave(){
       isDoorOpen = false;
       isEathere = false;
    }

    public void openDoor(){
        this.isDoorOpen = true;
    }

    public void closeDoor(){
        this.isDoorOpen = false;
    }

    public void putEat(){
        if(this.isDoorOpen==true)
        this.isEathere = true;
        else{
            System.out.println("Ты идиот? дверь закрыта");
        }
    }

    public void getEat(){
        this.isEathere = false;
    }

    public void makeEat(Eat eat){
        eat.eatstate = true;
    }

    public void turnOnMicrowave(Microwave M, Eat eat) throws Exception {
        Exception exp = new Exception();

        try{
            exp.get(M);
            if ((this.isEathere == true) && (this.isDoorOpen == false))
            {
                System.out.println("АВТОБОТЫ ГОТОВИМ ЕДУ");
                eat.readyEat();
            }
        }catch (DOORISOPEN e) {
            System.out.println("Дверь открыта");
        }catch (EATISNOTHERE e) {
        System.out.println("Еды нет");}
        catch (DOORISOPENEATISNOTHERE e) {
            System.out.println("Дверь открыта и еды нет");}
    }

    public void getInfo(){
        System.out.println("Door open? " + this.isDoorOpen + ". Eat is HERE? " + this.isEathere);
    }
}

