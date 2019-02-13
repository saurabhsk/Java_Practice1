package com.stackroute.unittest;

import java.util.*;
public class OddorEven {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if( num%2==0 && num>=20 && num<=30){
            System.out.println("Jerry");
        }
        else if(num%2!=0 && num>=20 && num<=30){
            System.out.println("Tom");
        }
        else{
            System.out.println("Invalid Input!! Please Enter number between 20 and 30");
        }
    }
}
