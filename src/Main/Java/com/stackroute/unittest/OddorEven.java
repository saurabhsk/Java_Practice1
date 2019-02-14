package com.stackroute.unittest;

import java.util.*;
public class OddorEven {

    public String tomJerry(int num){

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int num = sc.nextInt();

        if( num%2==0 && num>=20 && num<=30){
            return ("Jerry");
        }
        else if(num%2!=0 && num>=20 && num<=30){
            return ("Tom");
        }
        else{
            return("Invalid Input!! Please Enter number between 20 and 30");
        }
    }
}
