import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person(1,"Grisha",27,"Programmer");
        Person p2 = new Person(2,"Grisha",27,"Builder");
        int bucketscount = 100;
        LinkedList<Person>[] buckets = new LinkedList[bucketscount];

        int p1hashCode= p1.hashCode();
        System.out.println(p1hashCode);
        int index = p1hashCode%bucketscount;
        System.out.println(index);
        buckets[index] = new LinkedList<Person>();
        buckets[index].add(p1);
        System.out.println(buckets[index].get(0).toString());

    }
}
