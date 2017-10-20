package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner in = new Scanner(System.in);
        Book books = new Book(in.nextLine(),in.nextLine(),in.nextInt());
        books.info();
        ArrayList<String> catalog = new ArrayList<String>();


        try(FileWriter writer = new FileWriter("C:\\Users\\Anthony\\Desktop\\note.txt", true))
        {
            writer.write(books.bookstring()+"\r\n");

            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }


        try {
            Scanner infile = new Scanner(new File("C:\\Users\\Anthony\\Desktop\\note.txt"));
            while (infile.hasNext()) {
                catalog.add(infile.nextLine());
            }
        }
        catch(Exception e){

            System.out.println("Пустой файл");
        }
        //Book();

        System.out.println(catalog);
        //Book("123","2312",213);




    }
}
