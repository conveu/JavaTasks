/**
 * Created by mikle on 10/16/17.
 */
public class DoubleListTests extends ListTests {
    @Override
    public List getEmptyList() {
        return new DoubleLinkedList();
    }
}
