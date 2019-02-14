package com.stackroute.unittest;

import java.util.*;
public class Const_Vow {

        public boolean consOrvow(String wrd) {

//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the word");
//            String wrd = sc.next();
            for (int i = 0; i < wrd.length(); i++) {
                if((wrd.charAt(i)>=48 && wrd.charAt(i)<=57) || (wrd.charAt(i)>=58 && wrd.charAt(i)<=64) || (wrd.charAt(i)>=91 && wrd.charAt(i)<=95))
                {
                    System.out.println("Please Enter Alphabet only.");
                    return false;
                }
            }

            for (int i = 0; i < wrd.length(); i++) {

                  if (wrd.charAt(i) == 'a' || wrd.charAt(i) == 'A' || wrd.charAt(i) == 'e' || wrd.charAt(i) == 'E' || wrd.charAt(i) == 'i' || wrd.charAt(i) == 'I' || wrd.charAt(i) == 'o' || wrd.charAt(i) == 'O' || wrd.charAt(i) == 'u' || wrd.charAt(i) == 'U')
                  {
                      System.out.println("The Entered Character " + wrd.charAt(i) + " is Vowel");

                }
                  else {
                      System.out.println("The Entered Character " + wrd.charAt(i) + " is Consonent");
                }
            }
            return true;
        }
}

