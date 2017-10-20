package com.company.tt;

class EATISNOTHERE extends Exception {
}

class DOORISOPEN extends Exception {
}
class DOORISOPENEATISNOTHERE extends Exception {
}

public class Exception extends Throwable {
    public static void get(Microwave M)throws Exception{
        if(M.isDoorOpen==true && M.isEathere==true){
            throw new DOORISOPEN();
        }
        if(M.isEathere==false && M.isDoorOpen==false){
            throw new EATISNOTHERE();
        }

        if(M.isDoorOpen==true && M.isEathere==false){
            throw new DOORISOPENEATISNOTHERE();
        }
    }
}