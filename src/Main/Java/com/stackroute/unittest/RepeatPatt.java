package com.stackroute.unittest;

import java.util.Scanner;

public class RepeatPatt {
        public String  Pattern(String str, int num){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the String:");
//            String str = sc.next();
            //System.out.println("Enter the value:");
//            int num = sc.nextInt();
            int i=0;
            String pat = str;
            while(i<num){
                pat = pat + (str.substring(str.length()-num));
                i++;
            }
            System.out.println(pat);
            return pat;
        }

}
