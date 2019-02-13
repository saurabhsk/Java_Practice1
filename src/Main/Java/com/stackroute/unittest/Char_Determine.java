package com.stackroute.unittest;

import java.util.*;
public class Char_Determine {

        public static void main(String [] args){
            int i=0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Character: ");
            char ch = sc.next().charAt(i);

            if(ch >='a' && ch<='z'){
                System.out.println("The entered character" +" " + ch + " " +"is Small Letter");
            }
            else if(ch>='A' && ch<='Z'){
                System.out.println("The entered character" +" " + ch + " " +"is Capital Letter");
            }
            else if(ch>='0' && ch<='9'){
                System.out.println("The entered character" +" " + ch + " " + "is Digit");
            }
            else{
                System.out.println("The entered character" +" " + ch + " " + "is Special Symbol");
            }
        }

}
