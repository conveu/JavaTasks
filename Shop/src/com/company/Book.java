package com.company;

import static java.lang.System.out;

public class Book {

    public String name;
    public String author;
    public int year;



    Book(){
        name = "-";
        author = "-";
        year = 0;
    }


    public void info(){
        System.out.printf("%s,'%s' %d\n", name, author, year);

    }

    public String bookstring(){
        String bookinfo = name + ";" + author + ";" + year + ";";
        return(bookinfo);}

    Book(String name, String author, int year){

        this.name = name;
        this.author = author;
        this.year = year;

    }


}
