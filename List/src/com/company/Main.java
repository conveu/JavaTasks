package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here


//        while(true) {

            int flag=0;

            Integer[] mas = {0,0,0,2,3,4,1,1,2,3,4,5,6,7,1,2,3,4,5,6,7};
            int a = 0;
            for(int i=0;i<mas.length;i++){
                for(int j=0;j<mas.length;j++) {
                    if(i!=j&&mas[j]!=null) {
                        if (mas[i] == mas[j]){
                            mas[j] = null;
                            if (flag==0) {
                                flag = 1;

                            }
                        }
                    }
                }
                flag=0;
                //System.out.println(mas[i]);
            }
        a=0;
        for(int i=0;i<mas.length;i++) {
                if (mas[i]!=null) {
                    a++;
                }
            }

            System.out.println("Уникальных "+a);




//            ArrayList<String> list = new ArrayList<String>();
//            System.out.println("Что бы ввести строку нажмите 1");
//            System.out.println("Что бы получить элемент нажмите 2");
//            int a=in.nextInt();
//            String line = new String();
//            int want=0;
//
//
//
//            switch(a){
//                case 1:
//                    System.out.println("Введите строку");
//                    boolean add = list.add(in.next());
//                    System.out.println(list);
//                    //System.out.println(list.get(want));
//                    break;
//                case 2:
//                    System.out.println("Введите индекс элемента");
//                    System.out.println(list.get(in.nextInt()));
//                    break;
//            }


            /*
            for (int i = 0; i < 5; i++) {
                System.out.println("Введите строку № " + i);
                list.add(in.nextLine());
            }

            System.out.println("Введите индекс");
            System.out.println(list.get(in.nextInt()));
*/
        }

    }


