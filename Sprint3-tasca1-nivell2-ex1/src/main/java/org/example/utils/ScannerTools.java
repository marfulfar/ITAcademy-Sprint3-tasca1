package org.example.utils;

import java.util.Scanner;


public class ScannerTools {

    private static Scanner sc = new Scanner(System.in);


        public static void cleanBuffer(){
            sc.next();
        }

        public static String scanString(String sentence){
            System.out.println(sentence);
            String phrase = sc.nextLine();
            return phrase;
        }

        public static Integer scanInt(String sentence){
            System.out.println(sentence);
            int number = sc.nextInt();
            return number;
        }

        public static Float scanFloat(String sentence){
            System.out.println(sentence);
            float number = sc.nextFloat();
            return number;
        }

        public static char scanChar0(String sentence){
            System.out.println(sentence);
            char character = sc.next().charAt(0);
            return character;
        }

        public static char scanCharAt(String sentence, int pos){
            System.out.println(sentence);
            char character = sc.next().charAt(pos);
            return character;
        }

        public static boolean scanBoolean(String sentence){
            boolean isYes=false;
            char firstChar = scanChar0(sentence+"\nYes"+"\nNo");
            if (firstChar=='y' || firstChar=='Y'){isYes=true;}
            return isYes;
        }

}

