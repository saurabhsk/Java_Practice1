package com.stackroute.unittest;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        String n = sc.next();
        //String num=n;
        int temp = 0, sum = 0;
        char[] arr = n.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = (char) temp;
                }
        }
        System.out.println(arr);
        int numbers= Integer.parseInt(new String(arr));
        while(numbers!=0){
            int rem = numbers%10;
            numbers=numbers/10;
            if(rem%2==0) {
                sum += rem;
            }
        }
        System.out.println(sum);
        if (sum > 15) {
            System.out.println("You are True.The Sum is greater than 15");
        }
        else{
            System.out.println("You are False.The sum is less than 15");
        }
//
        }
        //System.out.println(sum);
    }



