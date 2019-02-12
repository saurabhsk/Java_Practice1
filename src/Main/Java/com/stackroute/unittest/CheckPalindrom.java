package com.stackroute.unittest;

import java.util.*;
public class CheckPalindrom {

     public long Palindrom(long num){
            //boolean flag =false;
           long rev =0;
            long sum=0;
           long temp = num;

           while(num !=0){
               long rem = num%10;
               num = num/10;
               rev = (rev*10) + rem;
           }
           if(rev==temp) {
               System.out.println("No is Palindrom");
               //flag=true;
               while (temp != 0) {

                   long rem = temp % 10;
                   temp = temp / 10;
                   if (rem % 2 == 0) {
                       sum += rem;
                   }

               }
               if (sum > 25) {
                   System.out.println("the sum is greater than 25");
               }
               else{
                   System.out.println("the sum is less than 25");
               }
           }
           else{
               System.out.println("No is not Palindrom");
           }
           return rev;

    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number please: ");
//        long num = sc.nextLong();
//        CheckPalindrom c = new CheckPalindrom();
//        c.Palindrom(num);
//    }

}
