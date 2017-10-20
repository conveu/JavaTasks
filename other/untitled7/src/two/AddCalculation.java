package two;

public class AddCalculation {
    double x,y;

    AddCalculation(double x, double y){
        this.x=x;
        this.y=y;
    }

    public AddCalculation(){
        this.x=0;
        this.y=0;
    }


    public double execute(){
        return this.x+this.y;
    }

    public void print(){
        System.out.println(x + " + " + y);
    }
}
