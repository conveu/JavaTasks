package two;

public class MultiplyCalculation extends AddCalculation {

    public MultiplyCalculation(double x, double y){
        super(x,y);
    }

    public MultiplyCalculation(){
        super();
    }

    public double execute(){
        return this.x*this.y;
    }
    public void print(){
        System.out.println(x + " * " + y);
    }
}
