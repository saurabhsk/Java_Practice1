package com.stackroute.unittest;

import java.util.Scanner;

public class ReverseString {
        public String Revstr(String str){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the String");
//            String str = sc.next();
            String rev="";

            char[]input =str.toCharArray();
            for(int i=input.length-1; i>=0;i--)
                rev = rev+ input[i];
             System.out.println(rev);
              return rev;
        }

}
