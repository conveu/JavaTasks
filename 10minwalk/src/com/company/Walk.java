package com.company;

public class Walk {
        public static boolean isValid(char[] walk) {
            // Insert brilliant code here
            int x=0,y=0;
            for(int i=0;i<walk.length;i++) {
                switch (walk[i]){
                    case 's':
                        y+=1;
                        break;
                    case 'n':
                        y-=1;
                        break;
                    case 'w':
                        x+=1;
                        break;
                    case 'e':
                        x-=1;
                        break;

                }
            }

            return (x==0 && y==0 && walk.length==10);
        }
    }

