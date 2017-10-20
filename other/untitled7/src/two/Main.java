package two;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {
    public static void main(String[] args) {


        AddCalculation A = new AddCalculation(1,2);
        AddCalculation B = new MultiplyCalculation(1,2);
        A.print();
        System.out.println(A.execute());
        B.print();
        System.out.println(B.execute());

    }
}
