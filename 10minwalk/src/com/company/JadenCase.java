package com.company;

import java.util.Arrays;

public class JadenCase {
    public  String toJadenCase(String phrase) {
        String result=null;
        if (phrase!=null){
            if(phrase.length()!=0) {
                result="";

            String[] phraseschar;
            phraseschar = phrase.split("");
//        for(int i=0; i<phrase.length()-1; i++)
//            System.out.println(phraseschar[i]);

            boolean check = true;
            for (int i = 0; i < phrase.length() - 1; i++) {

                if (i == 0 && false != phraseschar[i].matches("[a-z]+"))
                    phraseschar[i] = phraseschar[i].toUpperCase();


                if (i != phrase.length() && phraseschar[i].equals(" ")) {

                    if (false != phraseschar[i + 1].matches("[a-z]+"))
                        phraseschar[i + 1] = phraseschar[i + 1].toUpperCase();
                }

            }

            for (String str : phraseschar)
                result = result + str;
        }

        }
        else
            result=null;

        return result;


}}
