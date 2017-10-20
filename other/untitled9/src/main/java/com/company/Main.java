package com.company;



public class Main {

    public static void get() throws Exception{
        int rand = 0 + (int)(Math.random()*3);

        switch (rand){
            case 1:
                throw new EGOR();
            case 2:
                throw new DANILA();
            case 3:
                throw new IGOR();

        }
    }
    public static void main(String[] args) throws Exception {
	// write your code here

        Main ANTONLOH =new Main();


        for (int i = 0; i <10 ; i++) {


            try {
                ANTONLOH.get();
            } catch (EGOR e) {
                System.out.println("ВОВА кинул Егора");
            } catch (IGOR e) {
                System.out.println("ВОВА кинул Игоря");
            } catch (DANILA e) {
                System.out.println("ВОВА кинул Данилу");
            }
        }
    }
}
