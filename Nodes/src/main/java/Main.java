import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Main {

    public static void main(String[] args) {

//        List l1 = new List();
//        l1.add("efdsfsdfsd");
//        l1.add("dsfwrwe");
//        l1.add("sdfsdfsdf");
//        l1.add(312314);
//
//        l1.printList();
//
//        Scanner in = new Scanner(System.in);
//
////        System.out.println();
////        System.out.println("Введите номер элемента для вывода на экран");
////        l1.printIndex(in.nextInt());
//
//
////        System.out.println();
////        System.out.println("Введите номер элемента для удаления");
////        l1.deleteIndex(in.nextInt());
////        l1.printList();
//
//        System.out.println();
//        System.out.println("Введите элемент и номер индекса куда его всунуть");
//        l1.addIndex(in.next(),in.nextInt());
//        l1.printList();
//
//        l1.printLenght();
        List<String> list = new List();
        list.addLast("1"); //0
        list.addLast("2"); //1
        list.addLast("3"); //2
        list.addLast("4"); //3
        list.addLast("5"); //4
        list.remove(2);
        String actual =list.get(2);
        String expected = "4";
        list.printList();
        System.out.println(actual);
    }
}
