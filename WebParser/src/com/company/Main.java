package com.company;

import org.jsoup.Jsoup;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
public class Main {

    public static void main(String[] args) throws IOException {
       int index=0;
       String parshead="class=\"post__title_link\">";
       String parstail="</a>";
       ArrayList<String> headers = new ArrayList<>();
        int i = 0;
        int j = 1;
        FileWriter tofile = new FileWriter("C:\\Users\\Anthony\\Desktop\\note.txt");
        try {
            while (true) {
                String catalog = Jsoup.connect("https://habrahabr.ru/all/page" + j).get().html();
                while (true) {
                    index = catalog.indexOf(parshead);
                    if (index == -1)
                        break;
                    catalog = catalog.substring(index + parshead.length());
                    index = catalog.indexOf(parstail);
                    headers.add(catalog.substring(0, index));
                    tofile.write(headers.get(i) + "\r\n");
                    tofile.append('\n');
                    tofile.flush();
                    catalog = catalog.substring(headers.get(i).length() + parstail.length());
                    i++;
                }
                j++;
            }
        }
        catch(IOException ex){
        }
        for (j = 0; j < headers.size(); j++) {
            System.out.println(headers.get(j));
        }




    }
}
