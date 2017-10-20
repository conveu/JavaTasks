package com.company;

import jdk.management.resource.internal.inst.FileInputStreamRMHooks;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        //InputStream iS = new FileInputStream("C:\\Users\\Anthony\\Desktop\\note.txt");
//        int i=0;
//        while (i!=-1){
//            i = iS.read();
//            System.out.println(Integer.toHexString(i));
//        }

//        OutputStream oS = new FileOutputStream("C:\\Users\\Anthony\\Desktop\\note.txt");
//        oS.write(0x2);
//        oS.flush();//Запись в конечный источник из буфера
//        oS.close();
        Reader reader = new InputStreamReader(new FileInputStream("C:\\Users\\Anthony\\Desktop\\note.txt"),"cp1251");
        //Reader reader = new InputStreamReader(iS);
        int c = 0;
        while(c!=-1){
            c = reader.read();
            System.out.print((char)c);
        }

        Writer writer = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Anthony\\Desktop\\note.txt"),"cp1251");
        writer.write("Hello Привет");
        writer.flush();


    }

}
