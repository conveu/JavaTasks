import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        InputStream stream = new FileInputStream("C:\\Users\\Anthony\\Desktop\\note.txt");
        OutputStream ostream = new FileOutputStream("C:\\Users\\Anthony\\Desktop\\note1.txt");


        InputStream stream1 = new FileInputStream("C:\\Users\\Anthony\\Desktop\\note1.txt");
        OutputStream ostream1 = new FileOutputStream("C:\\Users\\Anthony\\Desktop\\note2.txt");

        crypt(stream,ostream);
        decrypt(stream1,ostream1);

    }
        public static void crypt(InputStream stream,OutputStream ostream) throws IOException {
            //StreamIn ins = new StreamIn(stream);
            //StreamOut outs = new StreamOut(ostream);
            InputStream ins = stream;
            OutputStream outs= ostream;
            while (true) {

                int sym = ins.read();
                if (sym == -1)
                    break;
                outs.write(sym+1);
                System.out.println(sym);
                //outs.write();
            }
        }

        public static void decrypt(InputStream stream1,OutputStream ostream1) throws IOException {
    //StreamInd ins1 = new StreamInd(stream1);
    //StreamOutd outs1 = new StreamOutd(ostream1);
    InputStream ins1=stream1;
    OutputStream outs1=ostream1;
        while(true) {

            int sym = ins1.read();
            if(sym==-1)
                break;
            outs1.write(sym-1);
            System.out.println(sym);
            //outs.write();
        }
        //stream.close();
        //ostream.close();


    }




}