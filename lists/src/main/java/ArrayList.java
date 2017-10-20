/**
 * Created by mikle on 10/16/17.
 */
public class ArrayList implements List {
    private int[] elements;
    private int count;

    public ArrayList() {
        elements = new int[10];
        count = 0;
    }

    public int get(int index) {
        return elements[index];
    }

    public void addLast(int newNumber) {
        elements[count] = newNumber;
        count += 1;
    }

    public void add(int index, int newNumber) {
        elements[index]=newNumber;
    }

    public void remove(int index) {
        if(index>count){
            throw new IndexOutOfBoundsException();
        }else
        if(count==0){
            throw new IndexOutOfBoundsException();
        }else
        {for (int i = index; i < elements.length-1; i++) {
            elements[i]=elements[i+1];}
        }

    }

    public int count() {
        return count;
    }

    public boolean isEmpty() {
        if(count==0)
           return true;
        else
            return false;
    }



}

