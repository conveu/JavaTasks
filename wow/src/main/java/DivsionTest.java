import org.junit.Test;

import static org.junit.Assert.*;
public class DivsionTest {


    @Test
    public void testDivideSimple(){
        Division test = new Division();
        double result = test.divide(4,2);
        assertTrue(2 == result);
    }

    @Test
    public void testDivideSimpleOne(){
        Division test = new Division();
        double result = test.divide(4,1);
        assertTrue(4 == result);


    }


}
