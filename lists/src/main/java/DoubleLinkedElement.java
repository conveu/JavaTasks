/**
 * Created by mikle on 10/16/17.
 */
public class DoubleLinkedElement {
    int data;
    DoubleLinkedElement next;
    DoubleLinkedElement previous;

    public DoubleLinkedElement(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}
