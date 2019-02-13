package com.stackroute.unittest;

import java.util.Scanner;

public class GuessNo {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  set by targeter: ");
        int num = sc.nextInt();
        if(num<0 || num>100) {
            System.out.println("Targeter, Please Set a Number between 1 to 100");
            System.exit(0);
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Player, Please guess the number:");
        int a = scan.nextInt();
        if(a < 0|| a>100){
            System.out.println("Player, Please choose a Number between 1 to 100");
        }
        if(a==num){
            System.out.println("Wow!! You guessed the right number. Congrates!!");
        }
        else if(a<num){
            System.out.println(" OPPS!! You guessed the number less than the target number.");
        }
        else{
            System.out.println("OOPS!! You guessed the number greater than the target number");
        }

        while(a!=num){
            System.out.println("Player, Please guess the number again:");
            a = scan.nextInt();
            if(a==num){
                System.out.println("Wow!! You guessed the right number. Congrates!!");
            }
            else if(a<num){
                System.out.println(" OPPS!! You guessed the number less than the target number.");
            }
            else{
                System.out.println("OOPS!! You guessed the number greater than the target number");
            }
        }
    }
}
