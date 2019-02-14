package com.stackroute.unittest;

import java.util.*;
public class Char_Determine {

        public boolean characterDet(char ch){
            int i=0;
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the Character: ");
//            char ch = sc.next().charAt(i);

            if(ch >='a' && ch<='z'){
                System.out.println("The entered character" +" " + ch + " " +"is Small Letter");
                return true;
            }
            else if(ch>='A' && ch<='Z'){
                System.out.println("The entered character" +" " + ch + " " +"is Capital Letter");
                return true;
            }
            else if(ch>='0' && ch<='9'){
                System.out.println("The entered character" +" " + ch + " " + "is Digit");
                return true;
            }
            else{
                System.out.println("The entered character" +" " + ch + " " + "is Special Symbol");
                return true;
            }
        }

}
