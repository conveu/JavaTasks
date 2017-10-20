


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class tests {

    @Test
    public void addLastTest(){
        List<String> list = new List();
        list.addLast("42");
        String actual = list.get(0);
        String expected = "42";

        assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        List<String> list = new List();
        list.addLast("1"); //0
        list.addLast("2"); //1
        list.addLast("3"); //2
        list.addLast("4"); //3
        list.addLast("5"); //4
        list.remove(2);
        String actual =(String) list.get(2);
        String expected = "4";

        assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest(){
        List list = new List();
        boolean actual = list.isEmpty();
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void isNotEmptyTest(){
        List list = new List();
        list.addLast(38);
        boolean actual = list.isEmpty();
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void countTest(){
        List list = new List();
        list.addLast(38);
        list.addLast(3);
        list.addLast(15);
        int actual = list.count();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void emptyListCountTest(){
        List list = new List();
        int actual = list.count();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void getTest(){
        List<String> list = new List();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        String actual = list.get(3);
        String expected = "4";

        assertEquals(expected, actual);
    }

    @Test
    public void addTest(){
        List<String> list = new List();
        list.addLast("1"); //index 0
        list.addLast("2"); //index 1
        list.addLast("3"); //index 2
        list.addLast("4"); //index 3
        list.addLast("5"); //index 4
        list.add(2, "100500");
        String actual = list.get(2);
        String expected = "100500";

        assertEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeWhenEmpty(){
        List list = new List();
        list.remove(0);
    }

    @Test(expected = java.lang.NullPointerException.class)
    public void removeFirst(){
        List<String> list = new List();
        list.addLast("111");
        list.remove(0);
        list.get(0);
    }

    @Test(expected = java.lang.NullPointerException.class)
    public void removeOutOfRange(){
        List list = new List();
        list.addLast(123);
        list.remove(100);
    }


    @Test
    public void addFirst(){
        List<String> list = new List();
        list.addLast("42");
        list.add(0, "111");

        String actual = (String) list.get(0);
        String expected = "111";
        assertEquals(expected, actual);
    }
}
